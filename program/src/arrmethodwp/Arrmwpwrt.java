package arrmethodwp;

public class Arrmwpwrt {
static int[] array(int[] arr)
{
	return arr;
}
public static void main(String[] args) {
	int[] arr={1,2,3,4,5};
	int[] arr1=array(arr);//{1,2,3,4,5}
	for(int i=0;i<arr1.length;i++){
		System.out.println(arr1[i]+" ");
	}
}
}
