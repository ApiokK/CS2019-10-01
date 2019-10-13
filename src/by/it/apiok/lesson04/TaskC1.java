package by.it.apiok.lesson04;

import java.util.Scanner;

/*
        Напишите программу которая спрашивает у пользователя:
        Какую вы хотите зарплату в $$$?
        После ввода суммы, программа анализирует полученное значение
        и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
        Мы вам перезвоним!

        Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
        В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.
Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.
Пример работы программы (у вас должно быть так же, до символа):
Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        double value = sc.nextInt();

        if (value < 300 || value > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            for (int i = 0; i <= 14; i++) {
                if (i > 12 || i < 1) {
                    System.out.println("За месяц " + i + " начислено $0.0");
                } else {
                    double onCard=0.0;
                    switch (i) {
                        case 1:
                            onCard = value * 1.5;
                            System.out.println("За январь начислено $" + onCard);
                            break;
                        case 2:
                            onCard = value * 1.5;
                            System.out.println("За февраль начислено $" + onCard);
                            break;
                        case 3:
                            onCard = value * 1.5;
                            System.out.println("За март начислено $" + onCard);
                            break;
                        case 4:
                            onCard = value * 1.5;
                            System.out.println("За апрель начислено $" + onCard);
                            break;
                        case 5:
                            onCard = value * 1.5;
                            System.out.println("За май начислено $" + onCard);
                            break;
                        case 6:
                            onCard = value;
                            System.out.println("За июнь начислено $" + onCard);
                            break;
                        case 7:
                            onCard = value;
                            System.out.println("За июль начислено $" + onCard);
                            break;
                        case 8:
                            onCard = value;
                            System.out.println("За август начислено $" + onCard);
                            break;
                        case 9:
                            onCard = value * 1.5;
                            System.out.println("За сентябрь начислено $" + onCard);
                            break;
                        case 10:
                            onCard = value * 1.5;
                            System.out.println("За октябрь начислено $" + onCard);
                            break;
                        case 11:
                            onCard = value * 1.5;
                            System.out.println("За ноябрь начислено $" + onCard);
                            break;
                        case 12:
                            onCard = value * 1.5;
                            System.out.println("За декабрь начислено $" + onCard);
                            break;
                    }
                    if (onCard == 666.0) break;
                }
            }
        }
    }
}




