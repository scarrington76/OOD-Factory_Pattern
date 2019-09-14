package bakery;

public class CakeIngredientFactory implements BakedgoodIngredientFactory {
 
	public Dough createDough() {
		return new CakeBatter();
	}
 
	public Frosting createFrosting() {
		return new FondantFrosting();
	}
 
	public Decorations[] createDecorations() {
		Decorations decorations[] = { new Fruit(), new Coconut()};
		return decorations;
	}
 
}
