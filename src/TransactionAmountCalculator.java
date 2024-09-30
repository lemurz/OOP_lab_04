import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TransactionAmountCalculator extends TransactionAnalyzer{
    public TransactionAmountCalculator(ArrayList<Transaction> statements) {
        super(statements);
    }

    @Override
    public double getTotalProfitLoss() {
        return 0;
    }

    @Override
    public int getTransactionAmount(int monthToCheck) {

        int totalAmount = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        for(Transaction t : statements){
            try{
                Date date = sdf.parse(t.getDateOfTransaction());
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);

                int transactionMonth = calendar.get(Calendar.MONTH);

                if(transactionMonth==(monthToCheck-1)){
                    totalAmount++;
                }
            }
            catch(ParseException e){
                e.printStackTrace();
            }
        }

        return totalAmount;
    }

    @Override
    public ArrayList<Transaction> getTopTenExpenses() {
        return null;
    }

    @Override
    public String getTopExpenseCategory() {
        return null;
    }
}
