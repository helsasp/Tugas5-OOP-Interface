package id.its.pbo.sorting;

public class SortingProgram {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Matematika", 900);
        Buku buku2 = new Buku("About you", 300);
        Sepatu sepatu1 = new Sepatu("Nike", 42);
        Sepatu sepatu2 = new Sepatu("Adidas", 34);

        Sortable[] items = {buku1, buku2, sepatu1, sepatu2};

        Sortable[] sortedItems = Sorter.sortItems(items);

        // hasil pengurutan 
        for (Sortable item : sortedItems) {
            if (item instanceof Item) {
                Item currentItem = (Item) item;
                System.out.println(currentItem.getNama());
            }
        }
    }
}
