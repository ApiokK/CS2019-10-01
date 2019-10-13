package by.it.apiok.lesson04;

import java.util.Scanner;

/*
            На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1
Вывод
1

Ввод:
31 12
Вывод
365

Ввод:
13 9
Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int d=0;
        int dd=0;

        for (int i = 0; i <month; i++) {
            switch (i) {
                case 1: d=31; break;
                case 2: d=28; break;
                case 3: d=31; break;
                case 4: d=30; break;
                case 5: d=31; break;
                case 6: d=30; break;
                case 7: d=31; break;
                case 8: d=31; break;
                case 9: d=30; break;
                case 10: d=31; break;
                case 11: d=30; break;
                case 12: d=31; break;
            }
            dd=d+dd;
        }
        System.out.println(day+dd);
    }
}
