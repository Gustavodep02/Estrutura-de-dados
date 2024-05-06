package view;

import model.Lista;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista();
		try {
			l.add(3, 0);
			l.add(5, 1);
			l.add(8, 2);
			l.add(12, 3);
			l.add(9, 4);
			l.add(7, 5);
			l.add(6, 6);
			l.add(2, 7);
			l.add(3, 8);
			l.add(7, 9);
			l.add(16, 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int maior1 =0;
		int maior2 =0;
		
		for (int i = 0; i < l.size(); i++) {
            try {
                if ((int) l.get(i) > maior1) {
                	maior2 = maior1;
                	maior1 = (int) l.get(i);
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
		System.out.println("Maior: "+maior1+" Segundo maior: "+maior2);

	}

}
