import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopExpenseCategoryCalculator extends TransactionAnalyzer{
    public TopExpenseCategoryCalculator(ArrayList<Transaction> statements) {
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
        return null;
    }

    @Override
    public String getTopExpenseCategory() {
        Map<String, Double> categoryTotals = new HashMap<>();

        for(Transaction t : statements){
            String category = t.getCategory();
            double amountSpent = t.getAmountSpent();
            categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) + amountSpent);
        }

        String topCategory = null;
        double maxAmount = 0.0;

        for(Map.Entry<String, Double> entry : categoryTotals.entrySet()){
            if(entry.getValue() > maxAmount){
                maxAmount = entry.getValue();
                topCategory = entry.getKey();
            }
        }

        return topCategory;
    }
}
