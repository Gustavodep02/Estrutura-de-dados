package controller;

public class RecFib {
	public RecFib() {
		
	}
	public int Fib(int n ) {
		if (n==1 || n==2) {
			return n-1;
		}else {
			return Fib(n-1)+ Fib(n-2);
		}
	}
}
