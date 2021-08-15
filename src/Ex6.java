import java.util.InputMismatchException;
import java.util.Scanner;
//Задание №5:
//
//Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
public class Ex6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<<<Запуск Калькулятора>>>");
        System.out.println("<Введите число X и нажмите Enter");
        double x = 0;
        try {
            x = in.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: введено не число!");
            System.exit(0);
        }
        System.out.println("<Введите действие (+,-,*,/) и нажмите Enter");
        char z = in.next().charAt(0);
        System.out.println("<Введите число Y и нажмите Enter");
        double y = 0;
        try {
            y = in.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: введено не число!");
            System.exit(0);
        }

        switch (z) {
            case '+':
                OperationCalc opPlus = new OperationCalc(x, y);
                double answ = opPlus.getAnswPlus();
                System.out.print("<Ответ: "+x+" "+"+"+" "+y+" "+"="+" "+answ);
                break;
            case '-':
                OperationCalc opMinus = new OperationCalc(x, y);
                answ = opMinus.getAnswMinus();
                System.out.print("<Ответ: "+x+" "+"-"+" "+y+" "+"="+" "+answ);
                break;
            case '*':
                OperationCalc opUm = new OperationCalc(x, y);
                answ = opUm.getAnswUm();
                System.out.print("<Ответ: "+x+" "+"*"+" "+y+" "+"="+" "+answ);
                break;
            case '/':
                OperationCalc opDel = new OperationCalc(x, y);
                answ = opDel.getAnswDel();
                System.out.print("<Ответ: "+x+" "+"/"+" "+y+" "+"="+" "+answ);
                break;
        }
    }
}
