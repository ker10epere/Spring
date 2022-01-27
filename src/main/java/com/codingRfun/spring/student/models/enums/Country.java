package com.codingRfun.spring.student.models.enums;

@SuppressWarnings("unused")
public enum Country {
	Philippines("small islands", 100), Japan("awesome island", 200), Korea("beautiful island", 300),
	UnitedStatesOfAmerica("continent", 400);

	private final String description;
	private final Integer code;

	private final static String philippines = "philippines";
	private final static String japan = "japan";
	private final static String korea = "korea";
	private final static String unitedstatesofamerica = "unitedstatesofamerica";

	Country(String description, Integer code) {
		this.description = description;
		this.code = code;
	}


	public static Country findCountry(String country) {
		switch (country.toLowerCase()) {
		case philippines:
			return Philippines;
		case japan:
			return Japan;
		case korea:
			return Korea;
		case unitedstatesofamerica:
			return UnitedStatesOfAmerica;
		default:
			return null;
		}
	}

	public static void main(String[] args) {

		System.out.println(Country.Philippines.description);
	}
}
