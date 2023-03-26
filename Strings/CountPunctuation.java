import java.util.Scanner;

class CountPunctuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String ip = sc.nextLine();
        int count = 0;
        
        for(int i=0; i<ip.length(); i++){
            if(ip.charAt(i) == '!' 
            || ip.charAt(i) == ',' 
            || ip.charAt(i) == ';' 
            || ip.charAt(i) == '\"' 
            || ip.charAt(i) == '\'' 
            || ip.charAt(i) == ':' 
            || ip.charAt(i) == '?' )
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
