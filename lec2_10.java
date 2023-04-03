import java.util.Iterator;
import java.util.List;

public class lec2_10 {
    
    public static void main(String[] args) {
        // обычная коллекция сформированная с помощью listof
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        // цикл for each
        for (int item : list) {
            System.out.println(item); // элементы изменять нельзя
        }
        // на основе коллекции можем получить в тип итератор от интеджера путям вызова метода list.iterator
        Iterator<Integer> col = list.iterator();
        System.out.println();

        // в цикле выводим элементы, удалять(remove) или выводить дважды(next) нельзя - будет ошибка
        // изменять коллекцию здесь не нужно
        while (col.hasNext()) {
            //col.remove();
            System.out.println(col.next());
            //col.next();
        }
        
    }
}
