import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		DataManager.importData("ProjStage3BasicFile.txt");
		ImportData imp = DataManager.importData("ProjStage3BasicFile.txt");
		System.out.println(imp.passengers.size());
		DataManager.exportData("out.txt", imp.passengers, imp.flights);
		ArrayList<Passenger> list = imp.passengers;
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getFirstName() + " " + list.get(i).getLastName());
			System.out.println(list.get(i).getAlerts().size());
			for(int j=0; j<list.get(i).getAlerts().size(); j++){
				System.out.println(list.get(i).getAlerts().get(j));
			}
			System.out.println(list.get(i).getBookedFlights().size());
			System.out.println(list.get(i).getStandbyFlights().size());
		}
		
		
		
	}
		

}
