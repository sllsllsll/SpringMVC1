package cn.happy.springmvc10;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by linlin on 2017/8/28.
 */
@Controller
public class FirstController {

    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView exceptionHandler(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        //放入request作用域中
        mv.addObject("date",request.getParameter("birthday"));
        mv.setViewName("MyConverter.jsp");
        return mv;
    }
    @RequestMapping("/first")
    public String doFirst(Date birthday, int age){
        return "index.jsp";
    }
}

