import java.util.Iterator;

public class Invoices {

    public static int Invoice = 0;

    public Invoices() {

        System.out.println("Invoice Number : "+ (++Invoice*5));
        System.out.println("Customer ID : "+Customer.getCusID()+" | "+"Name : "+Customer.getCusName());
        System.out.println("Purchases:");


        Iterator<String> iterator = Customer.purchase.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------------------------");
        System.out.println();

        Customer.purchase.clear();

    }
}
