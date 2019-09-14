package bakery;

public class WeddingPastry extends Bakedgood {
	BakedgoodIngredientFactory ingredientFactory;
 
	public WeddingPastry(BakedgoodIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		frosting = ingredientFactory.createFrosting();
		decorations = ingredientFactory.createDecorations();
	}
}
