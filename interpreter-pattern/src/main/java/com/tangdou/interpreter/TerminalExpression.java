package com.tangdou.interpreter;

/**
 * @author 崔航
 * @date 2021/2/7 17:23
 */
public class TerminalExpression extends AbstractExpression<Boolean> {

    private final String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public Boolean interpreter(String context) {
        return context.contains(data);
    }
}
