package bakery;

public interface BakedgoodIngredientFactory {
 
	public Dough createDough();
	public Frosting createFrosting();
	public Decorations[] createDecorations();
 
}
