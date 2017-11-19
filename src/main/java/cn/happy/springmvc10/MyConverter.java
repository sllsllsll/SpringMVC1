package cn.happy.springmvc10;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by linlin on 2017/8/28.
 */
public class MyConverter implements Converter<String,Date> {
    public Date convert(String source) {
        SimpleDateFormat sdf=getDateFormat(source);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private SimpleDateFormat getDateFormat(String source) {
        SimpleDateFormat sdf=null;
        if (Pattern.matches("\\d{4}-\\d{2}-\\d{2}",source)){
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        }else if (Pattern.matches("\\d{4}/\\d{2}/\\d{2}",source)){
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }else if (Pattern.matches("\\d{4}\\d{2}\\d{2}",source)){
            sdf=new SimpleDateFormat("yyyyMMdd");
        }
        return sdf;
    }
}
