package com.tangdou.interpreter;

import java.util.List;

/**
 * @author 崔航
 * @date 2021/2/7 17:24
 */
public class OrExpression extends AbstractExpression<Boolean> {

    private final List<TerminalExpression> expressions;

    public OrExpression(List<TerminalExpression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public Boolean interpreter(String context) {
        return expressions.stream().anyMatch(i -> i.interpreter(context));
    }
}
