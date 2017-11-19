package cn.happy.springmvc05test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linlin on 2017/8/18.
 */
@Controller
public class MyController {

    @RequestMapping(value = "/{rname}/{age}/hehe")
    public String doFirst(@PathVariable("rname") String name, @PathVariable("age") int age) {
        System.out.println(name);
        System.out.println(age);
        return "/index.jsp";
    }

    //ajax
    @RequestMapping(value = "ajax.do")
    public void doFirst(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("==============================s");
        List<Book> list = new ArrayList<Book>();
        Book book = new Book();
        book.setBookname("图书");
        list.add(book);
        System.out.println(list);
        String result = JSON.toJSONString(list);
        PrintWriter pw = response.getWriter();
        System.out.println(pw);
        pw.print(result);

    }

    @RequestMapping(value = "/third")
    @ResponseBody
    public String message() {
        return "hello,jackson";
    }

    @RequestMapping(value = "/third1")
    @ResponseBody
    public String message1() {
        Book book = new Book();
        book.setBookname("图书");
        String d = JSON.toJSONString(book);
        return d;
    }
}
