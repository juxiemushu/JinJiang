package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.AgingLines;

public interface AgingLinesMapper extends Mapper<AgingLines> {

	int insertAgingLines(AgingLines agingLines);
    
    int updateAgingLines(AgingLines agingLines);
    
    int deleteAgingLines(AgingLines agingLines);
}
