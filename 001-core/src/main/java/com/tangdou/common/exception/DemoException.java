package com.tangdou.common.exception;

/**
 * @author 木叶丸
 */
public class DemoException extends RuntimeException {

    public DemoException() {}

    public DemoException(String message) {
        super(message);
    }

    public DemoException(Throwable throwable) {
        super(throwable);
    }

    public DemoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
