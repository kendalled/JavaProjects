import java.util.Scanner;

public class ProjectFour {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the first city: ");
		String city1 = input.nextLine();
		
		System.out.print("Enter the name of the second city: ");
		String city2 = input.nextLine();
		
		System.out.print("Enter the latitude and longitude of " + city1 + ", separated by a space - (example 28.8 81.2): ");
		double city1Lat = input.nextDouble();
		double city1Long = input.nextDouble();
		
		System.out.print("Enter the latitude and longitude of " + city2 + ", separated by a space - (example 28.8 81.2): ");
		double city2Lat = input.nextDouble();
		double city2Long = input.nextDouble();
		
		double result = cityDistance(city1Lat, city2Lat, city1Long, city2Long);
		System.out.println("The distance between the two cities in miles: ");
		System.out.printf ("%.2f", result);

		input.close();

	}
	
	public static double cityDistance(double lat1, double lat2, double long1, double long2) {
		double latDist = (lat1 - lat2) * 69;
		double longDist = (long1 - long2) * 55;
		
		double distance = Math.sqrt(latDist*latDist + longDist * longDist);
		
		return distance;
		
	}

}
