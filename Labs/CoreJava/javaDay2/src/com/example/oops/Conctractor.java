package com.example.oops;

public class Conctractor extends Person {
	private int contractorID;
	private int duration;
    private	double cost;

    public  void Conctractor(int contractorID,int duration,double cost) {
    	//super(name, age, gender);
		this.contractorID = contractorID;
		this.duration = duration;
		this.cost= cost;
    	
    	
    }
    
	public static void main(String[] args) {
		

	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}

}
