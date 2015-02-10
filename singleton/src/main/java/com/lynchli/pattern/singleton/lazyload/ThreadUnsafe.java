package com.lynchli.pattern.singleton.lazyload;

/**
 *
 *
 *
 * Created by Lynch on 2/9/15.
 */
public class ThreadUnsafe {

    private ThreadUnsafe(){}

    private static ThreadUnsafe threadUnsafe;

    public static ThreadUnsafe getInstance(){
        if(threadUnsafe == null){
            threadUnsafe = new ThreadUnsafe();
        }
        return threadUnsafe;
    }
}
