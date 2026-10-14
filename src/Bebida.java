import java.util.ArrayList;
import java.util.List;

public abstract class Bebida {

	private String descricao;
	protected List<EFruta> frutas;

	public Bebida(String descricao) {
		this.frutas = new ArrayList<>() ;
		this.descricao = descricao;
	}

	public abstract int adicionar(EFruta fruta);

	public abstract double preco();

	@Override
	public String toString() {
		return descricao;
	}

}
