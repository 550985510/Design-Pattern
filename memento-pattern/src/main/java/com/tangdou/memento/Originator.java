package com.tangdou.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * 备忘发起人
 * @author 崔航
 * @date 2021/2/9 10:14
 */
public class Originator {

    @Setter
    @Getter
    private String state;

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
