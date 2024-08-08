import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

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
    public void FloorBaseTest()
    {
        
    }
}
