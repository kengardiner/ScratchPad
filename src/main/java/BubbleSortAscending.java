/**
 * Created by ken on 7/16/17.
 */
public class BubbleSortAscending {
    public static void main(String[] args) {
        //Bubblesort
        int[] stuffToSort = {4, 8, 5, 3, 4, 1, 10, 23, 6};
        int temp;

        for (int j = 0; j < stuffToSort.length; j++) { //do swaps for the length of array

            for (int i = 1; i < stuffToSort.length; i++) {

                if (stuffToSort[i - 1] > stuffToSort[i]) { //if previous is bigger than current
                    temp = stuffToSort[i - 1]; //store previous in temp
                    stuffToSort[i - 1] = stuffToSort[i]; //set previous to current (smaller) number
                    stuffToSort[i] = temp; //set current to previous (bigger) number

                }

            }
        }
        for (int num : stuffToSort) System.out.println(num);
    }
}
