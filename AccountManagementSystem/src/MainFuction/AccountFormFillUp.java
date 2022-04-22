package MainFuction;

import AccountSystem.AccountForm;

import java.util.Scanner;

public class AccountFormFillUp {

    public static AccountSystem.AccountForm fillupform() {

        System.out.println("\nFill Up Your Form Below");

        Scanner scan = new Scanner(System.in);

        System.out.print("ID: ");
        int id = scan.nextInt();

        scan.nextLine();

        System.out.print("Name: ");
        String name = scan.next();

        System.out.print("Age: ");
        int age = scan.nextInt();

        System.out.print("Gender: ");
        String gender = scan.next();

        System.out.print("Contact: ");
        String contact = scan.next();

        System.out.print("Address: ");
        String address = scan.next();

        AccountForm Form = new AccountForm(
                id,
                name,
                age,
                gender,
                contact,
                address
        );
        return Form;
    }

}
