public class Adder {
	
	public long addIncremental(long l) {
		Long sum = 0L;
		sum = sum + l;
		return sum;
	}

	public static void main(String[] args) {
		Adder adder = new Adder();
		for (long i = 0; i < 100000000; i++) {
			adder.addIncremental(i);
			System.out.println(i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}