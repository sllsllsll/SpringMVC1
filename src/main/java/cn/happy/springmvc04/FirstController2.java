package cn.happy.springmvc04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linlin on 2017/8/18.
 */
@Controller
public class FirstController2 {
    @RequestMapping("/singlefirst")
    public String doFirst(String uname){
        System.out.println(uname);
return "/WEB-INF/doFirst.jsp";
    }

    @RequestMapping("/singsecond")
    public String doSecond(UserInfo info){
        System.out.println(info.getUname());
        return "/WEB-INF/index.jsp";
    }
    @RequestMapping("/singBook")
    public String doBook(UserInfo info){
        System.out.println(info.getUname()+"\t"+info.getBook().getBookname());
        return "/WEB-INF/index.jsp";
    }
/*集合*/

    @RequestMapping(value= "/fourth")
    public String doFourth(Model model,UserInfo info){
        System.out.println(info.getUname()+"\t"+info.getList().get(0).getBookname());
        return "/WEB-INF/index.jsp";
    }

    @RequestMapping(value= "/{rname}/{age}/hehe")
    public String doFourth11(@PathVariable("rname") String name,@PathVariable("age") int age){
        System.out.println(name);
        System.out.println(age);
        return "/WEB-INF/index.jsp";
    }

}
