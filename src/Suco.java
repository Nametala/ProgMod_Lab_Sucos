import java.util.ArrayList;

public class Suco extends Bebida {

	public Suco(EFruta fruta) {
		super("Suco") ;
		adicionar(fruta) ;
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if(frutas.size() == 1 && fruta != null) {
			if(fruta.equals(EFruta.LARANJA) || frutas.get(0).equals(EFruta.LARANJA)) {
			frutas.add(fruta) ;
			} // falta o caso quando for 0 frutas no criador
		}
		return frutas.size() ;
	}

	@Override 
	public double preco() {
		double preco = 0 ;
		for (EFruta fruta : frutas) {
			preco += fruta.valor() ;
		}
		preco = preco / frutas.size() ;
		return preco ;
	}

	@Override 
	public String toString() {
		String descricao = " " ;
		return descricao ;
	}

}
