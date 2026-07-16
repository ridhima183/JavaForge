package newfeatures;
/**
*Author : Bhavna
*Date : 14-Jul-2026
*Time :12:24:09 pm
*email :ridhima.gadalay@gmail.com
*/
public class Order {
	
	public enum Side{ BUY, SELL }; //constant array

	private  int quantity; 
	private  String symbol; 
	private  double price; 
	private  Side side;
	
	//generate constructors 
	public Order(int quantity, String symbol, double price, Side side) {
		super();
		this.quantity = quantity;
		this.symbol = symbol;
		this.price = price;
		this.side = side;
	}
	
	//generate getters and setters
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}


	//generate toString() method 
	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", symbol=" + symbol + ", price=" + price + ", side=" + side + "]";
	}
	
	// sorting algorithm a > b -> returns positive	value
	
	  // if a>b == >0 , if a<b == <0 , if a==b  --> 0
	public static int compareByQuantity(Order a, Order b){ 
		return a.quantity - b.quantity; }  //  1000 - 500 = 500 / 500 -1000 = -500

	public int compareByPrice(Order a, Order b){ 
		return Double.valueOf(a.getPrice()).compareTo(Double.valueOf(b.getPrice())); 
	}
	
	

}
