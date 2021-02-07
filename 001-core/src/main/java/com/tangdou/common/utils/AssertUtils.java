package com.tangdou.common.utils;

import org.springframework.util.StringUtils;

import javax.validation.ValidationException;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author 崔航
 */
public class AssertUtils {
    public static final String ERROR_MESSAGE = "参数验证错误";

    /**
     * 断言字符串不为null且不为空,否则抛出业务异常
     *
     * @param text 字符串
     */
    public static void hasText(String text) {
        hasText(text, ERROR_MESSAGE);
    }

    /**
     * 断言字符串不为null且不为空,否则抛出业务异常
     *
     * @param text    字符串
     * @param message 业务message信息
     */
    public static void hasText(String text, String message) {
        if (StringUtils.isEmpty(text)) {
            throw new ValidationException(message);
        }
    }

    /**
     * 断言不为null，否则抛出异常
     *
     * @param obj object
     */
    public static void notNull(Object obj) {
        notNull(obj, ERROR_MESSAGE);
    }

    /**
     * 断言不为null，否则抛出异常
     *
     * @param obj     object
     * @param message 异常message
     */
    public static void notNull(Object obj, String message) {
        if (Objects.isNull(obj)) {
            throw new ValidationException(message);
        }
    }

    public static void equals(int val1, int val2, String message){
        if(val1 != val2){
            throw new ValidationException(message);
        }
    }

    public static void equals(BigDecimal val1, BigDecimal val2, String message){
        if(!val1.equals(val2)){
            throw new ValidationException(message);
        }
    }

    /**
     * 不为true则抛出异常
     *
     *@param b
     * @param message 异常message
     */
    public static void nonTrue(Boolean b, String message) {
        if (Objects.isNull(b)) {
            throw new ValidationException(message);
        }
        if (!b) {
            throw new ValidationException(message);
        }
    }

    /**
     * 断言大于0
     */
    public static void greaterThanZero(BigDecimal num) {
        greaterThanZero(num, ERROR_MESSAGE);
    }

    /**
     * 断言大于0，否则抛出异常
     */
    public static void greaterThanZero(BigDecimal num, String message) {
        notNull(num, message);
        if (num.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValidationException(message);
        }
    }

    public static void greaterThanZero(Integer num) {
        greaterThanZero(num, ERROR_MESSAGE);
    }

    public static void greaterThanZero(Integer num, String message) {
        notNull(num, message);
        if (num <= 0) {
            throw new ValidationException(message);
        }
    }

    public static void greaterThanZero(Long num) {
        greaterThanZero(num, ERROR_MESSAGE);
    }

    public static void greaterThanZero(Long num, String message) {
        notNull(num, message);
        if (num <= 0) {
            throw new ValidationException(message);
        }
    }

}
