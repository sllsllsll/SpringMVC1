package cn.happy.springmvc07exection.exceptions;

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
