package com.example.util.LRUCache;

import java.util.*;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int maxEntries;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public LRUCache(int initialCapacity,  float loadFactor,int maxEntries) {
        super(initialCapacity, loadFactor, true);
        this.maxEntries = maxEntries;
    }

      public LRUCache(int maxEntries) {
      this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR,maxEntries);
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxEntries;
    }
}