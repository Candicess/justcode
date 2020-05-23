package com.candice.cache;

public class Main {



    public static void main(String[] args) {

//        ICache lruCache = new LruCache();
        ICache userCache = new FIFOCache();
        userCache.get("a");
    }


}
