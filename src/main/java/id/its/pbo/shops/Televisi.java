package id.its.pbo.shops;

public class Televisi extends Barang implements Electrifiable{
	
	public Televisi(String merk) {
		super(merk);
	}
	
	public String powerOn() {
		return "Televisi dinyalakan";
	}

	public String powerOff() {
		return "Televisi dimatikan";
	}
}
