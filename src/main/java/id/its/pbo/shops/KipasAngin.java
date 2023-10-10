package id.its.pbo.shops;

public class KipasAngin extends Barang implements Electrifiable  {
	
	
	public KipasAngin (String merk) {
		super(merk);
		
	}
	
	public String powerOn () {
		return "Kipas Angin dinyalakan";
	}
	
	public String powerOff() {
		return "Kipas Angin dimatikan"; 
	}

}
