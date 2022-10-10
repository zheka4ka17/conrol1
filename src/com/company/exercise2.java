package com.company;
/*В диапазоне [1..10] найти количество чисел, которые делятся на 2 или на 3.8*/
public interface exercise2 {
    public static void main(String[] args) {
        int count= 0;

        for (int i=1;i<=10; i++ ){
            if (i%2==0) {
                count = count + 1;}

            else if (i%3==0) {
                count = count +1;}

            }

        System.out.printf("Количество чисел которые делятся на 2 или 3 : %d", count);
    }

}
