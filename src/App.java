import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Welcome to Bank!");

        System.out.println("Enter the Account type [Saving/Kids]");
        Scanner scanner = new Scanner(System.in);
        String account_type;
        
        account_type = scanner.next();

        if (account_type.equals("Kids")) {
            String a,n;
            Double b;
            System.out.println("Enter Account : ");
            a = scanner.next();
            System.out.println("Enter Name : ");
            n = scanner.next();
            System.out.println("Enter deposit amount : ");
            b = scanner.nextDouble();

            Account kids = new Kids(a, n, b);

            kids.display();

            System.out.println("Enter Withdrawal Amount : ");
            double withdraw;
            withdraw = scanner.nextDouble();

            kids.withdraw(withdraw);

            kids.display();
        }else if (account_type.equals("Saving")) {
            String a,n;
            Double b;
            System.out.println("Enter Account : ");
            a = scanner.next();
            System.out.println("Enter Name : ");
            n = scanner.next();
            System.out.println("Enter deposit amount : ");
            b = scanner.nextDouble();

            Account saving = new Saving(a, n, b);

            saving.display();

            System.out.println("Enter Withdrawal Amount : ");
            double withdraw;
            withdraw = scanner.nextDouble();

            saving.withdraw(withdraw);

            saving.display();
        }
    }
}
