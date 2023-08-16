import java.util.Arrays;
import java.util.Scanner;

public class App3{
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] customers = new String[0][];

        String id;
        String name;
        String address;

        do{
            System.out.println("--------------------");
            for (int i = 0; i < customers.length; i++) {
                System.out.println(Arrays.toString(customers[i]));
            }
            System.out.println("--------------------");

            System.out.print("Enter Customer ID: ");
            id = SCANNER.nextLine().strip();

            System.out.print("Enter Customer Name: ");
            name = SCANNER.nextLine().strip();

            System.out.print("Enter Customer Address: ");
            address = SCANNER.nextLine().strip();

            String[][] newCustomers = new String[customers.length + 1][3];
            for (int i = 0; i < customers.length; i++) {
                newCustomers[i] = customers[i];
            }
            newCustomers[newCustomers.length - 1][0] = id;
            newCustomers[newCustomers.length - 1][1] = name;
            newCustomers[newCustomers.length - 1][2] = address;

            customers = newCustomers;

        }while(true);
    }
}