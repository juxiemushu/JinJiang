package hbi.core.demo.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hbi.core.demo.dto.Entites;
import hbi.core.demo.dto.OverdueRule;

public interface IOverdueRuleService extends IBaseService<OverdueRule>, ProxySelf<IOverdueRuleService> {

	public List<OverdueRule> selectByOverdueRule(IRequest requestContext , OverdueRule overdueRule , int page , int pagesize);
	
	public List<OverdueRule> selectRuleName(OverdueRule overdueRule);
	
	public List<OverdueRule> batchUpdate(IRequest contextPath ,@StdWho  List<OverdueRule> overdueRules);

	public List<Entites> selectEntites(IRequest requestContext , Entites entites , int page , int pagesize);

	public void deleteRule(OverdueRule overdueRule);
}
