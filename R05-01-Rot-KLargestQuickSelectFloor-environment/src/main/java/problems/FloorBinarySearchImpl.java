package problems;

public class FloorBinarySearchImpl implements Floor {

	@Override
	public Integer floor(Integer[] array, Integer x) {
		mergeSort(array, 0, array.length - 1);

        return binarySearchFloor(array, 0, array.length - 1, x);
		
	}

	public Integer binarySearchFloor(Integer[] array, int leftIndex, int rightIndex, int element)
	{
		int middle = (leftIndex + rightIndex)/2;
        Integer elementIndex = null;
        Integer futureElementIndex = null;
        if (leftIndex > rightIndex)
        {
            elementIndex = null;
            futureElementIndex  = null;
        }
        else
        {
            if (array[middle] <= element)
            {
                futureElementIndex = array[middle];
                elementIndex = array[middle];
            }
            if (array[middle] > element)
            {
                futureElementIndex = binarySearchFloor(array, leftIndex, middle - 1, element);
            }
            else
            {
               futureElementIndex = binarySearchFloor(array, middle + 1, rightIndex, element);
            }
        }

        if (elementIndex == null && futureElementIndex != null)
		{
			elementIndex = futureElementIndex;
		}
		if(elementIndex != null && futureElementIndex != null && futureElementIndex > elementIndex)
		{
			elementIndex = futureElementIndex;
		}

        return elementIndex;
	}
    public void mergeSort(Integer[] array, int leftIndex, int rightIndex)
    {
        if (leftIndex >= rightIndex)
        {}
        else
        {
            int middle = (leftIndex + rightIndex)/2;
            mergeSort(array, leftIndex, middle);
            mergeSort(array, middle + 1, rightIndex);
            merge(array, leftIndex, rightIndex, middle);
        }
        
    }
	public void merge(Integer[] array, int leftIndex, int rightIndex, int middle)
	{
        Integer[] helper = new Integer[array.length];
		int k = leftIndex;
		int i = leftIndex;
		int j = middle + 1;

        //memoria auxiliar
        for (int w = leftIndex; w <= rightIndex; w++)
        {
            helper[w] = array[w];
        }

        while (i <= middle && j <= rightIndex)
        {
            if (helper[i] <= helper[j])
            {
                array[k] = helper[i];
                i++;
            }
            else
            {
                array[k] = helper[j];
                j++;
            }
            k++;
        }

        while(i <= middle)
        {
            array[k] = helper[i];
            i++;
            k++;
        }
	}
}
