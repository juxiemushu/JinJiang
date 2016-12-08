package hbi.core.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import groovy.ui.Console;
import hbi.core.demo.dto.Aging;
import hbi.core.demo.dto.AgingHeaders;
import hbi.core.demo.service.IAgingHeadersService;
import hbi.core.demo.service.IAgingLinesService;
import hbi.core.demo.service.IAgingService;

@RequestMapping(value="/calculation/agingHeaders")
@Controller
public class AgingHeadersController extends BaseController{

	@Autowired
    private IAgingHeadersService agingHeadersService;
    

    
    @RequestMapping(value = "/insert", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public ResponseData insertAgingHeaders(@RequestBody List<AgingHeaders> agingHeadersList, BindingResult result, HttpServletRequest request){
        getValidator().validate(agingHeadersList, result);
        if (result.hasErrors()) {
            ResponseData rd = new ResponseData(false);
            rd.setMessage(getErrorMessage(result, request));
            return rd;
        }
        IRequest requestContext = createRequestContext(request);
        
        AgingHeaders agingHeaders = null;
        
        if(agingHeadersList.size() > 0){
        	agingHeaders = agingHeadersList.get(0);
        }
        
        
       
       
     //   List<Aging> agings = agingService.selectByAging(aging);
        
        if(agingHeaders.getAgingName()==null){
		    ResponseData rd = new ResponseData(false);
	        rd.setMessage("账龄名称不能为空");
	        return rd;
        }
        
        if( agingHeadersService.selectByName(agingHeaders) != null){
		    ResponseData rd = new ResponseData(false);
	        rd.setMessage("账龄名称已存在");
	        return rd;
        }else{
        	return new ResponseData(agingHeadersService.insertAgingHeaders(requestContext, agingHeaders));
        }

    }
    
    @RequestMapping(value = "/insertAging", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData insertAging(@RequestBody List<AgingHeaders> agingHeadersList, BindingResult result, HttpServletRequest request){
        getValidator().validate(agingHeadersList, result);
        if (result.hasErrors()) {
            ResponseData rd = new ResponseData(false);
            rd.setMessage(getErrorMessage(result, request));
            return rd;
        }
        
        IRequest requestContext = createRequestContext(request);

        return new ResponseData(agingHeadersService.insertAging(requestContext, agingHeadersList));
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public ResponseData delete(@RequestBody List<AgingHeaders> agingHeadersList, BindingResult result, HttpServletRequest request){

    	getValidator().validate(agingHeadersList, result);
        if (result.hasErrors()) {
            ResponseData rd = new ResponseData(false);
            rd.setMessage(getErrorMessage(result, request));
            return rd;
        }
    	
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(agingHeadersService.deleteAgingHeaders(requestContext, agingHeadersList));
    }
}
