package hbi.core.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.Entites;
import hbi.core.demo.dto.OverdueRule;

public interface OverdueRuleMapper extends Mapper<OverdueRule> {

	public List<OverdueRule> selectByOverdueRule(OverdueRule overdueRule);
	
	public List<OverdueRule> selectRuleName(OverdueRule overdueRule);
	
	int insertOverdueRule(OverdueRule overdueRule);
	
	int updateOverdueRule(OverdueRule overdueRule);
	
	int deleteOverdueRule(OverdueRule OverdueRule);
	
	public List<Entites> selectEntites(Entites entites);
	
}
