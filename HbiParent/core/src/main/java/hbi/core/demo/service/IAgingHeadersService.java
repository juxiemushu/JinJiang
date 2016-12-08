package hbi.core.demo.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hbi.core.demo.dto.AgingHeaders;

public interface IAgingHeadersService extends IBaseService<AgingHeaders>, ProxySelf<IAgingHeadersService> {

	public AgingHeaders selectByName(@StdWho AgingHeaders agingHeaders);
	
	boolean insertAgingHeaders(IRequest requestContext,@StdWho AgingHeaders agingHeaders);
    
    public List<AgingHeaders> insertAging(IRequest requestContext,@StdWho List<AgingHeaders> agingHeadersList);
    
    public List<AgingHeaders> deleteAgingHeaders(IRequest requestContext,@StdWho  List<AgingHeaders> agingHeadersList);
}
