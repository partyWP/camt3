package stock;

public class stock1 {
    
       static String symbol;
        String name;
        double previousClosingPrice;
        double currentprice;

        public stock1(String newsym, String newname ) {
            symbol = newsym ;
            name = newname ;
        }
        public double getChangePerrcent() {
            return ((currentprice - previousClosingPrice) / previousClosingPrice) * 100;
        }
        public void setpricecurr(double price) {
            previousClosingPrice = price;
        }
        public void setcurrprice(double currprice) {
            currentprice = currprice;
        }
        public double getpriceurr() {
            return previousClosingPrice;
        }
        public double getcurrprice() {
            return currentprice;
        }
        public String getsymbol() {
            return stock1.symbol;
        }

    }

