package com.snbc.designer;

/**
 * 单例模式之静态内部类
 * <p>
 * author: zhougaoxiong
 * date: 2021/6/8,11:25
 * projectName:Temp1
 * packageName:com.snbc.apptest
 */
public class SingleTon {

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return SingletonHolder.sInstance;
    }

    //静态内部类
    private static class SingletonHolder {
        private static final SingleTon sInstance = new SingleTon();
    }
}
