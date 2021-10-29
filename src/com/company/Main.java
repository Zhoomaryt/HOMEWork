package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemperature(38, -8));
        System.out.println(ageTemperature(29, -30));
        System.out.println(ageTemperature(10, 42));
        System.out.println(ageTemperature(20, 70));
    }

    public static String ageTemperature(int age, int temperature) {
        String res = "Можно идти гулять!";
        String res2 = "Остовайтесь дома!";
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return res;
        } else if (age <= 20 && temperature > 0 && temperature <= 28) {
            return res;
        } else {
            return age >= 45 && temperature >= -10 && temperature <= 25 ? res : res2;
        }
    }


        // write your code here
    }

