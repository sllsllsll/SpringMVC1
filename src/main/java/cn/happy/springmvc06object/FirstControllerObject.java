package cn.happy.springmvc06object;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by linlin on 2017/8/21.
 */
@Controller
public class FirstControllerObject {
    @ResponseBody
    @RequestMapping("/first")
    public Object doFirst(){
        return 1;
    }

    @ResponseBody
    @RequestMapping(value = "/second",produces = "text/html;charset=UTF-8")
    public Object doSecond(){
        return "苏苏";
    }
    @ResponseBody
    @RequestMapping(value = "/third" )
    public Object doThird(){
        UserInfo u=new UserInfo();
        u.setAge(12);
        u.setName("苏苏");
        return u;
    }
    @ResponseBody
    @RequestMapping(value = "/domap" )
    public Object domap(){
        Map<String,UserInfo> map=new HashMap<String, UserInfo>();
        UserInfo u=new UserInfo();
        u.setName("苏苏");
        u.setAge(23);
        UserInfo u1=new UserInfo();
        u1.setName("啦啦");
        u1.setAge(213);
        map.put(u.getName(),u);
        map.put(u1.getName(),u1);

        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/dolist" )
    public Object dolist(){
        List<UserInfo> list=new ArrayList<UserInfo>();
        UserInfo u=new UserInfo();
        u.setAge(12);
        u.setName("苏苏");
        UserInfo u1=new UserInfo();
        u1.setAge(22);
        u1.setName("苏苏1");
      list.add(u);
      list.add(u1);
        return list;
    }
}
