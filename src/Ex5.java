import jdk.internal.icu.impl.CharacterIteratorWrapper;
import java.util.ArrayList;
import java.util.Scanner;
//Задание №4
//2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.) У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей. Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> MyArrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        double totalpr = 0;
        double totalmass = 0;
        boolean endchose = false;
        System.out.println("<<<Формирование подарочного набора>>>");
        System.out.println("<Введите число и нажмите Enter, чтобы добавить сладость в подарок:");
        System.out.println("<'1' - \"Mars\"");
        System.out.println("<'2' - \"Маска\"");
        System.out.println("<'3' - \"Дюшес\"");
        System.out.println("<'4' - закончить выбор");
        while (!endchose) {
            int x = in.nextInt();
            switch (x) {
                case 1:
                    Sweet sweet1 = new Sweet("Mars", 200, 500, "Шоколадные конфеты Марс");
                    String name1 = sweet1.getName();
                    MyArrayList.add(name1);
                    totalpr = totalpr + sweet1.getPrice();
                    totalmass = totalmass + sweet1.getWeight();
                    System.out.println("Конфеты \"Mars\" добавлены в корзину");
                    break;
                case 2:
                    Sweet sweet2 = new Sweet("Маска", 100, 600, "Шоколадные конфеты Маска");
                    String name2 = sweet2.getName();
                    MyArrayList.add(name2);
                    totalpr = totalpr + sweet2.getPrice();
                    totalmass = totalmass + sweet2.getWeight();
                    System.out.println("Конфеты \"Маска\" добавлены в корзину");
                    break;
                case 3:
                    Sweet sweet3 = new Sweet("Дюшес", 50, 450, "Леденцы Дюшес");
                    String name3 = sweet3.getName();
                    MyArrayList.add(name3);
                    totalpr = totalpr + sweet3.getPrice();
                    totalmass = totalmass + sweet3.getWeight();
                    System.out.println("Леденцы \"Дюшес\" добавлены в корзину");
                    break;
                case 4:
                    endchose = true;
                    break;
            }

        }
        int kolmars = 0;
        int kolmask = 0;
        int koldush = 0;
        for(int i = 0; i<MyArrayList.size(); i++) {
            String name = MyArrayList.get(i);
            if (name=="Mars"){
                kolmars=kolmars+1;
            }
            else if (name=="Маска"){
                kolmask=kolmask+1;
            }
            else if (name=="Дюшес"){
                koldush=koldush+1;
            }
        }
        System.out.println("<<<Сформирован подарочный набор>>>");
        System.out.println("Конфеты Mars: "+kolmars+" шт." );
        System.out.println("Конфеты Маска: "+kolmask+" шт.");
        System.out.println("Конфеты Дюшес: "+koldush+" шт.");
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalmass, totalpr));
    }
}
