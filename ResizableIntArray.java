import java.util.Arrays;
public class ResizableIntArray
{
	private int[] internalArray;
	public ResizableIntArray()
	{
		this(10);
	}
	public ResizableIntArray(int size)
	{
		internalArray = new int[size];
	}
	public void resize(int size)
	{
		if(size<1) throw new RuntimeException();
		int[] replacement = new int[size];
		int elementsToCopy;
		
		if(size < internalArray.length)
			elementsToCopy = size;
		else elementsToCopy = internalArray.length;
		
		for(int i = 0; i < elementsToCopy; i++)
		{
			replacement[i] = internalArray[i];
		}
	}
	
	public int get(int index)
	{
		return internalArray[index];
	}
	public void set(int index, int item)
	{
		internalArray[index] = item;
	}
	public int size()
	{
		return internalArray.length;
	}
	public String toString()
	{
		return Arrays.toString(internalArray);
	}
}