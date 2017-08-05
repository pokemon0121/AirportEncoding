
public class S {

	public static void main(String[] args) {
		System.out.println(encode("JFK"));
		System.out.println(decode(100611));
	}

	private static int encode(String airport) {
		int t = 0;
		for (char c : airport.toCharArray()) {
			t *= 100;
			t += c - 'A' + 1;
		}
		return t;
	}
	
	private static String decode(int code) {
		String t = "";
		while (code > 0) {
			t = (char)(code % 100 - 1 + 'A') + t;
			code /= 100;
		}
		return t;
	}
}
