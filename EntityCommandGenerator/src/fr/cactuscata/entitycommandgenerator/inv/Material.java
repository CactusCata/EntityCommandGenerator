package fr.cactuscata.entitycommandgenerator.inv;

public enum Material {

	AIR(1, 64),
	STONE(2, 64);
	
	private final int id, maxSize;
	
	private final String name;
	
	private Material(int id, int maxSize) {
		this.id = id;
		this.maxSize = maxSize;
		this.name = String.format("%c%s", super.name().charAt(0), super.name().substring(1, super.name().length()).toLowerCase());
	}

	public int getId() {
		return id;
	}

	public int getMaxSize() {
		return maxSize;
	}
	
	public String getName() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
