package id.its.pbo.sorting;

import java.util.Arrays;

public class Sorter {
	
	//metode static sort items
	
    public static Sortable[] sortItems(Sortable[] item) {
    	
        Arrays.sort(item, (a, b) -> a.compare(b)); // sort and compare
        
        return item;
    }
}
