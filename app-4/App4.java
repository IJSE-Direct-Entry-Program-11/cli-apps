import java.util.Scanner;

public class App4 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "👷 Welcome to DEP-11 Phase-1 Assignment Marks Collector";
        final String ADD_ASSIGNMENT_MARKS = "➕ Add Assignment Marks";
        final String PRINT_DETAILS = "🖨 Print Assignment Marks";

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String screen = DASHBOARD;
        String[][] students = new String[0][];

        do {
            final String APP_TITLE = String.format("%s%s%s",
                                    COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){
                case DASHBOARD:{
                    System.out.println("\t[1]. Add Assignment Marks");
                    System.out.println("\t[2]. Print Assignment Marks");
                    System.out.println("\t[3]. Exit");
                    System.out.print("\n\t Enter an option to continue: ");

                    int option = SCANNER.nextInt();
                    SCANNER.nextLine();

                    switch(option){
                        case 1: screen = ADD_ASSIGNMENT_MARKS; break;
                        case 2: screen = PRINT_DETAILS; break;
                        case 3: System.out.println(CLEAR); System.exit(0);
                    }
                    break;
                }case ADD_ASSIGNMENT_MARKS:{
                    String id;
                    String name;
                    double marks;
                    boolean valid;
    
                    /* Let's Validate ID */
                    do {
                        valid = true;
                        System.out.print("\tEnter Student ID: ");
                        id = SCANNER.nextLine();


                    }while(true);

                    /* Let's Validate Name */

                    /* Let's Validate Marks */
                    
                    break;
                }case PRINT_DETAILS:{
                    break;
                }
            }
        }while(true);
    }
}