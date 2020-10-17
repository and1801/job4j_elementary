package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int oute = Converter.rubleToEuro(in);
        boolean passede = expected == oute;
        int outd = Converter.rubleToDollar(in);
        boolean passedd = expected == outd;
        System.out.println("140 rubles are 2. Test result : " + passede);
        System.out.println("140 rubles are 2. Test result : " + passedd);
    }
}