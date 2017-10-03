package com.candice.cache;

public interface ICache {

    public void put(String key, String value);

    public String get(String key);

}
