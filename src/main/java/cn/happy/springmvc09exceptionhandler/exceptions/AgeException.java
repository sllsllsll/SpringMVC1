package cn.happy.springmvc09exceptionhandler.exceptions;

/**
 * Created by linlin on 2017/8/28.
 */
public class AgeException extends UserException {
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
