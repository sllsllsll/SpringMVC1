package cn.happy.springmvc09exceptionhandler;

import cn.happy.springmvc07exection.exceptions.AgeException;
import cn.happy.springmvc07exection.exceptions.NameException;
import cn.happy.springmvc07exection.exceptions.UserException;
import cn.happy.springmvc07exection.exceptions.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by linlin on 2017/8/28.
 */
@Controller
public class FirstController {

    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView  mv=new ModelAndView();
        if (ex instanceof NameException){
            mv.setViewName("/Name.jsp");
        }
        if (ex instanceof AgeException){
            mv.setViewName("/Age.jsp");
        }
        return mv;
    }

    @RequestMapping("/hhhExcetpion")
        public String doFirst(UserInfo info) throws UserException {
            if (!info.getName().equals("admin")) {
                //不是admin，抛出一个Name出错异常
                throw new NameException("用户名异常");
            }
            if (info.getAge()>60) {
                throw new AgeException("年龄异常");
            }
            return "/index.jsp";
        }
    }


