public class lec3_3 {

    public static void main(String[] args) {

        // Массивы
        // есть массив из двух элементов, необходимо добавить третий
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i : a) {
            System.out.printf("%d ", i);
        } // 1 9
        System.out.println();
        for (int j : b) {
            System.out.printf("%d ", j);
        }
        // 1 9 0
        System.out.println();

// через метод
        int[] c = new int[] { 0, 9 };
        for (int i : c) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        c = AddItem(c, 5);
        c = AddItem(c, 3);
        for (int j : c) {
            System.out.printf("%d ", j);
        }

    }

    // метод добавляет один элемент в конец массива
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        // создаем новый массив с увелиенной длинной
        int[] temp = new int[length + 1];
        // копируем изначальный массив в новый
        System.arraycopy(array, 0, temp, 0, length);
        // добавляем элемент на последнюю позицию
        temp[length] = item;
        // возвращаем новый массив
        return temp;
    }

}
