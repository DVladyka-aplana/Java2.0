import java.util.Scanner;
//Задание №2
//
//1. Начинаем писать калькулятор:
//
//Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе результата в консоль. Полученный результат округлять до 4-х знаков после запятой.
//
//2. Запушить проект в свой репозиторий на GitHub
//
//*Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("<<< Запуск калькулятора >>>");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextDouble();
        System.out.println("Введите действие: ");
        char z = in.next().charAt(0);
        System.out.println("Введите число y: ");
        double y = in.nextDouble();

        double result;
        switch (z) {
            case '+':
                result = x + y;
                System.out.println(x+""+z+""+y);
                System.out.printf("%.4f",result);
                break;
            case '-':
                result = x - y;
                System.out.println(x+""+z+""+y);
                System.out.printf("%.4f",result);
                break;
            case '*':
                result = x * y;
                System.out.println(x+""+z+""+y);
                System.out.printf("%.4f",result);
                break;
            case '/':
                result = x / y;
                System.out.println(x+""+z+""+y);
                System.out.printf("%.4f",result);
                break;
            default:
                System.out.println("Ошибка");
                System.exit(0);
        }
    }
}

