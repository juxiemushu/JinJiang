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

import hbi.core.demo.dto.AgingLines;
import hbi.core.demo.service.IAgingLinesService;

@RequestMapping(value="/calculation/agingLines")
@Controller
public class AgingLinesController extends BaseController {

    @Autowired
    private IAgingLinesService agingLinesService;
    
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submitAging(@RequestBody List<AgingLines> agingLinesList, BindingResult result, HttpServletRequest request){
        getValidator().validate(agingLinesList, result);
        if (result.hasErrors()) {
            ResponseData rd = new ResponseData(false);
            rd.setMessage(getErrorMessage(result, request));
            return rd;
        }
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(agingLinesService.batchUpdate(requestContext, agingLinesList));
    }
}
