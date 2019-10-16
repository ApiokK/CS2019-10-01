package by.it.apiok.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

            1. Создайте список строк.
            2. Добавьте в него 5 различных строк.
            3. Выведите его размер на экран.
            4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String > arr = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
           String s = sc.next();
           arr.add(s);
        }
        System.out.println(arr.size());
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
