package com.candice.cache;

import java.util.LinkedHashMap;

public class LruCache implements ICache {

    private LinkedHashMap<String, String> mCache = new LinkedHashMap<>();

    @Override
    public void put(String key, String value) {
        mCache.put(key, value);
    }

    @Override
    public String get(String key) {
        return mCache.get(key);
    }
}
