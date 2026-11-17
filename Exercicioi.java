public class Exercicioi {
	void main() {
		int soma = 0;
		for(int i = 1; i<=10; i++) {
			Double num = Double.parseDouble(IO.readln("Enter a number: "));
			soma += num;
		}
		IO.println("A media eh: " + soma/10);
	}

}
