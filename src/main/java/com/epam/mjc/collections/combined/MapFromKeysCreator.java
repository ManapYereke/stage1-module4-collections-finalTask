package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();

        // Iterate over the entries of the source map
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            String key = entry.getKey();
            int length = key.length();

            // If the length is not already in the resultMap, create a new set for it
            resultMap.putIfAbsent(length, new HashSet<>());

            // Add the key to the set corresponding to its length
            Set<String> keysSet = resultMap.get(length);
            keysSet.add(key);
        }

        return resultMap;
    }
}
