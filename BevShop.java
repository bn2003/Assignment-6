

import java.util.*;

public class BevShop extends Object implements BevShopInterface{
	private int numAlc;
	private ArrayList<Order> orderList = new ArrayList<>();
	
	public BevShop(){}
	
	public boolean isValidTime(int time) {
		if (time >= 8 && time <= 23) {
			return true;
		}
		else
			return false;
	}
	
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}
	
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits) {
		if(numOfFruits >= MAX_FRUIT) {
			return true;
		}
		else
			return false;
	}
	
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	public boolean isEligibleForMore() {
		if (numAlc >= 3)
			return false;
		else
			return true;
	}
	
	public int getNumOfAlcoholDrink() {
		return numAlc;
	}
	
	public boolean isValidAge(int age) {
		if(age >= MIN_AGE_FOR_ALCOHOL) {
			return true;
		}
		else
			return false;
	}
	
	public void startNewOrder(int time,
								Day day,
								String customerName,
								int customerAge) {
		orderList.add(new Order(time, day, new Customer(customerName, customerAge)));
		
		//set the number of alcohol to 0
		numAlc = 0;
	}
	
	public void processCoffeeOrder(String bevName,
									Size size,
									boolean extraShot,
									boolean extraSyrup) {
		orderList.get(orderList.size()-1).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	public void processAlcoholOrder(String bevName,
									Size size) {
		orderList.get(orderList.size()-1).addNewBeverage(bevName, size);;
		numAlc++;
	}
	
	public void processSmoothieOrder(String bevName,
									Size size,
									int numOfFruits,
									boolean addProtein) {
		orderList.get(orderList.size()-1).addNewBeverage(bevName, size, numOfFruits, addProtein);;
	}
	
	public int findOrder(int orderNo) {
		for(int i = 0; i < orderList.size(); i++) {
			if(orderList.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}
		return -1;
	}
	
	public double totalOrderPrice(int orderNo) {
		return orderList.get(findOrder(orderNo)).calcOrderTotal();
	}
	
	public double totalMonthlySale() {
		double sum = 0.0;
		
		for(Order ord: orderList) {
			sum+= ord.calcOrderTotal();
		}
		
		return sum;
	}
	
	public int totalNumOfMonthlyOrders() {
		return orderList.size();
	}
	
	public Order getCurrentOrder() {
		return orderList.get(orderList.size()-1);
	}
	
	public Order getOrderAtIndex(int index) {
		return orderList.get(index);
	}
	
	public void sortOrders() {
		Collections.sort(orderList);
	}
	
	@Override
	public String toString() {
		String strg= "";
		
		for (Order ord: orderList) {
			strg += ord.toString() + "\n";
		}
		
		strg += totalMonthlySale();
		
		return strg;
	}
	
	
}
