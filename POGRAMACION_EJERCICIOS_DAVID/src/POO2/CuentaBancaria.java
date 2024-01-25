package POO2;

public class CuentaBancaria {
	private String titular;
	private double saldo;

	public CuentaBancaria() {
		
	titular="David"	;
	saldo= -1000;
	}
	public String gettitular() {
		return titular;
		
	}
	public double getsaldo() {
		return saldo;
	}	
	public void settitular(String titular) {
		this.titular=titular;
		
	}
	public void setSaldo(double saldo) {
	    if (saldo >= 0) {
	        this.saldo = saldo;
	    } else {
	        System.out.println("Error: El saldo no puede ser negativo.");
	    }
		
	}
	}


