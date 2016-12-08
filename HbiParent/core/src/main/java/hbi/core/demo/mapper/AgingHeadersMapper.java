package hbi.core.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.AgingHeaders;

public interface AgingHeadersMapper extends Mapper<AgingHeaders>{
	
	public AgingHeaders selectByName(AgingHeaders agingHeaders);

	int insertAgingHeaders(AgingHeaders agingHeaders);
    
    int updateAgingHeaders(AgingHeaders agingHeaders);
    
    int deleteAgingHeaders(AgingHeaders agingHeaders);
}
