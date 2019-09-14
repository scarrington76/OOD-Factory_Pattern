package bakery;

public abstract class Bakedgood {
	String name;

	Dough dough;
	Decorations decorations[];
	Frosting frosting;
	HolidayPastry holiday;
	WeddingPastry wedding;
	BirthdayPastry birthday;

	abstract void prepare();

	void bake() {
		System.out.println("...Let's get to baking!!!!!");
	}

	void cut() {
		System.out.println("..........It's in the oven..........");
	}

	void box() {
		System.out.println("......................It's now boxed and ready to go!!");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append("Made with a " + dough);
			result.append("\n");
		}
		if (frosting != null) {
			result.append("Topped with a " + frosting);
			result.append("\n");
		}
		if (decorations != null) {
			result.append("And decorated with: ");
			result.append("\n");
			for (int i = 0; i < decorations.length; i++) {
				result.append(decorations[i]);
				if (i < decorations.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (holiday != null) {
			result.append(holiday);
			result.append("\n");
		}
		if (wedding != null) {
			result.append(wedding);
			result.append("\n");
		}
		if (birthday != null) {
			result.append(birthday);
			result.append("\n");
		}
		
		return result.toString();
	}
}
