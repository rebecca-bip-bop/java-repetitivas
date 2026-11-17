public class Exercicioa {
	void main() {
		int numero = Integer.parseInt(IO.readln("Informe um numero: "));
		
		for(int mult = 1; mult<=10; mult++) {
			IO.println(numero + " x " + mult + " = " + numero*mult);
		}
	}

}
