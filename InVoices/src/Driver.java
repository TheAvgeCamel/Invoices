public class Driver {

    public static void main(String[] args) {

        Customer C1 = new Customer("123","White Knight");
        Customer C2 = new Customer("1234","Danny Phantom");
        Customer C3 = new Customer("12345","Trevor Philip");

        C1.AddPurchase("Jello");
        C1.AddPurchase("Milk");
        C1.AddPurchase("Chocolate IceCream");
        C1.AddInvoice();

        C2.AddPurchase("Crackers");
        C2.AddPurchase("Rum");
        C2.AddPurchase("HotDog");
        C2.AddInvoice();

        C3.AddPurchase("Chicken");
        C3.AddPurchase("Beef");
        C3.AddPurchase("P.C");
        C3.AddInvoice();



    }


}
