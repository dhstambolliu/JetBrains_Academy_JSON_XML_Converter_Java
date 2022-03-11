import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        // write your code here
        List<String> list = new ArrayList<>(List.of(array));
        // list.removeIf(e -> !e.startsWith("J"));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (!element.startsWith("J")) {
                iterator.remove();
            } else {
                iterator.set(element.substring(1));
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}