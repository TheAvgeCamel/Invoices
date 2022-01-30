import java.util.ArrayList;

public class Customer {

    public static String CusName, CusID;
    public static ArrayList<String> purchase = new ArrayList<>();

     public Customer() {
    }

    public Customer(String cusID, String cusName) {

        CusName = cusName;
        CusID = cusID;
    }

    public void AddPurchase(String Purchase){

         purchase.add(Purchase);

    }

    public void AddInvoice(){

         Invoices invoices = new Invoices();

    }

    public static String getCusName() {
        return CusName;
    }

    public  void setCusName(String cusName) {
        CusName = cusName;
    }

    public static String getCusID() {
        return CusID;
    }

    public void setCusID(String cusID) {
        CusID = cusID;
    }

}

