package controller;

public class RecSoma {
	public RecSoma(){
        super();
	}	
	
    public int Calcular(int num){
        if (num<=0){
            return 0;
        }else{
            int soma = num;
            num--;
            return soma+Calcular(num);
}
}}