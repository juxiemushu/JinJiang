package hbi.core.demo.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hbi.core.demo.dto.Aging;
import hbi.core.demo.dto.AgingHeaders;

public interface IAgingService extends IBaseService<Aging>, ProxySelf<IAgingService> {
	
	public List<Aging> selectByAging(IRequest requestContext, Aging aging, int page, int pagesize);
    
	public List<Aging> selectByAgingName(IRequest requestContext, Aging aging, int page, int pagesize);
   
	public List<Aging> selectByAging(Aging aging);

}
