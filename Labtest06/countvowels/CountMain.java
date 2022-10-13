package countvowels;

public class CountMain {

	public static void main(String[] args) {
		Count vc = new Count();
		
		try {
			System.out.println(vc.countVowels("Shrihari Acharya"));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
