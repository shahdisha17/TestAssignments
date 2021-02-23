package builderPattern;

public class UberApp {
	
	public UberApp openApp() {
		System.out.println("App is opened");
		return this;
	}
	
	public UberApp doLogin(String un, String pw) {
		System.out.println("Login with " +un+ " "+pw);
		return this;
	}
	
	public UberApp destination(String tolocation,String fromlocation) {
		System.out.println("Destination is " +tolocation+ " to " +fromlocation);
		return this;
	}
	
	public UberApp chooseRide(String car) {
		System.out.println("Choose a ride :" +car);
		return this;
	}
	
	public UberApp cancelRide(String car) {
		System.out.println("Ride " +car+ " got cancelled");
		return this;
	}
	
	public UberApp doPayment(String CC, String pwd) {
		System.out.println("Payment done with: " +CC+ " " +pwd);
		return this;
	}
	
	public UberApp getInRide(String fromlocation) {
		System.out.println("Reach to: " +fromlocation);
		return this;
	}
	
	public UberApp logOut() {
		System.out.println("Logout from app");
		return this;
	}
}
