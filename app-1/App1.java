import java.util.Scanner;

public class App1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String RESET = "\033[0m";
        final String DASHBOARD = "Welcome to SMS";
        final String ADD_STUDENT = "Add New Student";
        final String REMOVE_STUDENT = "Remove Student";
        final String PRINT_DETAILS = "Print Student Details";
        String screen = DASHBOARD;

        do {
            final String APP_TITLE = String.format("%s%s%s",
                                COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("-".repeat(30));
            System.out.println(" ".repeat((30 - APP_TITLE.length() + 7)/2).concat(APP_TITLE));
            System.out.println("-".repeat(30));

            switch(screen){
                case DASHBOARD: 
                    System.out.println("\n[1]. Add New Student");
                    System.out.println("[2]. Remove Existing Student");
                    System.out.println("[3]. Print Student Details");
                    System.out.println("[4]. Exit\n");
                    System.out.print("Enter an option to continue > ");
                    int option = SCANNER.nextInt();
                    SCANNER.nextLine();

                    switch (option){
                        case 1: screen = ADD_STUDENT; break;
                        case 2: screen = REMOVE_STUDENT; break;
                        case 3: screen = PRINT_DETAILS; break;
                        case 4: System.exit(0); break;
                        default: continue;
                    }
                    break;
                case ADD_STUDENT:
                    System.out.println("New Student ID: S001");
                    System.out.print("Enter Student Name: ");
                    String name = SCANNER.nextLine();
                    System.out.print(name + " added sucessfully. Do you want to add new student (Y/n)? ");
                    if (SCANNER.nextLine().strip().toUpperCase().equals("Y")) continue;
                    screen = DASHBOARD;
                    break;
                default:
                    System.exit(0);
            }
            
        }while(true);
    }
}