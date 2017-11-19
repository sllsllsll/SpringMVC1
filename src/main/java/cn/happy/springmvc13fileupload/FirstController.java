package cn.happy.springmvc13fileupload;

import cn.happy.springmvc11initbinder.MyConverter;
import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by linlin on 2017/8/28.
 */
@Controller
public class FirstController {

    @RequestMapping("/first")
    public String doFirst(MultipartFile[] upload, HttpSession session, HttpServletRequest request) {
      for (MultipartFile item:upload) {
          if (item.getSize() > 0) {
              String parentPath = session.getServletContext().getRealPath("/upload");
              String childname = item.getOriginalFilename();
              if(childname.endsWith(".png")||childname.endsWith(".jpg")||childname.endsWith(".gif")) {
                  File filepath = new File(parentPath, childname);

                  try {
                      item.transferTo(filepath);

                  } catch (IOException e) {
                      e.printStackTrace();
                      return "/fileupload.jsp";
                  }
              }else{
                  return "/fileupload.jsp";
              }
          } else {
              request.setAttribute("msg", "您还没有选择文件");
              return "/fileupload.jsp";
          }


      }
        return "index.jsp";
    }
}

