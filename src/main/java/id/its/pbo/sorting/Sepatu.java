package id.its.pbo.sorting;

public class Sepatu extends Item implements Sortable {
    private int ukuran;

    public Sepatu(String nama, int ukuran) {
    	
    
        this.nama = nama;
        this.ukuran = ukuran;
        
    }

   
    public int compare(Sortable item) {
        if (item instanceof Sepatu) {
            Sepatu sepatu = (Sepatu) item;
            
            if (this.ukuran < sepatu.ukuran) {
                return -1;
            } else if (this.ukuran == sepatu.ukuran) {
                return 0;
            } else {
                return 1;
            }
        }
        return 0;
        
    }
}
