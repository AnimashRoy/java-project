package MainFuction;

public class AccountServiceMessage extends AccountService {

    @Override
    public void start_message()
    {
        System.out.println("\nWelcome To Our Account Service");
    }

    @Override
    public void end_message()
    {
        System.out.println("Thanks For Stay With Us");
    }

    @Override
    public void service_info()
    {
        System.out.println("\nAccount Services: ");
        System.out.println("#1. Create");
        System.out.println("#2. Read");
        System.out.println("#3. Update");
        System.out.println("#4. Delete");
        System.out.println("#0. Terminate");
    }
}
