package cn.happy.springmvc05ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by linlin on 2017/8/21.
 */
@Controller
public class FirstController {
    @RequestMapping("/doFirst")
    public void doFirst(HttpServletResponse response) throws IOException {
response.getWriter().write("ajax");
    }
}
