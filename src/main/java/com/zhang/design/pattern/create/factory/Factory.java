package com.zhang.design.pattern.create.factory;

/**
 * by zh
 * 2020/6/22
 *
 * 工厂方法(Factory Method)。定义一个用于创建对象的接口，让子类决定将哪一个类实例化,工厂方法使一个类的实例化延迟到其子类。
 *
 **/
public class Factory {

    public static AClient getAClient() {

        return new AClient();
    }

    public static BClient getBClient() {

        return new BClient();
    }
}
