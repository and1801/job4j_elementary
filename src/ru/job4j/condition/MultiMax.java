package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result1 = first > second ? first : second;
        int result = third > result1 ? third : result1;
        return result;
    }
}