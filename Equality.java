import java.util.ArrayList;
import java.util.List;

public class Equality {
    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(5);
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(2);
        second.add(3);
        second.add(4);
        second.add(5);
        if (equality(first, second)) {
            System.out.println("all parameters is equals :) ");
        } else {
            System.out.println("all parameters is not equals :( ");
        }


    }

    public static <E, F> boolean equality(List<E> firstParam, List<F> secondParam) {
        if (firstParam.equals(secondParam)) {
            return true;
        }
        return false;
    }
}
