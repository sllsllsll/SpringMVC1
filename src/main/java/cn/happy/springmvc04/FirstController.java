package cn.happy.springmvc04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linlin on 2017/8/18.
 */
@Controller
public class FirstController {
    @RequestMapping("/first")
    public String doFirst(){
        return "/WEB-INF/doFirst.jsp";
    }

    @RequestMapping("/second")
    public String doSecond(){
        return "/WEB-INF/index.jsp";
    }


}
