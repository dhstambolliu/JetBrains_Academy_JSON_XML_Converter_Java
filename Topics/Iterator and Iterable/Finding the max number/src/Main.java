import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.max;

public class Main {

    public static int findMaxByIterator(Iterator<Integer> iterator) {
        // write your code here
        int result = 0;
        while (iterator.hasNext()) {
            result = Math.max(result, iterator.next());
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(findMaxByIterator(list.iterator()));
    }
}