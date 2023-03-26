public class StringIntoDigitSum {

	public static void main(String[] args) {
		String str = "598894";
		int num = Integer.parseInt(str);
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		int digitSum = 0;
		while(sum > 0) {
			digitSum = digitSum + sum % 10;
			sum = sum / 10;
		}
		System.out.println(digitSum);
	}
}
