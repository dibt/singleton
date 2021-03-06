package com.di.mysingleton;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class ClassFactory {
    /*使用enum枚举实现单例模式*/
    private enum MyEnumSingleton{
        singletonFactory;

        private MySingleton instance;

        private MyEnumSingleton(){//枚举类的构造方法在类加载时被实例化
            instance = new MySingleton();
        }

        public MySingleton getInstance(){
            return instance;
        }
    }

    public static MySingleton getInstance(){
        return MyEnumSingleton.singletonFactory.getInstance();
    }
}

class MySingleton{//需要实现单例的类，比如数据库连接Connection
    public MySingleton(){}
}
