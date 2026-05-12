package com.vehicleOwnership;

public  abstract class Vehicle {
	private String ownerName;
	private String VehicleNumber;
	private String Type;
	
	public String getownerName() {
		return  ownerName;
	}
	public String getVehicleNumber() {
		return VehicleNumber;
	}
	public String getType() {
		return Type;
	}
	
	public void setownerName(String name) {
		ownerName = name;
	}
	public void setVehicleNumber(String number) {
		VehicleNumber = number;
		
	}
	public void setType(String type) {
		Type = type;
	}
	
	public Vehicle(String ownerName,String VehicleNumber,String Type) {
		this.ownerName= ownerName;
		this.VehicleNumber=VehicleNumber;
		this.Type=Type;
	}
	public void displayProfile() {
		System.out.println("owner Name"+ownerName);
		System.out.println("Vehicle number"+VehicleNumber);
		System.out.println("type"+Type);
		
	}
	public interface ServiceOperations{
		public String serviceCategory();
		public String serviceCenter();
		
		
		
			
			
			
		}
		
	
			
	
	
	
	
	
		
	
	
		
	
		
	


	public static void main(String[] args) {
	

	}

}
