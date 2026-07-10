package oopdemo;

/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :9:57:48 am
 *email :ridhima.gadalay@gmail.com
 *Java OOP to enter ProductId,Product Name, price & qty, calculate the Total bill 
 * & display details
 * 
 * Note: Product Name Should be multiple words.
 */
public class Product {

	private int productId;
	private String productName;
	private float price;
	private int quantity;

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + ", getproductId()=" + getProductId() + ", getProductId()=" + getProductId()
				+ ", getProductName()=" + getProductName() + ", getPrice()=" + getPrice() + ", getQuantity()="
				+ getQuantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public void display()
	{
		System.out.println("************* Welcome to Product Mart  **************");
		System.out.println("Product id: " +productId);
		System.out.println("Product Name: " +productName);
		System.out.println("Product price: " +price);
		System.out.println("Product Quantity: " +quantity);
		System.out.println("---------------------------------------------------------");
		System.out.println("Total Bill : " +totalBill());
		System.out.println("-----------------------------------------------------------");
	}

	public float totalBill()
	{
		return ((this.price)*(this.quantity));
	}
}