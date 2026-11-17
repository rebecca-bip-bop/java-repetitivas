public class Exerciciof {
	void main() {
	    int base = Integer.parseInt(IO.readln("Digite a base (B): "));
	    int expoente = Integer.parseInt(IO.readln("Digite o expoente (E): "));

	    long resultado = 1;

	    for (int i = 1; i <= expoente; i++) {
	        resultado *= base;
	    }

	    IO.println(base + "^" + expoente + " = " + resultado);
	}
}
