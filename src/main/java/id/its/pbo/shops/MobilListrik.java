package id.its.pbo.shops;

public class MobilListrik extends Barang implements Electrifiable{
	
	
	public MobilListrik (String merk) {
		super(merk);
	}
	public String powerOn () {
		return "Mobil Listrik siap berjalan";
	}

	public String powerOff() {
		return "Mobil Listrik berhenti";
	}
}
