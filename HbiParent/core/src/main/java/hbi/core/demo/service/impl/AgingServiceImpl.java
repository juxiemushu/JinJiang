package hbi.core.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.Aging;
import hbi.core.demo.dto.AgingHeaders;
import hbi.core.demo.dto.AgingLines;
import hbi.core.demo.mapper.AgingHeadersMapper;
import hbi.core.demo.mapper.AgingLinesMapper;
import hbi.core.demo.mapper.AgingMapper;
import hbi.core.demo.service.IAgingService;

@Service
public class AgingServiceImpl extends BaseServiceImpl<Aging> implements IAgingService {
	@Autowired
    private AgingMapper agingMapper;
	

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
	public List<Aging> selectByAging(IRequest requestContext, Aging aging, int page, int pagesize){
			PageHelper.startPage(page, pagesize);
			return agingMapper.selectByAging(aging);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
	public List<Aging> selectByAging(Aging aging){
			return agingMapper.selectByAging(aging);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
	public List<Aging> selectByAgingName(IRequest requestContext, Aging aging, int page, int pagesize){
			PageHelper.startPage(page, pagesize);
			return agingMapper.selectByAgingName(aging);
	}
	
	
}
