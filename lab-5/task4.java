


 class Airplane {
	 String flightNumber;
	 String destination;
	 String departureTime;
	 boolean isDelayed;

	public Airplane(String flightNumber, String destination, String departureTime) {
			this.flightNumber = flightNumber;
			this.destination = destination;
			this.departureTime = departureTime;
			this.isDelayed = false; 
	}

	public void checkFlightStatus() {
			if (isDelayed) {
					System.out.println("Flight " + flightNumber + " to " + destination + " is delayed.");
			} else {
					System.out.println("Flight " + flightNumber + " to " + destination + " is on time.");
			}
	}

	public void setDelay(boolean isDelayed) {
			this.isDelayed = isDelayed;
	}}
	class task4 {
	public static void main(String[] args) {
			Airplane airplane = new Airplane("AA123", "New York", "10:00 AM");
			airplane.checkFlightStatus();
			airplane.setDelay(true);
			airplane.checkFlightStatus();
	}
}
