package com.insightfullogic.java8.exercises.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringExercises {

    // Question 7
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    // Question 8
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
//                .map(s -> s.chars())
//                .filter(ch -> Character.isLowerCase(ch))
//                .max();
                .max(Comparator.comparing(s -> countLowercaseLetters(s)));
    }

}
