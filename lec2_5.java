import java.util.ArrayList;
import java.util.List;

public class lec2_5 {
    public static void main(String[] args) {
        // пример с сырыми типами. Row Type
        List list = new ArrayList();
        list.add(2809);
        list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных

        }
    }
}
