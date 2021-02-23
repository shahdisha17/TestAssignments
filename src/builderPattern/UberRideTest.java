package builderPattern;

public class UberRideTest {

	public static void main(String[] args) {
		UberApp ua=new UberApp();
		ua.openApp()
			.doLogin("Disha", "Pass123")
				.destination("Chicago", "Schaumburg")
					.chooseRide("AudiX")
						.doPayment("5642 5452 6456 4554", "6753")
							.getInRide("Schaumburg")
								.logOut();
		
		System.out.println("----------------");

		UberApp ubap=new UberApp();
		ubap.openApp()
			.destination("Chicago", "Airport")
				.cancelRide("NissanEx")
					.logOut();
	}

}
