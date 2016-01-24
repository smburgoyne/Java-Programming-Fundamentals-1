public class VehicleObjectLearning {
	public static void main(String[] args) {
		System.out.println(Vehicle.getVehicleCount());
		Vehicle car = new Vehicle(4, 2, 2, "red pinstripe", true);
		car.printInfo(); 	//Print info on car variable.
		
		System.out.println(Vehicle.getVehicleCount());
		
		Vehicle trike = new Vehicle(3, 0, 1, "purple", false);
		trike.printInfo();
		
		System.out.println(Vehicle.getVehicleCount());
	}
}

class Vehicle {
	private int wheels; 		//private makes so variables only exist in this class.
	private int doors;
	private int seats;
	private String color;
	private boolean fuzzyDice;
	private static int vehicleCount = 0;
	
	public Vehicle(int w, int d, int s, String clr, boolean fd) {
		wheels = w;
		doors = d;
		seats = s;
		color = clr;
		fuzzyDice = fd;
		vehicleCount++;
	}
	public void printInfo() {		//No static makes sure runs on specific instance, not universal.
		System.out.println("Wheels " + wheels + " Doors " + doors + " Seats " +seats + " Color " + color);
		System.out.println("Your fuzzy dice status is: " + fuzzyDice);
	}
	public void changeDoors (int newDoors) {
		doors = newDoors;
	}
	public static int getVehicleCount() {
		return vehicleCount;
	}
}