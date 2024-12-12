import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
    Scanner scan =new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.next();
        System.out.print("Enter your amount: ");
        double enamount = scan.nextDouble();
        CertificateOfDeposit ce = new CertificateOfDeposit(name, enamount);
    ce.deposit(enamount);
        System.out.print("\nEnter your amount to withdraw: ");
        double amou2 = scan.nextDouble();
    ce.withdraw(amou2);
    ce.showbal();

    }
}