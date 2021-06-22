package BuilderPattern;

public class Engineer {

	 private HouseBuilder houseBuilder;  
	 public Engineer(HouseBuilder houseBuilder)    
	 {       
		 this.houseBuilder = houseBuilder;  
		 }  
	 public House getHouse() 
	 {
		 return this.houseBuilder.getHouse();
	 }
	 public void constructHouse()   
	 {        
		  
	 this.houseBuilder.buildInterior();   
	 }
}
