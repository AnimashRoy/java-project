import AccountSystem.AccountForm;

import java.util.Scanner;
import java.util.ArrayList;

import MainFuction.*;
import CalculatorService.SimpleCalculator;
import CalculatorService.AdvancedCalculator;

public class AccountSystemManager {

    public static void main(String[] args) {

        ArrayList<AccountForm> Database = new ArrayList<>();

        AccountService ss;
        ss = new AccountServiceMessage();

        AccountService cs;
        cs = new CalculatorServiceMessage();

        while (true) {
            System.out.println("\nWelcome to our Bank Account Management System \n");
            System.out.println("1. Account Service");
            System.out.println("2. Calculator Service");
            System.out.println("0. Terminate\n");

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Option: ");
            int option = scan.nextInt();

            if (option == 0) {
                break;
            }
            if (option == 1) {

                ss.start_message();

                while (true) {

                    ss.service_info();

                    System.out.print("\nEnter Operation: ");
                    int operation = scan.nextInt();

                    if (operation == 0)
                        break;

                    switch (operation) { // create , read , update , delete operation start from here //
                        case 1: { // create
                            AccountForm Form = AccountFormFillUp.fillupform();
                            CRUDService.create(Form, Database);
                            break;
                        }
                        case 2: // read
                        {
                            System.out.print("Search Id: ");
                            int search_id = scan.nextInt();
                            CRUDService.read(search_id, Database);
                            break;
                        }
                        case 3: // update
                        {
                            System.out.print("Update Your Id: ");
                            AccountForm update_id = AccountFormFillUp.fillupform();
                            CRUDService.update(update_id, Database);
                            break;

                        }
                        case 4: // delete
                        {
                            System.out.print("Delete Id: ");
                            int delete_id = scan.nextInt();
                            CRUDService.delete(delete_id, Database);
                            break;
                        }
                        default:
                            System.out.println("Your Operation Request Invalid");
                    }

                }

                ss.end_message();

            } else if (option == 2) {

                cs.start_message();

                while (true) {
                    double x, y;
                    int a, b;

                    cs.service_info();
                    System.out.print("\nEnter Operation: ");
                    int operation = scan.nextInt();

                    if (operation == 0)
                        break;

                    switch (operation) {
                        case 1: { // addition
                            System.out.print("Enter 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter 2nd value: ");
                            b = scan.nextInt();
                            SimpleCalculator.add(a, b);
                            break;
                        }

                        case 2: { // subtraction
                            System.out.print("Enter 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter 2nd value: ");
                            b = scan.nextInt();
                            SimpleCalculator.sub(a, b);
                            break;
                        }

                        case 3: { // multiplication
                            System.out.print("Enter 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter 2nd value: ");
                            b = scan.nextInt();
                            AdvancedCalculator.multi(a, b);
                            break;
                        }

                        case 4: { // division
                            System.out.print("Enter 1st value: ");
                            x = scan.nextDouble();
                            System.out.print("Enter 2nd value: ");
                            y = scan.nextDouble();
                            AdvancedCalculator.div(x, y);
                            break;
                        }
                        default:
                            System.out.println("Your Operation Request Invaild");
                    }
                }
                cs.end_message();
            } else {
                System.out.println("Invalid Options");

            }

        }
    }
}