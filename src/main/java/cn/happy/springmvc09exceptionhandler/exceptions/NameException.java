package cn.happy.springmvc09exceptionhandler.exceptions;

/**
 * Created by linlin on 2017/8/28.
 */
public class NameException extends UserException {
    public NameException() {
    }

    public NameException(String message) {
        super(message);
    }
}
