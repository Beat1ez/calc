package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        calc(input);
    }
    public static int calc(String input){
        String[] string = input.split(" ");
        // for (String s : string) { System.out.println(s); }
        int firstNum;
        int secondNum;
        String num1 = string[0];
        String num2 = string[2];
        try {
            if (num1.equals("I") || num1.equals("II") || num1.equals("III") || num1.equals("IV") || num1.equals("V") || num1.equals("VI") || num1.equals("VII") ||
                    num1.equals("VIII") || num1.equals("IX") || num1.equals("X") &&
                    num2.equals("I") || num2.equals("II") || num2.equals("III") || num2.equals("IV") || num2.equals("V") || num2.equals("VI") || num2.equals("VII") ||
                    num2.equals("VIII") || num2.equals("IX") || num2.equals("X")) {

                int firstRomanNum = 0;
                int secondRomanNum = 0;

                if (num1.equals("I")) { firstRomanNum = 1; }
                if (num1.equals("II")) { firstRomanNum = 2; }
                if (num1.equals("III")) { firstRomanNum = 3; }
                if (num1.equals("IV")) { firstRomanNum = 4; }
                if (num1.equals("V")) { firstRomanNum = 5; }
                if (num1.equals("VI")) { firstRomanNum = 6; }
                if (num1.equals("VII")) { firstRomanNum = 7; }
                if (num1.equals("VIII")) { firstRomanNum = 8; }
                if (num1.equals("IX")) { firstRomanNum = 9; }
                if (num1.equals("X")) { firstRomanNum = 10; }

                if (num2.equals("I")) { secondRomanNum = 1; }
                if (num2.equals("II")) { secondRomanNum = 2; }
                if (num2.equals("III")) { secondRomanNum = 3; }
                if (num2.equals("IV")) { secondRomanNum = 4; }
                if (num2.equals("V")) { secondRomanNum = 5; }
                if (num2.equals("VI")) { secondRomanNum = 6; }
                if (num2.equals("VII")) { secondRomanNum = 7; }
                if (num2.equals("VIII")) { secondRomanNum = 8; }
                if (num2.equals("IX")) { secondRomanNum = 9; }
                if (num2.equals("X")) { secondRomanNum = 10; }

                if (input.contains("+")) {
                    System.out.println(firstRomanNum + secondRomanNum);
                    return firstRomanNum + secondRomanNum;
                } else if (input.contains("-")){
                    int res = firstRomanNum - secondRomanNum;
                    System.out.println(firstRomanNum - secondRomanNum);
                    if (res < 0){
                        throw new Exception("В римских цифрах нет отрицательных чисел");
                    } else
                    return firstRomanNum - secondRomanNum;
                } else if (input.contains("/")) {
                    System.out.println(firstRomanNum / secondRomanNum);
                    return firstRomanNum / secondRomanNum;
                } else if (input.contains("*")) {
                    System.out.println(firstRomanNum * secondRomanNum);
                    return firstRomanNum * secondRomanNum;
                }
            }

            firstNum = Integer.parseInt(string[0]);
            secondNum = Integer.parseInt(string[2]);

            if (firstNum < 0 || firstNum > 10 || secondNum < 0 || secondNum > 10) {
                throw new Exception("Операторы не могу быть ниже 0 или выше 10");
            } else if (input.contains("+")) {
                System.out.println(firstNum + secondNum);
                return firstNum + secondNum;
            } else if (input.contains("-")) {
                System.out.println(firstNum - secondNum);
                return firstNum - secondNum;
            } else if (input.contains("/")) {
                System.out.println(firstNum / secondNum);
                return firstNum / secondNum;
            } else if (input.contains("*")) {
                System.out.println(firstNum * secondNum);
                return firstNum * secondNum;
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
       return 0;
    }
}
