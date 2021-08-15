import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
//Задание №6:
//
//Есть входной файл с набором слов, написанных через пробел
//
//Необходимо:
//
//Прочитать слова из файла.
//
//Отсортировать в алфавитном порядке.
//
//Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль
//
//Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
public class Ex7 {
    public static void main(String[] args) throws IOException {
        //Прочитать слова из файла
        FileInputStream stream = new FileInputStream("src/java2.txt");
        int lenght = stream.available();
        byte [] data = new byte[lenght];
        stream.read(data);
        String text = new String(data);
        String [] myArr = text.split(" ");


        ArrayList<String> MyArrayList = new ArrayList<>();
        for (String words:myArr) {
            MyArrayList.add(words);
        }
        System.out.println("<<<Прочитать слова из файла>>>");
        System.out.println(MyArrayList);
        Collections.sort(MyArrayList);
        //Сортировка слов в алфавитном порядке
        System.out.println("<<<Отсортировать в алфавитном порядке>>>");
        System.out.println(MyArrayList);

        Set<String> noDubl = new HashSet<String>(MyArrayList);

        ArrayList<String> MyArrayList1 = new ArrayList<>();
        for (String ewords:noDubl){
            MyArrayList1.add(ewords);
        }
        int kol=0;
        int maxI=0;
        int kolMaxI=0;
        System.out.println("<<<Сколько раз каждое слово встречается в файле>>>");
        for (int i=0; i<MyArrayList1.size(); i=i+1){
            String oneWord = MyArrayList1.get(i);
            kol=0;
            for (int j=0; j<MyArrayList.size(); j=j+1){
                String dubWord = MyArrayList.get(j);
                if(oneWord.equals(dubWord)){
                    kol=kol+1;
                }
            }
            if (kolMaxI<kol){
                maxI = i;
                kolMaxI = kol;
            }
            System.out.println(oneWord + " - " + kol);
        }
        System.out.println("<<<Слово с максимальным количеством повторений>>>");
        System.out.println(MyArrayList1.get(maxI) + " - "+ kolMaxI);
    }
}
