
public class Vitamina extends Bebida {

	private static final double ACRESCIMO = 2.5;


	public Vitamina(EFruta fruta) {
		super("Vitamina") ;
		adicionar(fruta) ;
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if(frutas.size() < 3 && fruta != null) {
			frutas.add(fruta) ;
			} 
		return frutas.size() ;
	}

	@Override 
	public double preco() {
		double preco = 0 ;
		for (EFruta fruta : frutas) {
			preco += fruta.valor() ;
		}
		preco = preco / frutas.size() + ACRESCIMO;
		return preco ;
	} // falta o tamanho
	

	@Override 
	public String toString() {
		return " " ;
	}

}
