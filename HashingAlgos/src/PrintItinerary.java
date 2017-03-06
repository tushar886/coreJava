import java.util.HashMap;
import java.util.Map;

public class PrintItinerary {

	public static void main(String[] args) {

		final Map<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("Chennai", "Bangalore");
		dataSet.put("Bombay", "Delhi");
		dataSet.put("Goa", "Chennai");
		dataSet.put("Delhi", "Goa");
		
		printItinerary(dataSet);
	}

	private static void printItinerary(Map<String, String> dataSet) {
		
		String startPoint = null;
		
		final Map<String, String> reverseMap = new HashMap<String, String>();
		
		//put reverse values in reverse map on basis of values in dataSet
		for (Map.Entry<String, String> entry : dataSet.entrySet()) {
			reverseMap.put(entry.getValue(), entry.getKey());
		}
		/*
		 * The logic goes as follows: dataSet contains mapping from "from" to "to"
		 * now reverse map contains the mapping as "to" to "from".
		 * So the key of data set which is not present in reverseMap will be the starting point of itinerary
		 */
		
		for (String dataSetKey : dataSet.keySet()) {
			if (!reverseMap.containsKey(dataSetKey)) {
				startPoint = dataSetKey;
				break;
			}
		}
		
		System.out.println("---Starting point of itinerary is as: " + startPoint);
		
		if (startPoint != null) {
			//start printing the itinerary
			String itineraryData = startPoint;
			while (itineraryData != null) {
				System.out.print(itineraryData + " -> ");
				itineraryData = dataSet.get(itineraryData);
			}
		}
	}

}
