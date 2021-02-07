package com.tangdou.interpreter;

import java.util.List;

/**
 * @author 崔航
 * @date 2021/2/7 17:29
 */
public class AndExpression extends AbstractExpression<Boolean> {

    private final List<TerminalExpression> expressions;

    public AndExpression(List<TerminalExpression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public Boolean interpreter(String context) {
        return expressions.stream().allMatch(i -> i.interpreter(context));
    }
}
