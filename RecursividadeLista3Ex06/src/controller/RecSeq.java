package controller;

public class RecSeq {
	public RecSeq() {
		
	}
	public double Seq(int n, double total) {
		if (n <=1) {// se o valor de n chegar a 1 deve retorna o total +1
			return total +1;
		}
		double soma =1;
		total = total + 1/Fat(n,soma);// chama a funcao recursiva para realizar o fatorial e realiza o numero/fatorial
		return Seq(n-1,total);// chama a funcao recursiva de n-1 para o proximo numero da sequencia
	}
	public double Fat(int num, double soma) {
		if (num <=0) {
			return soma;// ao chegar a 0 o numero retorna a soma
		}
		else {
			soma = soma * num;// realiza a conta do fatorial
			num--;
			return Fat(num,soma);// chama o proximo numero da conta do fatorial
		}
}}
