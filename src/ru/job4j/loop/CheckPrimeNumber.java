package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index < number; index++) {

            if (number % index == 0) {
                prime = false;
                break;
            } else if (number % index != 0) {
                prime = true;
            }
        }
        return prime;
    }
}