package com.tangdou.memento;

import lombok.Getter;

/**
 * 备忘录
 * @author 崔航
 * @date 2021/2/9 10:13
 */
public class Memento {

    @Getter
    private final String state;

    public Memento(String state){
        this.state = state;
    }
}
