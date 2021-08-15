import java.util.Scanner;

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

