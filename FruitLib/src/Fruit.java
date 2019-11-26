



class Fruit {
	String name;
	
	static Fruit fruit(String fruitName) {
		Fruit f = new Fruit();
		f.name =fruitName;
		return f;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
}