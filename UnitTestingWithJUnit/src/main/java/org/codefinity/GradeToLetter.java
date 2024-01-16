package org.codefinity;

public class GradeToLetter {
    public char convertGradeToLetter(int numGrade) {
        if(numGrade < 0) {
            return 'U';
        } else if(numGrade < 60) {
            return 'F';
        } else if(numGrade < 70) {
            return 'D';
        } else if(numGrade < 80) {
            return 'C';
        } else if(numGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
