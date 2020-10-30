package zadanie.sort;

public class BubbleSort {

    long start, finish, timeElapsed;
    int size, t;

    public BubbleSort(int[] tablica) {

        start = System.currentTimeMillis();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    t = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = t;
                }
            }
        }
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.print("Tablica posortowana bąbelkowo: ");

        for (int i = 0; i < size; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.print("\nCzas obliczeń: " + timeElapsed + "ms\n");
    }
}
