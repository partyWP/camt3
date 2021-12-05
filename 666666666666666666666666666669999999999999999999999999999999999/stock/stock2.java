package stock;

public class stock2 {
    
    public static void main(String[] args) {
        stock1 stock = new stock1("ORCL" , "oracle Corporation");
        stock.setcurrprice(34.35);
        stock.setpricecurr(34.5);
        
        System.out.println("ORCL \noracle Corporation");
        System.out.println("stock1 =" + stock.getChangePerrcent() );

    }
}
