public class CargoAirliner extends AirTransporter{
	int maxCargoWeight;
	CargoAirliner(){}
	CargoAirliner(String manufacture,double maxAltitude,double maxSpeed, int maxCargoWeight){
		super(manufacture,maxAltitude,maxSpeed);
		this.maxCargoWeight=maxCargoWeight;
		}
		void setMaxCargoWeight(int maxCargoWeight){
			this.maxCargoWeight=maxCargoWeight;
	}
	int getMaxCargoWeight(){
		return maxCargoWeight;
	}
	void showDetails(){
		super.showDetails();
		System.out.println("Max Weight Capacity: "+maxCargoWeight+"KG");
	}
}