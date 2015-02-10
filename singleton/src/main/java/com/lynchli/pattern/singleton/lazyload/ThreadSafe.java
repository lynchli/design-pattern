package com.lynchli.pattern.singleton.lazyload;

/**
 * Created by Lynch on 2/10/15.
 */
public class ThreadSafe {

    private ThreadSafe(){}

    private static ThreadSafe threadSafe;

    public static ThreadSafe getInstance(){
        synchronized (ThreadSafe.class) {
            if (threadSafe == null) {
                threadSafe = new ThreadSafe();
            }
        }
        return threadSafe;
    }
}
