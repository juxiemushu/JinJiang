package hbi.core.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.Entites;
import hbi.core.demo.dto.OverdueRule;
import hbi.core.demo.mapper.OverdueRuleMapper;
import hbi.core.demo.service.IOverdueRuleService;

@Service
public class OverdueRuleServiceImpl extends BaseServiceImpl<OverdueRule> implements IOverdueRuleService {

	@Autowired
	private OverdueRuleMapper overdueRuleMapper;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
	public List<OverdueRule> selectByOverdueRule(IRequest contextPath, OverdueRule overdueRule, int page,
			int pagesize) {
		PageHelper.startPage(page, pagesize);
		return overdueRuleMapper.selectByOverdueRule(overdueRule);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<OverdueRule> batchUpdate(IRequest contextPath, List<OverdueRule> overdueRules) {
		for(OverdueRule o : overdueRules){
			if(o.get__status() != null){
				switch(o.get__status()){
				case DTOStatus.ADD:
					overdueRuleMapper.insertOverdueRule(o);
					break;
				case DTOStatus.UPDATE:
					overdueRuleMapper.updateOverdueRule(o);
					break;
				default:
					break;
				}
			}
		}
		return overdueRules;
	}

	@Override
	public List<Entites> selectEntites(IRequest requestContext, Entites entites, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return overdueRuleMapper.selectEntites(entites);
		
	}

	@Override
	public List<OverdueRule> selectRuleName(OverdueRule overdueRule) {
		return overdueRuleMapper.selectRuleName(overdueRule);
	}

	@Override
	public void deleteRule(OverdueRule overdueRule) {
		overdueRuleMapper.deleteOverdueRule(overdueRule);	
	}
	
	

}
