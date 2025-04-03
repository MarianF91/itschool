package course22.homework.challenge7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListMapImpl {
    public static void main(String[] args) {

        ListMap listMap = (integerList, integerFunction) -> {
            List<Integer> newIntegerList = new ArrayList<>();
            for (Integer i : integerList) {
                newIntegerList.add(integerFunction.apply(i));
            }
            return newIntegerList;
        };

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        Function<Integer, Integer> addition = x -> x + 2;

        List<Integer> additionResults = listMap.listMapper(integers, addition);
        System.out.println(additionResults);
    }
}