package zadanie.sort;

import java.util.Arrays;

public class Sort {

    long start, finish, timeElapsed;
    int size;

    public Sort(int[] tablica) {
        start = System.currentTimeMillis();
        Arrays.sort(tablica);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;

        System.out.print("Tablica posortowana: ");
        for (int i = 0; i < size; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.print("\nCzas obliczeń: " + timeElapsed + "ms\n\n");
    }
}
