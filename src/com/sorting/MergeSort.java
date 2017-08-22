package com.sorting;

public class MergeSort {
	public static void merge_sort(int[]a, int start, int end){
		if(start < end){
			int mid = (start + end)/2;
			merge_sort(a,start,mid);
			merge_sort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}
	public static void merge(int [] a, int start, int mid,int end){
		
		int startA= start,k=0;
		int startB = mid+1;
		int [] c = new int [end -start+1];
		while(startA <= mid && startB <= end){
			if(a[startA] <= a[startB]){
				c[k] = a[startA];
				startA++;
			}else if(a[startB] < a[startA]){
				c[k]= a[startB];
				startB++;
			}
			k++;
		}		
		if(startA > mid){

			while(startB <= end){
				c[k]= a[startB];	
				startB++;
				k++;
			}
		}
		if( startB > end){
			while(startA<= mid){
				c[k]= a[startA];
				startA++;
				k++;
			}
		}
		for(int i=0;i< c.length;i++){
			a[start++] = c[i];
		}
	}
	
	
	
	public static void main(String[] args) {
		int a[] = {9,7,6,3,2,1,15,60,0,59};
	//	int arr[] = new int[a.length];        
         MergeSort.merge_sort(a, 0, a.length-1);
         for(int k=0; k<a.length;k++){
 			System.out.print(a[k] +" ");
 		}
	}
	
	public static void mergeHackrRank(int A[ ] , int start, int mid, int end) {
		 //stores the starting position of both parts in temporary variables.
		int startA = start ,startB = mid+1;
		int []Arr  = new int [end-start+1];
		int  k=0;
		for(int i = start ;i <= end ;i++) {
		    if(startA > mid)      //checks if first part comes to an end or not .
		       Arr[ k++ ] = A[ startB++] ;

		   else if ( startB > end)   //checks if second part comes to an end or not
		       Arr[ k++ ] = A[ startA++ ];

		   else if( A[ startA ] < A[ startB ])     //checks which part has smaller element.
		      Arr[ k++ ] = A[ startA++ ];

		   else
		      Arr[ k++ ] = A[ startB++];
		 }
		  for (int x=0 ; x< k ;x ++) {
		   /* Now the real array has elements in sorted manner including both 
		        parts.*/
		     A[ start++ ] = Arr[ x ] ;                          
		  }
		}

}
