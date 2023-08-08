

public abstract class Beverage extends Object{
	private String bevName;
	private Type type;
	private Size size;
	final double BASE_PRICE = 2.0;
	final double SIZE_PRICE = 1.0;
	
	public Beverage(String bevName, Type type, Size size) {
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	public double getBasePrice() {
		return BASE_PRICE;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getBevName() {
		return bevName;
	}
	
	public Size getSize() {
		return size;
	}
	
	public double addSizePrice() {
		//find the price of the beverage based on the size
		if (size.equals(Size.SMALL)) {
			return BASE_PRICE;
		}
		else if (size.equals(Size.MEDIUM)) {
			return BASE_PRICE + SIZE_PRICE;
		}
		else if (size.equals(Size.LARGE)) {
			return BASE_PRICE + SIZE_PRICE + SIZE_PRICE;
		}
		else {
			return 0.0;
		}
	}
	
	@Override
	public String toString() {
		return bevName + " " + size + "\n";
	}
	
	
	public boolean equals(Beverage anotherBev) {
		if (bevName.equals(anotherBev.bevName) && 
				type.equals(anotherBev.type) &&
				size.equals(anotherBev.size))
			return true;
		else
			return false;
	}
	
	@Override
	public boolean equals(Object anotherBev) {  
	      if (anotherBev == this) {  
	         return true;  
	      }  
	      if (!(anotherBev instanceof Beverage)) {  
	         return false;  
	      }  
	      Beverage a = (Beverage) anotherBev;  
	      return (bevName.equals(a.bevName) && 
					type.equals(a.type) &&
					size.equals(a.size));  
	      }  
	
	
	public abstract double calcPrice();
}
