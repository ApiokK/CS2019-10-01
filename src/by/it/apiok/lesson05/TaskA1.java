package by.it.apiok.lesson05;

/* Массив из чисел в обратном порядке
        1. Создать массив на 10 чисел.
        2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
        3. Расположить элементы массива в обратном порядке.
        4. Вывести результат на экран, каждое значение выводить с новой строки.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0
9
8
7
6
5
4
3
2
1

*/


import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i <10; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        for (int i = 9; i >-1; i--) {
            System.out.println(arr[i]);
        }
    }

}
