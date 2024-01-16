package org.codefinity.mapcollection;

import java.util.HashMap;
import java.util.Map;

public class StudentGradingSystem {
    Map<String, Integer> mStudentGrades = new HashMap<>();

    public StudentGradingSystem() {
        populateMarks();
    }

    public void populateMarks() {
        mStudentGrades.put("Bob", 7);
        mStudentGrades.put("Alice", 8);
        mStudentGrades.put("Mark", 9);
        mStudentGrades.put("Ntuthuko", 10);
    }

    public Map<String, Integer> getStudentGrades() {
        return mStudentGrades;
    }
}
