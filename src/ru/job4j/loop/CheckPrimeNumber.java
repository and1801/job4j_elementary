package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index < number; index++) {

            if (number % index == 0) {
                break;
            } else if (number % index != 0) {

            }
        }
        return prime;}
}