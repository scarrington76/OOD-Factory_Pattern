package bakery;

public class PastryTestDrive {
 
	public static void main(String[] args) {
		PastryStore cakeStore = new CakeStore();
		PastryStore cookieStore = new CookieStore();
 
		Bakedgood bakedgood = cakeStore.orderBakedgood("birthday");
		System.out.println("Susan ordered a " + bakedgood + "\n");
 
		bakedgood = cookieStore.orderBakedgood("birthday");
		System.out.println("Scott ordered a " + bakedgood + "\n");

		bakedgood = cakeStore.orderBakedgood("wedding");
		System.out.println("Susan ordered a " + bakedgood + "\n");
 
		bakedgood = cookieStore.orderBakedgood("wedding");
		System.out.println("Thomas ordered a " + bakedgood + "\n");

	}
}
