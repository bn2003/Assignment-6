

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order>{
	private int orderNum;
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> bevList = new ArrayList<>();
	
	public Order(int orderTime,
			 Day orderDay,
			 Customer cust) {
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		orderNum = generateOrder();
	}
	
	public int generateOrder() {
		int min = 10000,
			max = 90000;
		
		Random rand= new Random();
		
		return rand.nextInt(max - min + 1) + min;
	}
	
	public int getOrderNo() {
		return orderNum;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public Day getOrderDay() {
		return orderDay;
	}
	
	public Day getDay() {
		return orderDay;
	}
	
	public Customer getCustomer(){
		return new Customer(cust);
	}
	
	public boolean isWeekend() {
		if (orderDay.equals(Day.SATURDAY) || orderDay.equals(Day.SUNDAY)) {
			return true;
		}
		else
			return false;
	}
	
	public Beverage getBeverage(int itemNo) {
		return bevList.get(itemNo);
	}
	
	public int getTotalItems() {
		return bevList.size();
	}
	
	public void addNewBeverage(String bevName,
			 				Size size,
			 				boolean extraShot,
			 				boolean extraSyrup) {
		bevList.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	
	public void addNewBeverage(String bevName,
			 					Size size) {
		bevList.add(new Alcohol(bevName, size, isWeekend()));
	}
	
	public void addNewBeverage(String bevName,
								Size size,
								int numOfFruits,
								boolean addProtein) {
		bevList.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	
	public double calcOrderTotal() {
		double sum = 0.0;
		
		for(Beverage bev: bevList) {
			sum += bev.calcPrice();
		}
		
		return sum;
	}
	
	public int findNumOfBeveType(Type type) {
		int total = 0;
		
		for(Beverage bev: bevList) {
			if(bev.getType().equals(type)) {
				total++;
			}
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		String strg = orderNum + "\n"
					+ orderTime + "\n"
					+ orderDay + "\n"
					+ cust.toString() + "\n";
		
		for(Beverage bev: bevList) {
			strg += bev.getBevName() + " - " + bev.getType() + " - " + bev.getSize() + "\n";
		}
		
		return strg;
	}
	
	public int compareTo(Order anotherOrder) {
		if (orderNum == anotherOrder.getOrderNo()) {
			return 0;
		}
		else if(orderNum > anotherOrder.getOrderNo()) {
			return 1;
		}
		else
			return -1;
	}
	
	
}
