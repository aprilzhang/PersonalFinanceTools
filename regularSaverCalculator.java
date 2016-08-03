public class RegularSaverCalculator
{
  public static void main( final String[] args )
  {
    final double monthlyPayment = 200;
    final double anualInterest = 0.05;
    double totalSaving = 0;
    double totalInterestGained = 0;
    for ( int i = 0; i < 12; i++ )
    {
      totalSaving += monthlyPayment;
      totalInterestGained += totalSaving * anualInterest / 12;
    }
    System.out.println( "Total interests gained at the end of the year = " + totalInterestGained );
    final double equivalentInterest = totalInterestGained / ( monthlyPayment * 12. );
    System.out.println( "If you have " + ( monthlyPayment * 12. ) + " at the beginning, the equivalent interest from this regular saver is " + equivalentInterest );
  }
}
