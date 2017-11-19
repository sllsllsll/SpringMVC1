package cn.happy.springmvc06object;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by linlin on 2017/8/21.
 */
@Controller
public class requestControllerObject {
  @RequestMapping("/addBook")
    public String addBook(HttpServletRequest request){
        request.setAttribute("bookname","苏苏苏苏苏苏");
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public String listBook(){
        return "/listBook.jsp";
    }
}
