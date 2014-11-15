//program koji ispisuje cifre nasumicno generisanog broja izmedju 10-99999
public class IspisCifaraRandomBroja {
	public static void main(String[] args) {
		int min=10, max=99999;
		int br=(min+(int)(Math.random()*(max-min+1)));
		System.out.println(br);
		while(br!=0) {
		System.out.print(br%10); 
		br=br/10;
		}
	}

}
