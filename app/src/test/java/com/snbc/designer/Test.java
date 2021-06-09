package com.snbc.designer;

/**
 * author: zhougaoxiong
 * date: 2021/6/9,16:08
 * projectName:Designer
 * packageName:com.snbc.designer
 */

/**
 * 使用者
 */
class Test {
    public static void main(String[] args) {
//被观察的角色
        NewsPaper newspaper = new NewsPaper();
        Coder mrsimple = new Coder("mr. simple");
        Coder coder1 = new Coder("coder-1");
        Coder coder2 = new Coder("coder-2");
        Coder coder3 = new Coder("coder-3");

//将观察者注册到可观察对象的观察者列表中
        newspaper.addObserver(mrsimple);
        newspaper.addObserver(coder1);
        newspaper.addObserver(coder2);
        newspaper.addObserver(coder3);

//发布消息
        newspaper.postNewPublication("新的一期开发技术前线周报发布啦!");
    }
}
