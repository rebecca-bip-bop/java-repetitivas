public class Exercicioj {
	void main() {
		int num, soma, media, j;
		soma = 0;
		num = 50;
		j = 0;
		
		for(int i = 50; i <= 70; i++) {
			num++;
			if(num % 2 == 0) {
				j++;
				soma += num; 
			}
		}
		media = soma/j;
		IO.println("The sum is: " + soma);
		IO.println("Media" + media);
		
	}

}
