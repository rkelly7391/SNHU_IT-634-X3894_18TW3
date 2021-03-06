public class RyanFlightSearch {

	
	//Create global variables that will be used within the class
	private String flightNumber = null;
	private String flightSource = null;
	private String flightDest = null;
	private String FlightTime = null;
	private String numberOfSeatsAviable = null;
	private String passengerFirstName = null;
	private String passengerLastName = null;
	
	//Create the getters and setters
	public String getPassangerFirstName() {
		return passengerFirstName;
	}
	public void setPassangerFirstName(String passangerFirstName) {
		this.passengerFirstName = passangerFirstName;
	}
	public String getPassagnerLastName() {
		return passengerLastName;
	}
	public void setPassagnerLastName(String passagnerLastName) {
		this.passengerLastName = passagnerLastName;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDest() {
		return flightDest;
	}
	public void setFlightDest(String flightDest) {
		this.flightDest = flightDest;
	}
	public String getFlightTime() {
		return FlightTime;
	}
	public void setFlightTime(String flightTime) {
		FlightTime = flightTime;
	}
	public String getNumberOfSeatsAviable() {
		return numberOfSeatsAviable;
	}
	public void setNumberOfSeatsAviable(String numberOfSeatsAviable) {
		this.numberOfSeatsAviable = numberOfSeatsAviable;
	}
	public String getNumberofSeatsRequested() {
		return numberofSeatsRequested;
	}
	public void setNumberofSeatsRequested(String numberofSeatsRequested) {
		this.numberofSeatsRequested = numberofSeatsRequested;
	}
	private String numberofSeatsRequested = null;
	public String getPassagnerName() {
		return passengerFirstName + passengerLastName;
	}
	
}
