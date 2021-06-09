package com.snbc.designer;

import java.util.Observable;

/**
 * author: zhougaoxiong
 * date: 2021/6/9,16:19
 * projectName:Designer
 * packageName:com.snbc.designer
 */

/**
 * 被观察者
 */
class NewsPaper extends Observable {

    public void postNewPublication(String content){
        // 标记状态或者内容发生改变
        setChanged();
        // 通知所有观察者,并且把内容发给他们
        notifyObservers(content);
    }

}
