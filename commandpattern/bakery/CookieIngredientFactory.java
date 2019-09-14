package bakery;

public class CookieIngredientFactory 
	implements BakedgoodIngredientFactory 
{

	public Dough createDough() {
		return new CookieBatter();
	}

	public Frosting createFrosting() {
		return new RainbowFrosting();
	}

	public Decorations[] createDecorations() {
		Decorations decorations[] = { new M_and_ms(), new Sprinkles(), new Coconut() };
		return decorations;
	}

}
