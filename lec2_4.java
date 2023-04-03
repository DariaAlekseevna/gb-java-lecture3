import java.util.ArrayList;
import java.util.List;

public class lec2_4 {
    public static void main(String[] args) {

        // когда мы написали ArrayList таким образом( называется сырой тип), мы сделали неявное преобразование к обджекту
        // мы не указали тип данных - преобразуем в обджект, так делать лучше не нужно
        List list = new ArrayList();
        list.add(2809);

        // лучше определять тип данных в угловых скобках;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(13);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
