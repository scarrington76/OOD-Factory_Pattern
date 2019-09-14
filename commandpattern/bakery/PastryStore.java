package bakery;

public abstract class PastryStore {
 
	protected abstract Bakedgood createBakedgood(String item);
 
	public Bakedgood orderBakedgood(String type) {
		Bakedgood bakedgood = createBakedgood(type);
		System.out.println("*********A " + bakedgood.getName() + " HAS BEEN ORDERED********");
		bakedgood.prepare();
		return bakedgood;
	}
}
