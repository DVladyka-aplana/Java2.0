import java.util.Arrays;
import java.util.Random;
//Задание №4
//
//1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
public class Ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[20];
        int maxNumber = -11;
        int minNumber = 11;
        int imax = 0;
        int imin = 0;
        for (int i=0; i < 20; i++) {
            int x = (int) (Math.random() * 20 - 10);
            myArray[i] = x;
            if(maxNumber <= myArray[i]) {
                maxNumber = myArray[i];
                imax = i;
            }
            if(minNumber >= myArray[i]) {
                minNumber = myArray[i];
                imin = i;
            }
        }
        System.out.println("<<<Сформирован произвольный массив>>>");
        System.out.println(Arrays.toString(myArray));
        System.out.println("<Максимальный элемент массива: "+maxNumber);
        System.out.println("<Минимальный элемент массива: "+minNumber);
        myArray[imax] = minNumber;
        myArray[imin] = maxNumber;
        System.out.println("<<<Поменять максимальный и минимальный элемент>>>");
        System.out.println(Arrays.toString(myArray));
    }
}
