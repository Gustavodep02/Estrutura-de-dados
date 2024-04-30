package view;

import java.util.Arrays;

import br.edu.fateczl.lista.listaObj.Lista;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista();
		
		
		l.addFirst(10);
		try {
			l.add(5,1);
			l.add(8, 2);
			l.add(1,3);
			l.add(9,4);
			l.add(2, 5);
			l.add(4,6);
			l.add(7, 7);
			l.add(3,8);
			l.add(6,9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int vet[] = new int[10];
		
		int num = 0;
		while(num != 10) {
			try {
				vet[num] = (int) l.get(num);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			num++;
			
		}
		Arrays.sort(vet);
		
		num = 0;
		while (num !=10 ) {
			try {
				l.add(vet[num], num);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			num++;
		}
		for (int i =0; i<10;i++) {
			try {
				num = (int) l.get(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Pos "+i+" Valor: "+num);
		}
		
		

	}

}
