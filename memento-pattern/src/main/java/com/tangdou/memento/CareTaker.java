package com.tangdou.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 崔航
 * @date 2021/2/9 10:15
 */
public class CareTaker {

    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
