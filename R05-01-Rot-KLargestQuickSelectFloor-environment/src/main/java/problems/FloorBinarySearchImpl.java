package problems;

public class FloorBinarySearchImpl implements Floor {

	@Override
	public Integer floor(Integer[] array, Integer x) {
		return 0;
		
	}

	public Integer binarySearch(Integer[] array, int leftIndex, int rightIndex, int element)
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
                futureElementIndex = binarySearch(array, leftIndex, middle - 1, element);
            }
            else
            {
               futureElementIndex = binarySearch(array, middle + 1, rightIndex, element);
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

	public void merge(Integer[] array, int leftIndex, int rightIndex)
	{
		int middle = (leftIndex + rightIndex)/2;
		int k = leftIndex;
		int i = leftIndex;
		int j = middle + 1;
	}
}
