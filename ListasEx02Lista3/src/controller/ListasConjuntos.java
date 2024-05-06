package controller;

import br.edu.fateczl.lista.listaObj.Lista;

public class ListasConjuntos {

	public ListasConjuntos() {

	}

	public void interseccao(Lista a, Lista b) {
		Lista i = new Lista();
		for (int j = 0; j < 7; j++) {
			for (int k = 0; k < 5; k++) {
				int posA = 9;
				int posB = 8;
				try {
					posA = (int) a.get(j);
					posB = (int) b.get(k);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (posA == posB) {
					if (i.isEmpty()) {
						try {
							i.add(posA, 0);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						try {
							i.addLast(posA);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		for (int l = 0; l < i.size(); l++) {
			try {
				System.out.println(i.get(l));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void uniao(Lista a, Lista b) {
		Lista i = new Lista();
		for(int j = 0 ; j < 7 ; j++) {
            try {
                i.add(a.get(j), j);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }for(int k = 0 ; k < 5 ; k++) {
            int posB =3;
            boolean contains = false;
            try {
                posB = (int) b.get(k);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            for(int l = 0 ; l < i.size() ; l++) {
                int pos = 3;
            	try {
                    pos = (int) i.get(l);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if(pos == posB) {
                    contains = true;
                }
            }
            if(i.isEmpty() && !contains) {
                try {
                    i.add(posB, 0);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }else if (!contains){
                try {
                    i.addLast(posB);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
		for (int m = 0; m < i.size(); m++) {
			try {
				System.out.println(i.get(m));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
