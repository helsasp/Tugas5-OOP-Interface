package id.its.pbo.zoo;

public class Singa extends Hewan implements BisaBersuara {
	
	public Singa (String nama) {
		super(nama);
	}
	
	public String suara () {
		return "Roar";
	}

}
