package com.candice;

import com.candice.cache.FIFOCache;
import com.candice.cache.ICache;
import com.candice.cache.LruCache;

public class Main extends AbsHungry implements IFan,IFanChild{

    public static void main(String[] args) {
        Some.staticMethod();
        new Some().normalMethod();

        new AbsHungry() {
            @Override
            public void fellHungry() {

            }
        };

        ICache cache = new LruCache();
        cache.put("candice", "icodeu");
        System.out.println(cache.get("candice"));
        if(cache instanceof LruCache){
            System.out.println("hahahahhahahaha");
        }
    }

    @Override
    public void fellHungry() {

    }

    @Override
    public void full() {

    }
}
