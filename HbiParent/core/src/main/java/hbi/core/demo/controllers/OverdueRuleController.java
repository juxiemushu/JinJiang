package hbi.core.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hbi.core.demo.dto.Entites;
import hbi.core.demo.dto.OverdueRule;
import hbi.core.demo.service.IOverdueRuleService;

@Controller
public class OverdueRuleController extends BaseController {

	@Autowired
	private IOverdueRuleService overdueRuleService;
	
	@RequestMapping("/calculation/query")
	@ResponseBody
	public ResponseData getOverdueRule(HttpServletRequest request , OverdueRule overdueRule , 
			@RequestParam(defaultValue= DEFAULT_PAGE) int page , @RequestParam(defaultValue= DEFAULT_PAGE_SIZE) int pagesize){
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(overdueRuleService.selectByOverdueRule(requestContext, overdueRule, page, pagesize));
	}
	
	@RequestMapping(value="/calculation/submit",method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public ResponseData submitOverdueRule(HttpServletRequest request , @RequestBody List<OverdueRule> overdueRules ){
		IRequest requestContext = createRequestContext(request);
		for(OverdueRule o:overdueRules){
			if(o.get__status().equals("add") && o.getRuleName() != null){
				if(overdueRuleService.selectRuleName(o).size() != 0){
					ResponseData rd = new ResponseData(false);
					rd.setMessage("规则名称已存在");
					return rd;
				}
			}
		}
			return new ResponseData(overdueRuleService.batchUpdate(requestContext, overdueRules));
	}
		 
	@RequestMapping("/calculation/remove")
	@ResponseBody
	public ResponseData deleteOverdueRule(HttpServletRequest request , @RequestBody List<OverdueRule> overdueRules){
		IRequest requestContext = createRequestContext(request);
		for(OverdueRule overdueRule:overdueRules){
			overdueRuleService.deleteRule(overdueRule);
		}
		return new ResponseData();
	}
	
	@RequestMapping("/calculation/query/entites")
	@ResponseBody
	public ResponseData getEntites(HttpServletRequest request , Entites entites , 
			@RequestParam(defaultValue= DEFAULT_PAGE) int page , @RequestParam(defaultValue= DEFAULT_PAGE_SIZE) int pagesize){
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(overdueRuleService.selectEntites(requestContext, entites, page, pagesize));
	}
	
}
