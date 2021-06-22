package BuilderPattern;

public class BuilderPatternDemo {

	 public static void main(String[] args)   
	 {        
		 HouseBuilder IglooBuilder = new IglooHouseBuilder();  
		 Engineer engineer = new Engineer(IglooBuilder);    
		 engineer.constructHouse();      
		 
	 String s1 = engineer.getHouse().getInterior();   
	 System.out.println("Builder constructed House with "+s1+" Interior");
	 }
}
