import java.util.ArrayList;
import java.util.Comparator;

public class TopTenExpensesCalculator extends TransactionAnalyzer{
    public TopTenExpensesCalculator(ArrayList<Transaction> statements) {
        super(statements);
    }

    @Override
    public double getTotalProfitLoss() {
        return 0;
    }

    @Override
    public int getTransactionAmount(int monthToCheck) {
        return 0;
    }

    @Override
    public ArrayList<Transaction> getTopTenExpenses() {
        ArrayList<Transaction> topTen = new ArrayList<>();
        statements.sort(Comparator.comparing(Transaction::getAmountSpent).reversed());

        for(int i=0; i<Math.min(statements.size(), 10); i++){
            topTen.add(statements.get(i));
        }

        return topTen;
    }

    @Override
    public String getTopExpenseCategory() {
        return null;
    }
}
