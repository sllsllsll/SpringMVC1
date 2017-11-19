package cn.happy.springmvc01;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by linlin on 2017/8/14.
 */
public class FilstController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       ModelAndView mv=new ModelAndView();
       mv.addObject("name","我是一个美丽的 小女孩");
       mv.setViewName("index");
        return mv;
    }
}
