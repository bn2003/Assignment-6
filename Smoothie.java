

public class Smoothie extends Beverage{

	private int numOfFruits;
	private boolean addProtein;
	
	
	public Smoothie(String bevName, 
				Size size, 
				int numOfFruits, 
				boolean addProtein){
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
	public boolean getAddProtein() {
		return addProtein;
	}
	
	@Override
	public double calcPrice() {
		return addSizePrice() + (addProtein ? 1.5 : 0.0) + 
				0.5 * (double)numOfFruits;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				(addProtein ? "add protein" : "no protein") + "\n" +
				"number of fruits: " + numOfFruits + "\n" +
				calcPrice();
	}
	
	@Override
	public boolean equals(Object anotherBev) {  
	      if (anotherBev == this) {  
	         return true;  
	      }  
	      if (!(anotherBev instanceof Smoothie)) {  
	         return false;  
	      }  
	      Smoothie a = (Smoothie) anotherBev;  
	      return (super.equals(anotherBev) &&
					numOfFruits == a.numOfFruits &&
					addProtein == a.addProtein);  
	      }  
}
