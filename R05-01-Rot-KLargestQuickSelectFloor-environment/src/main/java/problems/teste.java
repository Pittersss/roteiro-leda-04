package problems;

import java.util.Arrays;

public class teste {

    public static void main(String[] args) {
        FloorBinarySearchImpl floorBinarySearch = new FloorBinarySearchImpl();
        Integer[] vetorTamPar = new Integer[]{ 30, 28, 7, 29, 11, 26, 4, 22, 23, 31};
        Arrays.sort(vetorTamPar);
        System.out.println(floorBinarySearch.binarySearch(vetorTamPar, 0, vetorTamPar.length - 1, 29));

    }
}
