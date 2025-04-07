public class Main{
	public static void main(String[]args){
		PassengerAirliner boeing747=new PassengerAirliner("Boeing",44947,988,524);
		
		boeing747.showDetails();
		
		CargoAirliner airBus22= new CargoAirliner();
		
		airBus22.setManufacture("AirBus");
		airBus22.setMaxAltitude(30000);
		airBus22.setMaxSpeed(650);
		airBus22.setMaxCargoWeight(10000);
		airBus22.showDetails();
		
	}
}