import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Stream.of(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int numberOfSwaps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfSwaps; i++) {
            int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            Collections.swap(list, indexes[0], indexes[1]);
        }
        list.forEach(e -> System.out.printf("%d ", e));
    }
}