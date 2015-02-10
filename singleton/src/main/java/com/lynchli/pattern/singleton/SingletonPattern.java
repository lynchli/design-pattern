package com.lynchli.pattern.singleton;

/**
 *
 * Created by Lynch on 2/10/15.
 */
public class SingletonPattern {

    private SingletonPattern(){}

    private static SingletonPattern singletonPattern = new SingletonPattern();

    public static SingletonPattern getInstance(){
        return singletonPattern;
    }
}
