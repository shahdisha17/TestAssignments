package constructorAssignments;

import java.util.ArrayList;

public class Browser {
	
	String browserName;
	String vendorName;
	int currentVerion;
	ArrayList<String> plugIns;
	
	public Browser(String bN, String vN) {
		this.browserName = bN;
		this.vendorName = vN;
	}

	public Browser(String bName, String vName, int cVerion) {
		this.browserName = bName;
		this.vendorName = vName;
		this.currentVerion = cVerion;
	}

	public Browser(String browserN, String vendorN, int currentV, ArrayList<String> plugI) {
		super();
		this.browserName = browserN;
		this.vendorName = vendorN;
		this.currentVerion = currentV;
		this.plugIns = plugI;
	}

	public String getBrowserName() {
		return browserName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public int getCurrentVerion() {
		return currentVerion;
	}

	public ArrayList<String> getPlugIns() {
		return plugIns;
	}
	
	
	
	

}
