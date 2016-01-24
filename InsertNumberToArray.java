import java.util.Arrays;

/*Insert a number to a sorted array*/
public class InsertNumberToArray {
	public static void main(String[] args) 
	{
		int[] arr = { 2, 3, 5, 7, 11, 15 };
		
		System.out.println("Original: " + Arrays.toString(arr));
		
		arr = insert(arr, 6);
		
		System.out.println("Final: " + Arrays.toString(arr));
	}

	public static int[] insert(int[] arr, int num) 
	{
		arr = enlarge(arr);
		arr[arr.length-1] = num;
		int i = arr.length - 1;
		
		while (i > 0 && arr[i] < arr[i-1]) 
		{
			swap(arr, i - 1, i);
			i--;
		}
		return arr;
	}

	public static int[] enlarge(int[] arr) 
	{
		int[] newarr = new int[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			newarr[i] = arr[i];
		}
		return newarr;
	}
	public static void swap(int[] arr, int index1, int index2) 
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}