package Collection;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LFUCache {
    private HashMap<Integer, Integer> keyToVal;
    private HashMap<Integer, Integer> keyToFreq;
    private HashMap<Integer, LinkedHashSet<Integer>> freqToKeys;
    private int capacity;
    private int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.keyToVal = new HashMap<>();
        this.keyToFreq = new HashMap<>();
        this.freqToKeys = new HashMap<>();
        freqToKeys.put(1, new LinkedHashSet<>());
    }

    public int get(int key) {
        if (!keyToVal.containsKey(key)) {
            return -1;
        }

        int freq = keyToFreq.get(key);
        freqToKeys.get(freq).remove(key);
        if (freq == minFreq && freqToKeys.get(freq).isEmpty()) {
            minFreq++;
        }

        freq++;
        keyToFreq.put(key, freq);
        freqToKeys.putIfAbsent(freq, new LinkedHashSet<>());
        freqToKeys.get(freq).add(key);

        return keyToVal.get(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0) {
            return;
        }

        if (keyToVal.containsKey(key)) {
            keyToVal.put(key, value);
            get(key); // update frequency
        } else {
            if (keyToVal.size() >= capacity) {
                int evictKey = freqToKeys.get(minFreq).iterator().next();
                freqToKeys.get(minFreq).remove(evictKey);
                keyToVal.remove(evictKey);
                keyToFreq.remove(evictKey);
            }
            keyToVal.put(key, value);
            keyToFreq.put(key, 1);
            freqToKeys.get(1).add(key);
            minFreq = 1;
        }
    }
}

class Main {
    public static void main(String[] args) {

        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // Output: 1
        System.out.println(cache.get(2)); // Output: 2
        cache.get(1);
        cache.put(3, 3);
        System.out.println(cache.get(2));
        System.out.println(cache.get(3)); // Output: 3
        System.out.println(cache.get(1)); // Output: 1
    }
}


