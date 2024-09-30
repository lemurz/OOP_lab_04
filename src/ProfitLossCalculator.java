import java.util.ArrayList;

public class ProfitLossCalculator extends TransactionAnalyzer{
    public ProfitLossCalculator(ArrayList<Transaction> statements) {
        super(statements);
    }

    @Override
    public double getTotalProfitLoss() {
            double total = 0;

            for(Transaction t : statements){
                double earned = t.getAmountEarned();
                double spent = t.getAmountSpent();

                total += (earned-spent);
            }

            return total;
    }

    @Override
    public int getTransactionAmount(int monthToCheck) {return 0;}

    @Override
    public ArrayList<Transaction> getTopTenExpenses() {return null;}

    @Override
    public String getTopExpenseCategory() {return null;}
}
