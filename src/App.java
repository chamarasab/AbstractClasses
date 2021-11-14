import java.util.Scanner;

public class App {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) throws Exception {
        
        System.out.println(ANSI_YELLOW + "Hello, Welcome to Bank!" + ANSI_RESET);

        System.out.println(ANSI_GREEN + "Enter the Account type [Saving/Kids]" + ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        String account_type;
        
        account_type = scanner.next();

        if (account_type.equals("Kids")) {
            String a,n;
            Double b;
            System.out.println(ANSI_CYAN + "Enter Account No: " + ANSI_RESET);
            a = scanner.next();
            System.out.println(ANSI_CYAN + "Enter Name : " + ANSI_RESET);
            n = scanner.next();
            System.out.println(ANSI_CYAN + "Enter deposit amount : " + ANSI_RESET);
            b = scanner.nextDouble();

            Account kids = new Kids(a, n, b);

            kids.display();

            System.out.println(ANSI_RED + "Enter Withdrawal Amount : " + ANSI_RESET);
            double withdraw;
            withdraw = scanner.nextDouble();

            kids.withdraw(withdraw);

            kids.display();
        }else if (account_type.equals("Saving")) {
            String a,n;
            Double b;
            System.out.println(ANSI_CYAN + "Enter Account No: " + ANSI_RESET);
            a = scanner.next();
            System.out.println(ANSI_CYAN + "Enter Name : " + ANSI_RESET);
            n = scanner.next();
            System.out.println(ANSI_CYAN + "Enter deposit amount : " + ANSI_RESET);
            b = scanner.nextDouble();

            Account saving = new Saving(a, n, b);

            saving.display();

            System.out.println(ANSI_RED + "Enter Withdrawal Amount : " + ANSI_RESET);
            double withdraw;
            withdraw = scanner.nextDouble();

            saving.withdraw(withdraw);

            saving.display();
        }
        scanner.close();
    }
}
