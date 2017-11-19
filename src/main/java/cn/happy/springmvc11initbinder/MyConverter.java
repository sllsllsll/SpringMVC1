package cn.happy.springmvc11initbinder;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by linlin on 2017/8/28.
 */
public class MyConverter extends PropertiesEditor {
    @Override
    public void setAsText(String source) throws IllegalArgumentException {
        SimpleDateFormat sdf = getDateFormat(source);
        try {
            Date date = sdf.parse(source);
            setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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
