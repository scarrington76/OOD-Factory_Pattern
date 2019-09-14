package bakery;

public class CookieStore extends PastryStore {

	protected Bakedgood createBakedgood(String item) {
		Bakedgood bakedgood = null;
		BakedgoodIngredientFactory ingredientFactory =
		new CookieIngredientFactory();

		if (item.equals("birthday")) {

			bakedgood = new BirthdayPastry(ingredientFactory);
			bakedgood.setName("Birthday Cookie");

		} else if (item.equals("wedding")) {

			bakedgood = new WeddingPastry(ingredientFactory);
			bakedgood.setName("Wedding Cookie");

		} else if (item.equals("holiday")) {

			bakedgood = new HolidayPastry(ingredientFactory);
			bakedgood.setName("Holiday Cookie");

		}
		return bakedgood;
	}
}
