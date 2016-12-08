package hbi.core.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.Aging;

public interface AgingMapper extends Mapper<Aging> {

	public List<Aging> selectByAging(Aging aging);
	
    public List<Aging> selectByAgingName(Aging aging);
    
}
