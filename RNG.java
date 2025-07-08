public class RNG {
	
	private double increment;
	private static final double INCREMENT_AMOUNT = 0.0000001;
	
	public RNG() {
		increment = 0.0000001;
	}
	
	public double RandomNumber() {
		double seed = 3.65 + increment;
		double result = 0.5;
		
		for (int i = 0; i < 100; i++) {
			result = seed*result*(1-result);
		}
		
		increment += INCREMENT_AMOUNT;
		return result;
	}
	
	public static void main(String args[]) {
		RNG rand = new RNG();
		for (int i = 0; i < 50; i++) {
			System.out.println(rand.RandomNumber());
		}
	}
	
	
	
}