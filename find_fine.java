import java.util.*;

public class find_fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of vehicles
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        // Input: current day
        System.out.print("Enter the current day of month: ");
        int day = sc.nextInt();

        int[] car = new int[n];
        int[] fine = new int[n];

        // Input: car numbers
        System.out.println("Enter car numbers:");
        for (int i = 0; i < n; i++) {
            car[i] = sc.nextInt();
        }

        // Input: fine for each car
        System.out.println("Enter fines for each car:");
        for (int i = 0; i < n; i++) {
            fine[i] = sc.nextInt();
        }

        int totalFine = 0;

        for (int i = 0; i < n; i++) {
            if (day % 2 == 0 && car[i] % 2 != 0) {
                // Even day, odd car number
                totalFine += fine[i];
            } else if (day % 2 != 0 && car[i] % 2 == 0) {
                // Odd day, even car number
                totalFine += fine[i];
            }
        }

        System.out.println("Total Fine Collected: " + totalFine);
        sc.close();
    }
}
