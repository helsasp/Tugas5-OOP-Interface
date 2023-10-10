package id.its.pbo.zoo;

import java.util.List;
import java.util.ArrayList;

public class KebunBinatang {
	
	List <Hewan> daftarHewan;
	
	public KebunBinatang() {
		daftarHewan = new ArrayList <>();
	}
	
	public void tambahHewan(Hewan hewan) {
		daftarHewan.add(hewan);
		
	}
	
	public void tampilkanHewanBersuara() {
		for(Hewan hewan : daftarHewan) {
			if(hewan instanceof BisaBersuara) {
				System.out.println("Suara " + hewan.getNama() + " yaitu : " + ((BisaBersuara) hewan).suara());
			}
		}
	}
	

}
