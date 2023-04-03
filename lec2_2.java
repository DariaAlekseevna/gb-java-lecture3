public class lec2_2 {
    public static void main(String[] args) {

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            // при возвращении преобразуем в обджект, это не обязательно делать, но так как метод должен возвращать тип обджект, то так более грамотно
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else
            return 0;

        // вроде метод один, но слишком много проверок, сказывается на производительности, не очень хорошо
        // чем меньше преобразований из обджекта и в обджект, тем быстрее будет все работать
        // использовать обджект нужно очень аккуратно,
        // и лучше в крайнем случае, так как этот тип принимает все, то может быть передано значение того типа, что не был учтен
    }
}
