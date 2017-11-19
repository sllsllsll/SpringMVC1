package cn.happy.springmvc12validator;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by linlin on 2017/8/30.
 */
@Controller
public class FirstController {
    @RequestMapping("/first")
    public ModelAndView doFirst(@Valid UserInfo info, BindingResult br){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/welcome.jsp");
        //有一个可以侦测到验证错误总数的方法
        int errorCount = br.getErrorCount();  //2
        if (errorCount>0) {
            //证明模型验证失败
            FieldError score = br.getFieldError("score"); //5
            FieldError name = br.getFieldError("name");
            FieldError phone = br.getFieldError("phone");
            if (score!=null) {

                mv.addObject("scoremsg",score.getDefaultMessage());//5
            }
            if (name!=null) {
                mv.addObject("namemsg",name.getDefaultMessage());
            }
            if (phone!=null) {
                mv.addObject("phonemsg",phone.getDefaultMessage());
            }
            mv.setViewName("/SJjiaoyan.jsp");
        }
        return mv ;
    }
}
