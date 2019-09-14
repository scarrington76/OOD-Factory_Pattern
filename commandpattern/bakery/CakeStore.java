package bakery;

public class CakeStore extends PastryStore {
 
	protected Bakedgood createBakedgood(String item) {
		Bakedgood bakedgood = null;
		BakedgoodIngredientFactory ingredientFactory = 
			new CakeIngredientFactory();
 
		if (item.equals("birthday")) {
  
			bakedgood = new BirthdayPastry(ingredientFactory);
			bakedgood.setName("Birthday Cake");
  
		} else if (item.equals("wedding")) {
 
			bakedgood = new WeddingPastry(ingredientFactory);
			bakedgood.setName("Wedding Cake");
 
		} else if (item.equals("holiday")) {

			bakedgood = new HolidayPastry(ingredientFactory);
			bakedgood.setName("Holiday Cake");
 
		} 
		return bakedgood;
	}
}
