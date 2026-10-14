public enum EFruta {

	CUPUACU (2),
	GRAVIOLA (4),
	LARANJA(3),
	MANGA(1),
	MORANGO(5);
	
	private double valor;
	
	EFruta(double preco){
		this.valor = preco ;
	}

	public double valor(){
	return valor ;
	}
}
