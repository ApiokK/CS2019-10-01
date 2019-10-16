package by.it.apiok.lesson05;

/*
Минимум и максимум
            1. Создать массив m на 10 целых чисел.
            2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int a, b, t;
        int first = 0, last = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i]=sc.nextInt();
        }
        m[0] = first;
        m[9] = last;
        for(a=1; a < m.length; a++) {
            for(b=m.length; b >= a; b--) {
                if(m[b-1] > m[b]) { // if out of order
                    // exchange elements
                    t = m[b-1];
                    m[b-1] = m[b];
                    m[b] = t;
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
           if (m[i]==first) System.out.println("Index of first element="+i);
           if (m[i]==last) System.out.println("Index of last element="+i);
        }
    }
}
