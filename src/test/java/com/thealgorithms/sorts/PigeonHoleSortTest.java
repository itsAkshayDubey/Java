package com.thealgorithms.sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PigeonHoleSortTest {

	@Test
	void testPigeonHoleSort()
	{
		//given
		int[] array = {8, 3, 2, 7, 4, 6, 8};
		int[] sortedArray = {2, 3, 4, 6, 7, 8, 8};
		
		//when
		PigeonHoleSort.pigeonHoleSort(array);

		//then
		assertArrayEquals(array,sortedArray);
	}
}
