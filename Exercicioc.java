public class Exercicioc {
	void main() {
		int sum = 0, i;
		
		for (i = 1; i<=500; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		
		IO.println(sum);
	}
}
