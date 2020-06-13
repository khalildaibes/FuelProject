package logic;

public class Product {
	private int product_id;
	private String name;
	private String description;
	private String supplier;
	private float price;
	private float low_quantity;
	private float quantity;
	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	private float min_quantity;
	public String gas_station;

	public Product(int product_id, String gas_station, float price, float low_quantity, float min_quantity,
			String supplier, String name) {

		setGas_station(gas_station);
		setLow_quantity(low_quantity);
		setLow_quantity(low_quantity);
		setName(name);
		setPrice(price);
		setProduct_id(product_id);
		setSupplier(supplier);

	}

	public Product(int product_id, float price,  float quantity,String name) {

		setQuantity(quantity);
		setName(name);
		setPrice(price);
		setProduct_id(product_id);
	}

	public String getGas_station() {
		return gas_station;
	}

	public void setGas_station(String gas_station2) {
		this.gas_station = gas_station2;
	}

	// public Report _unnamed_Report_;
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier2) {
		this.supplier = supplier2;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getLow_quantity() {
		return low_quantity;
	}

	public void setLow_quantity(float low_quantity) {
		this.low_quantity = low_quantity;
	}

	public float getMin_quantity() {
		return min_quantity;
	}

	public void setMin_quantity(float min_quantity) {
		this.min_quantity = min_quantity;
	}

	public String toString() {
		return product_id + "" + gas_station + "" + price + "" + low_quantity + "" + min_quantity + "" + supplier + ""
				+ name;
	}
}
