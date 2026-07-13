package collectionsdemo;

import java.util.Objects;

/**
 * Author : Bhavna 
 * Date : 10-Jul-2026 
 * Time :3:05:43 pm 
 * email :ridhima.gadalay@gmail.com
 */
public class Product {

	private int productId;
	private String productName;
	private double price;

	// Constructor
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	// Getters
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	// Setter for modifying price (Required for updating items in place)
	public void setPrice(double price) {
		this.price = price;
	}

	// Hashcode and equals based on productId only.
	// This ensures HashSet works flawlessly even after updating prices.
	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productId == other.productId;
	}

	// toString
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
}
