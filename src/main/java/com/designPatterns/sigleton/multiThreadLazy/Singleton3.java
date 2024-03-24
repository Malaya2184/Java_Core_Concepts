package com.designPatterns.sigleton.multiThreadLazy;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton3 {
    private static Singleton3 obj;
    private Singleton3(){};
    public static Singleton3 getInstance(){
        Lock lock = new ReentrantLock();
        if(obj == null){
            lock.lock();
            if (obj == null){
                obj = new Singleton3();
            }
            lock.unlock();
        }
        return obj;
    }
}
