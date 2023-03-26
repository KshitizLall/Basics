import java.util.Scanner;
public class CountVowelConsonant {
	public static void main(String[] args) { 
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
        int vowel = 0, consonent = 0;    
        String ip = sc.nextLine();       
        ip = ip.toLowerCase();    
            
        for(int i = 0; i < ip.length(); i++) {        
            if(ip.charAt(i) == 'a' || ip.charAt(i) == 'e' || ip.charAt(i) == 'i' || ip.charAt(i) == 'o' || ip.charAt(i) == 'u') {      
            	vowel++;    
            }    
            else if(ip.charAt(i) >= 'a' && ip.charAt(i)<='z') {  
            	consonent++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowel);    
        System.out.println("Number of consonants: " + consonent);    
    }    
}
