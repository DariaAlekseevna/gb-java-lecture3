import java.util.ArrayList;
import java.util.List;

public class lec2_6 {

    public static void main(String[] args) {
// пример с Save Type. явно указан тип обобщения который используется
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(123);
        // list.add("string line"); - будут невозможно на этапе компеляции
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }

    }
}
