import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        List<String[]> rows = new ArrayList<>();
        for (int i = 0; i < dimensions[0]; i++) {
            rows.add(scanner.nextLine().split("\\s+"));
        }
        Collections.rotate(rows, scanner.nextInt());
        rows.forEach(row -> {
            for (String entry : row) {
                System.out.printf("%s ", entry);
            }
            System.out.println();
        });
    }
}