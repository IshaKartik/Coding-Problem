package com.sorting;

import org.junit.Assert;
import org.junit.Test;

public class TestMergeSort {

	@Test
	public void merge_sortTest(){
		int a[] = {9,7,6,3,2,1,15,60,0,59};
		MergeSort.merge_sort(a, 0, a.length-1);
		int [] expected ={0, 1, 2, 3, 6, 7, 9, 15, 59, 60};
		Assert.assertArrayEquals(expected, a);
	}
}
