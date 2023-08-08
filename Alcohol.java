

public class Alcohol extends Beverage{
	
	private boolean isWeekend;
	
	public Alcohol(String bevName, 
				Size size,  
				boolean isWeekend){
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	
	public boolean isWeekend() {
		return isWeekend;
	}
	
	@Override
	public double calcPrice() {
		return addSizePrice() + (isWeekend ? 0.6 : 0.0);
	}
	
	@Override
	public String toString() {
		return super.toString() +
				(isWeekend ? "offered in the weekend" : "not offered in the weekend");
	}
	
	@Override
	public boolean equals(Object anotherBev) {  
	      if (anotherBev == this) {  
	         return true;  
	      }  
	      if (!(anotherBev instanceof Alcohol)) {  
	         return false;  
	      }  
	      Alcohol a = (Alcohol) anotherBev;  
	      return (super.equals(anotherBev) &&
					isWeekend == a.isWeekend);  
	      }  
}
