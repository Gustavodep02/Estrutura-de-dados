package view;

import model.Lista;

public class Main {
	public static void main(String[] args) {
		Lista<Integer> l = new Lista<>();

		try {
			l.add(3, 0);
			l.add(5, 1);
			l.add(18, 2);
			l.add(12, 3);
			l.add(9, 4);
			l.add(7, 5);
			l.add(6, 6);
			l.add(2, 7);
			l.add(13, 8);
			l.add(4, 9);
			l.add(16, 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int tamanho = l.size();
		int cont = 0;
		while (tamanho > 0) {
			int ultimo = 0;
			try {
				ultimo = l.get(10);
				l.removeLast();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				l.add(ultimo,cont);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cont++;
			tamanho--;

		}
		for (int i = 0; i < 11; i++) {
            int valor = 0;
            try {
                valor = l.get(i);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(valor);
        }
		
	}
}
