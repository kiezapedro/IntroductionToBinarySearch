import java.util.Scanner;

public class BrokenEconomy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements (denominations)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the foreigner's requested denomination
        int d = sc.nextInt();

        Integer floor = null, ceiling = null;

        for (int i = 0; i < n; i++) {
            if (arr[i] == d) {
                floor = ceiling = arr[i];
                break;
            } else if (arr[i] < d) {
                floor = arr[i];
            } else if (arr[i] > d && ceiling == null) {
                ceiling = arr[i];
            }
        }

        if (floor != null && ceiling != null && floor.equals(ceiling)) {
            System.out.println("Denomination available: " + floor);
        } else {
            System.out.println("Nearest denominations available: " + floor + " and " + ceiling);
        }
    }
}
