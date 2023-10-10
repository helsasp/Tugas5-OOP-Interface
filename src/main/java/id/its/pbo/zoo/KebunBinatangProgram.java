package id.its.pbo.zoo;

public class KebunBinatangProgram {
	
	public static void main (String [] args) {
		
		KebunBinatang kb1 = new KebunBinatang ();
		
		Singa singa1 = new Singa ("Mufasa");
		Kuda kuda1 = new Kuda ("Pony");
		Ular ular1 = new Ular ("Python");
		
		kb1.tambahHewan(singa1);
		kb1.tambahHewan(kuda1);
		kb1.tambahHewan(ular1);
		
		kb1.tampilkanHewanBersuara();
		
		
	}

}
