public class SubString {
	public int strCount(String str, String sub) {
		if(str.length() < sub.length()) 
		{
			return 0;
		}
		else if(str.length() == sub.length()) 
		{
			if(str.equals(sub)) 
			{
				return 1;
			}
			else 
			{
				return 0;
			}
		}
		else {
			if(str.substring(0, sub.length()).equals(sub)) 
			{
			return 1 + strCount(str.substring(sub.length()), sub);
			}
			else 
			{
				return strCount(str.substring(1), sub);
			}
		}
	}
}
