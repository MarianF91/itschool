package course22.homework.challenge8;

import java.util.List;

@FunctionalInterface
public interface OddNumbersSelector {
    List<Integer> oddNumbersFilter(List<Integer> oddNumbers);
}
