package controller;

import model.Pilha;

public class ConverteController {
	public ConverteController() {
        super();
    }
	Pilha p = new Pilha();
	
	public String decToBin(int decimal) {
		while(decimal > 0) {
            p.push(decimal % 2);
            decimal = decimal / 2;
        }
        String bin = "";
        while(!p.isEmpty()) {
            try {
				bin += p.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return bin;
    }
	}

