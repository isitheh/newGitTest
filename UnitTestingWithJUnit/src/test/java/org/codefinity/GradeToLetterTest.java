package org.codefinity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GradeToLetterTest {
    @Test
    void gradeTesterForU() {
        GradeToLetter mGradeToLetter = new GradeToLetter();
        Assertions.assertEquals('U', mGradeToLetter.convertGradeToLetter(-1));
    }

    @Test
    void gradeTesterForF() {
        GradeToLetter mGradeToLetter = new GradeToLetter();
        Assertions.assertEquals('F', mGradeToLetter.convertGradeToLetter(40));
    }

    @Test
    void gradeTesterForFTwo() {
        GradeToLetter mGradeToLetter = new GradeToLetter();
        Assertions.assertEquals('F', mGradeToLetter.convertGradeToLetter(57));
    }

    @Test
    void gradeTesterForD() {
        GradeToLetter mGradeToLetter = new GradeToLetter();
        Assertions.assertEquals('D', mGradeToLetter.convertGradeToLetter(64));
    }

    @Test
    void gradeTesterForC() {
        GradeToLetter mGradeToLetter = new GradeToLetter();
        Assertions.assertEquals('C', mGradeToLetter.convertGradeToLetter(72));
    }

    @Test
    void gradeTesterForB() {
        GradeToLetter mGradeToLetter = new GradeToLetter();
        Assertions.assertEquals('B', mGradeToLetter.convertGradeToLetter(80));
    }

    @Test
    void gradeTesterForA() {
        GradeToLetter mGradeToLetter = new GradeToLetter();
        Assertions.assertEquals('A', mGradeToLetter.convertGradeToLetter(92));
    }
}