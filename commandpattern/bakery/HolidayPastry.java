package bakery;

public class HolidayPastry extends Bakedgood {
	BakedgoodIngredientFactory ingredientFactory;
 
	public HolidayPastry(BakedgoodIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		frosting = ingredientFactory.createFrosting();
		decorations = ingredientFactory.createDecorations();
		//holiday = ingredientFactory.createHoliday();
	}
}
