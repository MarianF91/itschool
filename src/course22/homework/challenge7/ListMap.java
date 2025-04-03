package course22.homework.challenge7;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface ListMap {
    List<Integer> listMapper(List<Integer> integerList, Function<Integer, Integer> integerFunction);
}
