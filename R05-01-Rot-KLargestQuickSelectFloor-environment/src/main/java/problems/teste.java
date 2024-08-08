package problems;

import java.util.Arrays;

public class teste {

    public static void main(String[] args) {
        FloorBinarySearchImpl floorBinarySearch = new FloorBinarySearchImpl();
        Integer[] vetorTamPar = new Integer[]{ 30, 28, 7, 29, 11, 26, 4, 22, 23, 31};
        Integer[] vetorMerge = new Integer[]{2, 8, 11, 20, 30, 47, 51, 57, 7, 17, 20, 25, 40, 70, 90};
        Arrays.sort(vetorTamPar);
        floorBinarySearch.mergeSort(vetorTamPar, 0, vetorTamPar.length - 1);

        for (int i : vetorTamPar)
        {
            System.out.println(i);
        }

    }
}
