/** Version 2.0*/
class Fruit {
	/** @since Version 2.0 */
	String key;
	/** @since Version 1.0 */
	String name;
	/** @since Version 2.0 */
	@Override
	public boolean equals(Object that) {
		if(that instanceof Fruit) {
			Fruit thatFruit = (Fruit) that;
			return this.key.equals ( thatFruit.key);
		}
		return false;
	}

	/** @since Version 1.0 
	 *  modified in version 2.0 */
	@Override
	public String toString() {
		return "Fruit [key=" + key + ", fruitName=" + name + "]";
	}
	/** @since Version 1.0 */
	@Deprecated
	static public Fruit build(String fruitName) {
		Fruit f = new Fruit();
		f.name =fruitName;
		return f;
	}
	/** @since Version 2.0 */
	static public Fruit build(String key, String fruitName) {
		Fruit f = new Fruit();
		f.key = key;
		f.name =fruitName;
		return f;
	}
}