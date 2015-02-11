public class PowersOfTwo {
	/**
	 * Program that prints all powers of 2 up to 2^20
	 * 
	 * @author Braydi Rice
	 */
	public static void main(String[] args){
		int exp = 0;
		for(int i = 1; i <= 20; i++){
			int result = (int)Math.pow(2, exp);
			exp++;
			System.out.println(result);
		}
	}
}
