import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import orderStatistic.KLargest;
import orderStatistic.KLargestOrderStatisticsImpl;
import problems.FloorBinarySearchImpl;

public class FloorTests 
{
    Integer[] vetorTampar;
    private Integer[] vetorTamPar;
	private Integer[] vetorTamImpar;
	private Integer[] vetorVazio = {};
	private Integer[] vetorValoresRepetidos;
	private Integer[] vetorValoresIguais;
    private FloorBinarySearchImpl floorBinarySearch;
    //private KLargestOrderStatisticsImpl<Integer> kLargest;


    @Before
    public void setUp()
    {
        vetorTamPar = new Integer[]{ 30, 28, 7, 29, 11, 26, 4, 22, 23, 31};
        vetorTamImpar = new Integer[]{ 6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36 };
        vetorValoresRepetidos = new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 };
        vetorValoresIguais = new Integer[] { 6, 6, 6, 6, 6, 6 };
        floorBinarySearch = new FloorBinarySearchImpl();
       
    } 
    
    @Test
    public void FloorVetorParTest()
    {
        assert floorBinarySearch.floor(vetorTamPar, 12) == 11;
    }

    @Test
    public void FloorVetorParNaoExisteTest()
    {
        assert floorBinarySearch.floor(vetorTamPar, 3) == null;
    }

    @Test
    public void orderStatisticsVetorPar()
    {
        KLargestOrderStatisticsImpl<Integer> kLargest = new KLargestOrderStatisticsImpl<Integer>();
        Integer[] vetorTresMaiores = new Integer[]{31, 30, 29, 28, 26, 23, 22, 11, 7, 4};
        assertArrayEquals(kLargest.getKLargest(vetorTamPar, 10), vetorTresMaiores);
    }

    @Test
    public void orderStatisticsInvalido()
    {
        KLargestOrderStatisticsImpl<Integer> kLargest = new KLargestOrderStatisticsImpl<Integer>();
        Integer[] vetorVazio = new Integer[]{};
        assertArrayEquals(kLargest.getKLargest(vetorTamPar, 12), vetorVazio);
    }
}
