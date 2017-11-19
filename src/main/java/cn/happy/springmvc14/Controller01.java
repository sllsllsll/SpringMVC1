package cn.happy.springmvc14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linlin on 2017/9/4.
 */
@Controller
public class Controller01 {
    @RequestMapping("/first")
    public String dos(){
        System.out.println("=================================");
        return "index.jsp";
    }
}
