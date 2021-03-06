package day41_classes02_encapsulation;

public class HouseTester {
	
	public static void main(String[] args) {
		//Step 1. Create House object and assign data to fields/ins variables
		House yourHouse = new House();
		yourHouse.type = "Castle";
		yourHouse.address = "100 Massachusets ave , Washington Dc 22001";
		yourHouse.bedrooms = 250;
		yourHouse.year = 2018;
		
		//Step 2. Pass your house object to printHouseInfo method
		printHouseInfo(yourHouse);
		
		//Create one more object of House and pass it to method
		House myHouse = new House();
		myHouse.type = "PentHouse";
		myHouse.address = "10045 C st , Washington Dc 22001";
		myHouse.bedrooms = 5;
		myHouse.year = 2015;
		
		printHouseInfo(myHouse);
		
		
		House returnHouse=buildAHouse("Loft", "777 Wooden Spoon lane, New York 11230", 2, 1999);
		System.out.println(returnHouse.address);
		printHouseInfo(returnHouse);
	}
	

	public static void printHouseInfo(House houseObj) {

		System.out.println("============");
		System.out.println("Type: " + houseObj.type);
		System.out.println("Address: " + houseObj.address);
		System.out.println("Bedrooms #: " + houseObj.bedrooms);
		System.out.println("Year: " + houseObj.year);
		System.out.println("============");
	}
	
	/* Method buildAHouse:
	 * Params: 4 -> 2 Strings/2 ints
	 * Return type: House
	 * 
	 * In the method, using the values of the parameters build a new House object
	 * then return that
	 * 
	 */
	
	public static House buildAHouse(String type, String address, int rooms, int year) {
		House newHouse = new House();
		newHouse.type = type;
		newHouse.address = address;
		newHouse.bedrooms = rooms;
		newHouse.year = year;
		
		return newHouse;
	}
	
	
	
	
	
	
	
	
	
	
	
}
