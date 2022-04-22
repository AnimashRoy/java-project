package MainFuction;

public  class CalculatorServiceMessage extends AccountService {

    @Override
    public void start_message()
    {
        System.out.println("\nWelcome To Our Calculator Service");
    }

    @Override
    public void end_message()
    {
        System.out.println("Thanks for Using Our Calculator Service");
    }

    @Override
    public void service_info()
    {
        System.out.println("\nCalculator Service: ");
        System.out.println("#1. Addition");
        System.out.println("#2. Summation");
        System.out.println("#3. Multiply");
        System.out.println("#4. Division");
        System.out.println("#0. Terminate");
    }

}
