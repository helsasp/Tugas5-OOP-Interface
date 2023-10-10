package id.its.pbo.shops;

public class TokoBarangProgram {
    public static void main(String[] args) {
        Televisi televisi = new Televisi("Sony");
        KipasAngin kipas = new KipasAngin("Panasonic");
        MobilListrik mobil = new MobilListrik("Tesla");

        ElectricityProvider.supplyPower(televisi);
        ElectricityProvider.supplyPower(kipas);
        ElectricityProvider.supplyPower(mobil);
    }
}
