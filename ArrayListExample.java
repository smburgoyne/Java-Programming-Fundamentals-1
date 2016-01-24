import java.util.ArrayList;
public class ArrayListExample {
	public static void main(String [] args) {
		String [] arr;
		ArrayList<String> arr1 = new ArrayList<String>();
		System.out.println(arr1.size());
		arr1.add("First");
		System.out.println(arr1.size());
		System.out.println(arr1.toString());
		arr1.add("Second");
		System.out.println(arr1.size());
		System.out.println(arr1.toString());
		arr1.add(0, "before");
		System.out.println(arr1.size());
		System.out.println(arr1.toString());
		arr1.remove("First");
		System.out.println(arr1.size());
		System.out.println(arr1.toString());
		arr1.remove("Second");
		System.out.println(arr1.size());
		System.out.println(arr1.toString());
	}
}