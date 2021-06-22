package BuilderPattern;

public class IglooHouseBuilder implements HouseBuilder{

	 private House house;    
	 public IglooHouseBuilder()   
	 {      
		 this.house = new House();    
		 }
	 public void buildInterior()   
	 {      
		 house.setInterior("Ice Carvings");  
		 }
	 public House getHouse()   
	 {       
		 return this.house;   
		 } 
}
