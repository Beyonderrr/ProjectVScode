public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    public Stock(String symbol,String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(double previousClosingPrice,double currentPrice){
        return((currentPrice-previousClosingPrice)*100)/previousClosingPrice;
    }

}


