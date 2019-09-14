package bakery;

public class BirthdayPastry extends Bakedgood {
	BakedgoodIngredientFactory ingredientFactory;
 
	public BirthdayPastry(BakedgoodIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		frosting = ingredientFactory.createFrosting();
		decorations = ingredientFactory.createDecorations();
	}
}
