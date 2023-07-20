package com.fdmgroup.dependenciesExercises;

public class Runner {
	public static void main(String[] args) 
	   { 
	      HardDrive drive1 = new HardDrive ("Seagate", 2048);
	      HardDrive drive2 = new HardDrive ("Dell", 3072);
	      
	      Processor processor1 = new Processor ("Intel Xeon", 2.93, 6);
	      Processor processor2 = new Processor ("Intel Celeron", 2.9, 2);
	      
	      Memory memory1 = new Memory ("Kingston", 4, 1600);
	      Memory memory2 = new Memory ("Corsair", 8, 1333);
	      
	      System.out.println(drive1.getCAPACITY());
	      System.out.println(processor1.getMODEL());
	      System.out.println(memory1.getSPEED());
	      
	      drive1.setUsedSpace(50);
	      System.out.println(drive1.getUsedSpace());
	      
	      Computer computer1 = new Computer("Dell",	drive1, memory1, processor1);
	      Computer computer2 = new Computer("Lenovo", drive2, memory2, processor2);
	      
	      PowerSource powerSource1 = new PowerSource (220);
	      
	      computer1.getPower(powerSource1);
	   } 

}
