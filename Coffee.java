
public class Coffee extends Beverage{
	
	private boolean extraShot;
	private boolean extraSyrup;
	
	
	public Coffee(String bevName, 
				Size size, 
				boolean extraShot, 
				boolean extraSyrup){
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	public boolean getExtraSyrup(){
		return extraSyrup;
	}
	
	@Override
	public double calcPrice() {
		return addSizePrice() + (extraShot ? 0.5 : 0.0) + 
				(extraSyrup ? 0.5 : 0.0);
	}
	
	@Override
	public String toString() {
		return super.toString() +
				(extraShot ? "contains extra shot" : "no extra shot") + "\n" +
				(extraSyrup ? "contains extra syrup" : "no extra syrup") + "\n" +
				calcPrice();
	}
	
	@Override
	public boolean equals(Object anotherBev) {  
	      if (anotherBev == this) {  
	         return true;  
	      }  
	      if (!(anotherBev instanceof Coffee)) {  
	         return false;  
	      }  
	      Coffee a = (Coffee) anotherBev;  
	      return (super.equals(anotherBev) &&
					extraShot == a.extraShot &&
					extraSyrup == a.extraSyrup);  
	      }  
}
