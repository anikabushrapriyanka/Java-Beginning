public class AirTransporter{
	String manufacture;
	double maxAltitude;
	double maxSpeed;
	AirTransporter(){}
	AirTransporter(String manufacture,double maxAltitude,double maxSpeed){
		setManufacture(manufacture);
		setMaxAltitude(maxAltitude);
		setMaxSpeed(maxSpeed);
	}
	 void setManufacture(String manufacture){
		this.manufacture=manufacture;
	}
	 String getManufacture(){
		return manufacture;
	}
	 void setMaxAltitude(double maxAltitude){
		this.maxAltitude=maxAltitude;
	}
	 double getMaxAltitude(){
		return maxAltitude;
	}
	 void setMaxSpeed(double maxSpeed){
		this.maxSpeed=maxSpeed;
	}
	 double getMaxSpeed(){
		return maxSpeed;
	}
	 void showDetails(){
		System.out.println("Air Transporter Details");
		System.out.println("Manufacture: "+manufacture);
		System.out.println("Maximum Altitude: "+maxAltitude+"ft");
		System.out.println("Maximum Speed: "+maxSpeed+"KM/Hr");

		
	}
}