package bakery;

public class PlainGood extends Bakedgood {
	BakedgoodIngredientFactory ingredientFactory;
 
	public PlainGood(BakedgoodIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		frosting = ingredientFactory.createFrosting();
	}
}
