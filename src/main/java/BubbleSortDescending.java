/**
 * Created by ken on 7/16/17.
 */
public class BubbleSortDescending {
    public static void main(String[] args) {
        //Bubblesort descending
        int[] stuffToSort = {4, 8, 5, 3, 4, 1, 10, 23, 6};



        for (int j = 0; j < stuffToSort.length; j++) { //do swaps for the length of array
            for (int i = 0; i < stuffToSort.length - 1; i++) {
                int temp;
                if (stuffToSort[i] < stuffToSort[i + 1]) { // if current is smaller than previous
                    temp = stuffToSort[i]; // store current
                    stuffToSort[i] = stuffToSort[i + 1]; // set current to next (larger)
                    stuffToSort[i + 1] = temp; //set next to current (smaller)
                }

            }

        }
        for (int num : stuffToSort) System.out.println(num);
    }

}
