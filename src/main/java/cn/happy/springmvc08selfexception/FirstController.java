package cn.happy.springmvc08selfexception;

import cn.happy.springmvc07exection.exceptions.AgeException;
import cn.happy.springmvc07exection.exceptions.NameException;
import cn.happy.springmvc07exection.exceptions.UserException;
import cn.happy.springmvc07exection.exceptions.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linlin on 2017/8/28.
 */
@Controller
public class FirstController {
        @RequestMapping("/selfExcetpion")
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


