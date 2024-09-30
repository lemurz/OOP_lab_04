import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class TransactionAnalyzer {

    ArrayList<Transaction> statements;

    public TransactionAnalyzer(ArrayList<Transaction> statements){
        this.statements = statements;
    }

    public abstract double getTotalProfitLoss();

    public abstract int getTransactionAmount(int monthToCheck);


    public abstract ArrayList<Transaction> getTopTenExpenses();

    public abstract String getTopExpenseCategory();


}
