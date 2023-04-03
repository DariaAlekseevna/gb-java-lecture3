import java.util.ArrayList;
import java.util.List;

public class lec3_9 {
    public static void main(String[] args) {
        // создаем лист символов на основе функционала лист оф
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        // есть функционал позволяющий удалять эл-ты из коллекции
        // но если коллекция сформирована list of, то нельзя сделать remove - будет ошибка
        // list1.remove(1); // java.lang.UnsupportedOperationException

        // но если сделать стандартным функционалом - все получится
        List<Character> list3 = new ArrayList<>();
        list3.add('s');
        list3.add('e');
        list3.add('s');
        list3.add('e');
        list3.remove(1);
        System.out.println(list3);

    }
}
