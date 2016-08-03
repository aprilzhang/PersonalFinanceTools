public class InterestCalculator
{
  public static void main( final String[] args )
  {
    double maxIncome = Double.MIN_VALUE;
    int bestInterval = 34;
    for ( int transferInterval = 34; transferInterval > 0; transferInterval-- )
    {
      double overallIncome = getAndPrintResult( transferInterval );
      if ( maxIncome < overallIncome )
      {
        maxIncome = overallIncome;
        bestInterval = transferInterval;
      }
      System.out.println();
    }
    System.out.println( "Max income is " + maxIncome + " when we transer every " + bestInterval + " months" );
  }

  private static double getAndPrintResult( final int transferInterval )
  {
    final double maximumTransfer = 6323;
    final double minimumPayment = 25;
    final int interestFreeMonth = 34;
    final double savingInterest = 0.03;

    double transferFee = 0;
    double debt = 0;

    double totalInterestGained = 0;
    for ( int month = 0; month < interestFreeMonth; month++ )
    {
      if ( month % transferInterval == 0 )
      {
        double newTransferFee = ( maximumTransfer - debt ) * 0.0169;
        transferFee += newTransferFee;
        System.out.println( "At the beginning of the month, transfer in " + ( maximumTransfer - debt ) );
        System.out.println( "It cost " + newTransferFee + " for the transfer fee" );
        debt = maximumTransfer;
      }
      final double interestGained = debt * savingInterest / 12.;
      totalInterestGained += interestGained;
      debt -= minimumPayment;
      System.out.println( "Interest gained in the " + month + "th month is " + interestGained + ", outstanding debt is " + debt );
    }
    System.out.println( "Final payment is " + debt );
    System.out.println( "Total interest gained is " + totalInterestGained );
    System.out.println( "Total transfer fee is " + transferFee );
    final double overallIncome = totalInterestGained - transferFee;
    System.out.println( "Overall income is " + overallIncome );
    return overallIncome;
  }
}
