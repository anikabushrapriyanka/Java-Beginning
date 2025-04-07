public class PassengerAirliner extends AirTransporter{
	int passengerCapacity;
	PassengerAirliner(String manufacture,double maxAltitude,double maxSpeed, int passengerCapacity){
		super(manufacture,maxAltitude,maxSpeed);
		this.passengerCapacity=passengerCapacity;
		
	}
	 void setPassengerCapacity(int passengerCapacity){
			this.passengerCapacity=passengerCapacity; 
	}
	int getPassengerCapacity(){
		return passengerCapacity;
	}
	void showDetails(){
		super.showDetails();
		System.out.println("Passenger Capacity: "+passengerCapacity);
	}
}