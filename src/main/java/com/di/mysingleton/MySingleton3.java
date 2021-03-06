package com.di.mysingleton;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton3 {
    /*懒汉式单例-synchronized关键字-线程安全-效率低*/
    private static MySingleton3 instance = null;
    private MySingleton3(){}
    public synchronized static MySingleton3 getInstance() {
        try {
            if(instance != null){//懒汉式

            }else{
                //创建实例之前可能会有一些准备性的耗时工作
                Thread.sleep(300);
                instance = new MySingleton3();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
