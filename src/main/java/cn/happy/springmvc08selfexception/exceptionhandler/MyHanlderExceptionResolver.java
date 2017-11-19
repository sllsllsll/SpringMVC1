package cn.happy.springmvc08selfexception.exceptionhandler;

import cn.happy.springmvc07exection.exceptions.AgeException;
import cn.happy.springmvc07exection.exceptions.NameException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by linlin on 2017/8/28.
 */
public class MyHanlderExceptionResolver  implements HandlerExceptionResolver {
    /*
      解决异常
     */

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        ModelAndView mv = new ModelAndView();
        if (ex instanceof NameException) {
            mv.setViewName("/Name.jsp");
        }
        if (ex instanceof AgeException) {
            mv.setViewName("/Age.jsp");
        }
        return mv;
    }
}