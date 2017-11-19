package cn.happy.springmvc07exection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linlin on 2017/8/28.
 */
@Controller
public class FirstController {
    @RequestMapping("/first")
    public String list(){
        //构造异常
        int result=5/0;
        return "/WEB-INF/first.jsp";
    }


}
