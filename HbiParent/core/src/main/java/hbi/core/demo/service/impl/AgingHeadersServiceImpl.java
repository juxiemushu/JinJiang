package hbi.core.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.AgingHeaders;
import hbi.core.demo.dto.AgingLines;
import hbi.core.demo.mapper.AgingHeadersMapper;
import hbi.core.demo.mapper.AgingLinesMapper;
import hbi.core.demo.service.IAgingHeadersService;

@Service
public class AgingHeadersServiceImpl extends BaseServiceImpl<AgingHeaders> implements IAgingHeadersService {
	
    @Autowired
    private AgingHeadersMapper agingHeadersMapper;
    
    @Autowired
    private AgingLinesMapper agingLinesMapper;
    
    @Override
	@Transactional(propagation = Propagation.SUPPORTS)
    public AgingHeaders selectByName(@StdWho AgingHeaders agingHeaders){

    	return agingHeadersMapper.selectByName(agingHeaders);
    }
    

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
    public boolean insertAgingHeaders(IRequest requestContext,@StdWho AgingHeaders agingHeaders) {
		
		
		List<AgingLines> agingLinesList = agingHeaders.getAgingLinesList();

		agingHeadersMapper.insertAgingHeaders(agingHeaders);
        
		AgingHeaders ah = agingHeadersMapper.selectByName(agingHeaders);
//        System.err.println(ah);
        Long agingHeaderId = ah.getAgingHeaderId();
        	
 //       System.err.println(agingHeaderId);
    	 for (AgingLines agingLines : agingLinesList) {
         	agingLines.setAgingHeaderId(agingHeaderId); 	
 //        	System.err.println(agingLines);
         	agingLinesMapper.insertAgingLines(agingLines);
         }
        

        return true;
    }
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
    public List<AgingHeaders> insertAging(IRequest requestContext,@StdWho List<AgingHeaders> agingHeadersList) {

		
        for (AgingHeaders agingHeaders : agingHeadersList) {
        	agingHeadersMapper.updateAgingHeaders(agingHeaders);
        	
        	List<AgingLines> agingLinesList = agingHeaders.getAgingLinesList(); 	
       // 	Long agingHeaderId = agingHeaders.getAgingHeaderId();
            for (AgingLines agingLines : agingLinesList) {
      //      	agingLines.setAgingHeaderId(agingHeaderId);
                if (agingLines.get__status() != null) {
                    switch (agingLines.get__status()) {
                    case DTOStatus.ADD:	
                    	agingLinesMapper.insertAgingLines(agingLines);
                        break;
                    case DTOStatus.UPDATE:
                    //	agingLinesMapper.updateAgingLines(agingLines);                        
                    	break;
                    default:
                        break;
                    }
                }
            }
        }

        return agingHeadersList;
    }

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
    public List<AgingHeaders> deleteAgingHeaders(IRequest requestContext,@StdWho List<AgingHeaders> agingHeadersList) {
		for (AgingHeaders agingHeaders : agingHeadersList) {
        	//agingMapper.deleteAgingHeader(aging);
        	List<AgingLines> agingLinesList = agingHeaders.getAgingLinesList();
        	if(agingLinesList.size() == 0){
        		agingHeadersMapper.deleteAgingHeaders(agingHeaders);
        	}else{
        		for(AgingLines agingLines:agingLinesList){
        		//	agingLines.setAgingHeaderId(agingHeaders.getAgingHeaderId());
        			agingLinesMapper.deleteAgingLines(agingLines);
        		}
        	}
        }
        return agingHeadersList;
    }	
}
