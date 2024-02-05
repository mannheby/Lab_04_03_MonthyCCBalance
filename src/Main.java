public class Main
{
    public static void main(String[] args)
    {
        double cardBalance = 5000.00; // initialize variables
        final double INTEREST_RATE = .17;
        cardBalance = cardBalance * INTEREST_RATE + cardBalance; // month one calculated
        System.out.println("Your interest due after one month is " + cardBalance); // output
        cardBalance = cardBalance * INTEREST_RATE + cardBalance; // month two
        System.out.println("Your interest due after two months is " + cardBalance); // output
    }
}