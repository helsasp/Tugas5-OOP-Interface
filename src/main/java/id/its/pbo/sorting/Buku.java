package id.its.pbo.sorting;

public class Buku extends Item implements Sortable {
    private int jumlahHalaman;

    public Buku(String nama, int jumlahHalaman) {
        this.nama = nama;
        this.jumlahHalaman = jumlahHalaman;
    }

   
    public int compare(Sortable item) {
        if (item instanceof Buku) {
            Buku buku = (Buku) item;
            if (this.jumlahHalaman < buku.jumlahHalaman) {
                return -1;
            } else if (this.jumlahHalaman == buku.jumlahHalaman) {
                return 0;
            } else {
                return 1;
            }
        }
        return 0; // Jika objek yang dibandingkan bukan Buku, maka return 0.
    }
}
