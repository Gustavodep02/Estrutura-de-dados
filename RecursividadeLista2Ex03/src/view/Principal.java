package view;
import controller.RecPares;
public class Principal {
	public static void main(String[] args) {
		RecPares p = new RecPares();
		int vet [] = {10,5,2,3,1};
		int tamanho = vet.length;
		int ver = 0;
		int atual = 0;
		int total=0;
		for(int i = 0; i<tamanho;i++) {
			if (vet[i]<=0) {
				ver = 1;
			}
		}
		if (ver ==1) {
		System.out.println("Numero invalido");
	}else{
		total = p.Pares(vet, tamanho, atual,total );
		System.out.println(total);
	}
		}
	
}
