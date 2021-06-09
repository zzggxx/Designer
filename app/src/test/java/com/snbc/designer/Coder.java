package com.snbc.designer;

import java.util.Observable;
import java.util.Observer;

/**
 * author: zhougaoxiong
 * date: 2021/6/9,16:10
 * projectName:Designer
 * packageName:com.snbc.designer
 */

/**
 * 观察者
 */
class Coder implements Observer {

    public String name;

    public Coder(String aName) {
        name = aName;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hi," + name + ",你订阅报纸更新内容了啦");
    }
}
