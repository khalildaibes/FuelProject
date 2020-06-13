package logic;

import java.util.ArrayList;

public class Sale {
	private String s_date;
	private String e_date;
	private float discount;
	private ArrayList<Product> list_of_product = new ArrayList<Product>();
	
	
	
	public String getS_date() {
		return s_date;
	}
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	public String getE_date() {
		return e_date;
	}
	public void setE_date(String e_date) {
		this.e_date = e_date;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public ArrayList<Product> getList_of_product() {
		return list_of_product;
	}
	public void setList_of_product(ArrayList<Product> list_of_product) {
		this.list_of_product = list_of_product;
	}
	
	
	

}
