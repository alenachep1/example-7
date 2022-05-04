package com.company;

import java.time.LocalDate;

public class Main<clientOS> {
    public static boolean isYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        for (int year = 2010; year <= 2022; year++) {
            if (isYear(year))
                System.out.println("год " + year + " високосный год");
            else
                System.out.println("год " + year + " не високосный год");
        }
    }

    public static boolean client(int clientOS) {
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = currentYear;
        if (clientOS == 0 && clientDeviceYear <= 2015)
            return true;
        else
            return false;
    }

    public void main(clientOS) {
        int clientDeviceYear = 2020;
        int clientOS = 0;
        for (clientOS = 0; clientDeviceYear <= 2015) ;

        if (clientOS,clientDeviceYear){
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        } else if (clientOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке: ");
        } else if (clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ");
        }
    }


}
