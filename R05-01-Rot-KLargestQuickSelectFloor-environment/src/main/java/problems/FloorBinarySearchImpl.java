package problems;

import util.Util;

public class FloorBinarySearchImpl implements Floor {

	@Override
	public Integer floor(Integer[] array, Integer x) {
		//mergeSort(array, 0, array.length - 1);

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
    public void QuickSortMedianOfThree(Integer[] array, int leftIndex, int rightIndex)
    {
        if (leftIndex < rightIndex)
        {}
        else
        {
            int pivot = rightIndex - 1;
            partition(array, leftIndex, rightIndex);
        }
    }
    public void partition(Integer[] array, int leftIndex, int rightIndex)
    {
        MedianOfThree(array, leftIndex, rightIndex);

        int pivot = array[rightIndex - 1];
        int swapedIndex = rightIndex - 1;

        for (int i = swapedIndex - 1 ; i <= 0 ; i--)
        {
            if (array[i] > pivot)
            {
                swapedIndex--;
                Util.swap(array, swapedIndex, i);
            }
        }
        Util.swap(array, rightIndex - 1, swapedIndex);


    }
    public void MedianOfThree(Integer[] array, int leftIndex, int rightIndex)
    {
        int middle = (leftIndex + rightIndex)/2;

        if (array[leftIndex] > array[middle])
        {
            Util.swap(array, leftIndex, middle);
        }
        if (array[leftIndex] > array[rightIndex])
        {
            Util.swap(array, leftIndex, rightIndex);
        }
        if (array[middle] > array[rightIndex])
        {
            Util.swap(array, rightIndex, middle);
        }

        Util.swap(array, middle, array.length -1);
    }

}
