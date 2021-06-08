package com.snbc.designer;

/**
 * 单例模式之双重检查
 * <p>
 * author: zhougaoxiong
 * date: 2021/6/8,14:44
 * projectName:Designer
 * packageName:com.snbc.designer
 */
public class SingleTon2 {

    private static SingleTon2 sInstance = null;

    private SingleTon2() {
    }

    public static SingleTon2 getInstance() {
        if (sInstance == null) {
            synchronized (SingleTon2.class) {
                if (sInstance == null) {
                    sInstance = new SingleTon2();
                }
            }
        }
        return sInstance;
    }
}