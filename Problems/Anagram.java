import java.util.Arrays;

public class Anagram{
	public static void isAnagram(String str1, String str2) {
		
		//Removing Spaces from the String
		String s1 = str1.replace("\\s", "");
		String s2 = str2.replace("\\s", "");
		
		//Setting a Boolean for Check
		boolean status = true;
		
		//Comparing Length
		if(s1.length() != s2.length()) {
			status = false;
		}
		else {
			
			//Creating Array of Characters and Converting all of the letters into the Lower Case
			char[] arrS1 = s1.toLowerCase().toCharArray();
			char[] arrS2 = s1.toLowerCase().toCharArray();
			
			//Sorting the array in Alphabetically Order
			Arrays.sort(arrS1);
			Arrays.sort(arrS2);
			
			//This return true if both the Arrays of same length
			status = Arrays.equals(arrS1, arrS2);
			
			if(status) {
				System.out.println("The Word "+str1 +" & "+str2+" are Anagrams");
			}
			else {
				System.out.println("The Word "+str1 +" & "+str2+" are NOT Anagrams");
			}
		}
	}
	
	public static void main(String[] args) {
		isAnagram("Kshitiz","Lall");
		isAnagram("Kshitiz","zitihsk");
		isAnagram("Kshitiz","is a good developer");
	}
}