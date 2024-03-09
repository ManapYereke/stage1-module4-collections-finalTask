package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> allLessons = new HashSet<>();

        // Iterate over the timetable map
        for (List<String> lessons : timetable.values()) {
            // Add each lesson to the set
            allLessons.addAll(lessons);
        }

        return allLessons;
    }
}
