import java.util.Arrays;

public class ArrayFunction {
	public static void main(String [] args) {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3};
		
		System.out.println(arr1 == arr2);
		System.out.println(arr1 == arr3);
		System.out.println(arr2 == arr3);
		
		System.out.println(Arrays.toString(arr1));
		changeValueByIndex(arr1, 2, 9);
		System.out.println(Arrays.toString(arr1));
		arr1 = append(arr1, 11);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void changeValueByIndex(int[] arr4, int index, int value) {
		arr4[index] = value;
	}
	
	public static int[] append(int[] arr5, int value) {
		int[] newArr = new int[arr5.length+1];
		for(int i = 0; i < arr5.length; i++) {
			newArr[i] = arr5[i];
		}
		newArr[newArr.length-1] = value;
		return newArr;
	}
}