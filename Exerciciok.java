public class Exerciciok {
	void main() {
		int x, y, areaTotal;
		areaTotal = 0;
		String nome, pergunta;
		
		
		
		do {
			nome = IO.readln("Insira nome: ");
			x = Integer.parseInt(IO.readln("Insira largura: "));
			y = Integer.parseInt(IO.readln("Insira comprimento: "));
			areaTotal += x*y;
			IO.println("Area do comodo: " + x*y);
		pergunta = IO.readln("Deseja calcular um outro comodo? y or n");
		} while (pergunta.equalsIgnoreCase("y"));
		
		IO.println("A area residencial total eh: " + areaTotal);
	}
}
