import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                Collections.frequency(List.of(scanner.nextLine().split(" ")), scanner.nextLine())
        );
    }
}