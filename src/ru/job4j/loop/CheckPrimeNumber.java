package ru.job4j.loop;

public class CheckPrimeNumber {
    @SuppressWarnings("checkstyle:EmptyBlock")
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index < number; index++) {

            if (number % index == 0) {
                prime = false;
                break;
            } else if (number % index != 0) {

            }
        }
        return prime;
    }
}