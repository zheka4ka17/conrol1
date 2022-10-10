package com.company;

import java.util.Scanner;

/*Пользователь вводит с клавиатуры целое число. Компьютер понимает только "0" и "1".
Если пользователь вводит "0", программа печатает "zero", если "1", то "one", в противном случае
"I don't know".*/
public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x==0){
            System.out.println("zero");
        }
        else if (x==1){
            System.out.println("one");
        }
        else System.out.println("I don't know");
    }
}

