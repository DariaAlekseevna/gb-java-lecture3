import java.util.Arrays;
import java.util.List;

public class lec2_8 {
    public static void main(String[] args) {
        // используем простой тип int
        // int day = 29;
        // int month = 9;
        // int year = 1990;
        // Integer[] date = { day, month, year };
        // List<Integer> d = Arrays.asList(date);
        // System.out.println(d); // [29, 9, 1990]


        // используем сложный тип StringBuilder
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        // создаем массив date
        StringBuilder[] date = new StringBuilder[] { day, month, year };
        // кладем массив в коллекцию 
        List<StringBuilder> d = Arrays.asList(date);
        // меняем значение в массиве
        System.out.println(d); // [29, 9, 1990]
        // при изменении данных в массиве, данные меняются и в коллекции!
        date[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]

        // стринг билдер является ссылочным типом - day, month, year - определятся в стеке - а значение опред. в куче
        // аналогично работает для массива стрингбилдер и для коллекции стрнгбилдер

    }   
}
