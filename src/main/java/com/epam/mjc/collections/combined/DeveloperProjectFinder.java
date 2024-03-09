package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsForDeveloper = new ArrayList<>();

        // Iterate over the projects
        for (String project : projects.keySet()) {
            Set<String> developers = projects.get(project);

            // If the developer is associated with the project, add it to the list
            if (developers.contains(developer)) {
                projectsForDeveloper.add(project);
            }
        }

        // Sort the projects based on length and alphabetically in reverse order
        projectsForDeveloper.sort((p1, p2) -> {
            if (p1.length() != p2.length()) {
                return Integer.compare(p2.length(), p1.length());
            } else {
                return p2.compareTo(p1);
            }
        });

        return projectsForDeveloper;
    }
}
