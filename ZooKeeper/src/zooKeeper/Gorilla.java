package zooKeeper;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("I throw Barrels");
		this.setEnergyLevel(getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("I was hungry");
		this.setEnergyLevel(getEnergyLevel() + 10);
		
	}
	
	public void climb() {
		System.out.println("I climb fast");
		this.setEnergyLevel(getEnergyLevel() - 10);
	}

}
