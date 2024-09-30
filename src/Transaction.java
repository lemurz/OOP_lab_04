import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Transaction {
    private final String dateOfTransaction;
    private final double amountSpent;
    private final double amountEarned;
    private String category;

    public Transaction(String dateOfTransaction, double amountSpent, double amountEarned, String category){
        this.dateOfTransaction = dateOfTransaction;
        this.amountSpent = amountSpent;
        this.amountEarned = amountEarned;
        this.category = category;
    }
    public double getAmountEarned(){
        return amountEarned;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public String getDateOfTransaction() {
        return dateOfTransaction;
    }

    public String getCategory(){
        return category;
    }
}
