package hbi.core.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.AgingLines;
import hbi.core.demo.mapper.AgingLinesMapper;
import hbi.core.demo.service.IAgingLinesService;

@Service
public class AgingLinesServiceImpl extends BaseServiceImpl<AgingLines> implements IAgingLinesService {
	@Autowired
    private AgingLinesMapper agingLinesMapper;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
    public List<AgingLines> batchUpdate(IRequest requestContext,@StdWho List<AgingLines> agingLinesList) {
        for (AgingLines agingLines : agingLinesList) {
            if (agingLines.get__status() != null) {
                switch (agingLines.get__status()) {
                case DTOStatus.ADD:
                	agingLinesMapper.insertAgingLines(agingLines);
                    break;
                default:
                    break;
                }
            }
        }
        return agingLinesList;
    }
	
}
