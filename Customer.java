package application;

import java.util.ArrayList;

public class Customer extends MediaRental implements Comparable<Customer> {
	public Customer() {
	}

	private String name;
	private String address;
	private String id;
	private String mobile;
	private String plan;
	protected ArrayList<String> interestedcart;
	protected ArrayList<String> interestedcart2;

	protected ArrayList<String> rented;
	private int mediaLimit;

	public Customer(String id, String name, String mobile, String address, String plan) {
		this.name = name;
		this.address = address;
		this.plan = plan;
		this.id = id;
		this.mobile = mobile;
		this.interestedcart = new ArrayList<String>();
		this.interestedcart2 = new ArrayList<String>();
		this.rented = new ArrayList<String>();
		this.mediaLimit = 2;
	}

	public ArrayList<String> getinterestedcart() {
		return interestedcart;
	}
	public ArrayList<String> getinterestedcart2() {
		return interestedcart2;
	}
	public ArrayList<String> getRented() {
		return rented;
	}

	public String getName() {
		return name;
	}

	public String getPlan() {
		return plan;
	}

	public int getMediaLimit() {
		return mediaLimit;
	}

	public void setMediaLimit(int limitAmount) {
		this.mediaLimit = limitAmount;
	}

	/**
	 * compares the customers by their id
	 */
	public int compareTo(Customer c) {
		if (this.id.compareTo(c.id) > 0)

			return 1;

		else if (this.id.compareTo(c.id) < 0)

			return -1;

		return 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getAddress() {
		return address;
	}

	public String getId() {
		return id;
	}

	public String getMobile() {
		return mobile;
	}

	@Override
	public String toString() {
		return " name=" + name + "\n" + " address=" + address + "\n" + " mobile=" + mobile + " \n" + " plan=" + plan;
	}

}
