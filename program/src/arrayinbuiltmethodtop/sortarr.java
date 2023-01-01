package arrayinbuiltmethodtop;


import java.util.Arrays;

public class sortarr {
public static void main(String[] args) {
	int [] arr={4,5,1,3,2};
	Arrays.sort(arr);
	System.out.println("----assending order");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	System.out.println("desending order");
	for(int i=arr.length-1;i>=0;i--)
	{
	System.out.println(arr[i]+" ");	
	}
}
}
