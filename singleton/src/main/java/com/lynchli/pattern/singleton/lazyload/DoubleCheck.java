package com.lynchli.pattern.singleton.lazyload;

/**
 * Created by Lynch on 2/10/15.
 */
public class DoubleCheck {

    private DoubleCheck(){}

    private static DoubleCheck doubleCheck;

    public static DoubleCheck getInstance(){
        if(doubleCheck == null){
            synchronized (DoubleCheck.class){
                if(doubleCheck == null){
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
