package cn.happy.springmvc08selfexception.exceptions;

/**
 * Created by linlin on 2017/8/28.
 */
public class UserException  extends Exception {
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }
}

