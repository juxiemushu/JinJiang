package hbi.core.demo.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hbi.core.demo.dto.AgingLines;

public interface IAgingLinesService extends IBaseService<AgingLines>, ProxySelf<IAgingLinesService>{

	public List<AgingLines> batchUpdate(IRequest requestContext,@StdWho List<AgingLines> agingLinesList);
}
