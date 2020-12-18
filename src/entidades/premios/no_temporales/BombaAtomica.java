package entidades.premios.no_temporales;

import entidades.explosiones.ExplosionNuclear;
import logica.Juego;
import visitor.VisitanteBombaAtomica;
import visitor.Visitor;

public class BombaAtomica extends Explosivo {

	public BombaAtomica(Juego juego) {
		super(juego);
		v = new VisitanteBombaAtomica(this);
	}

	@Override
	public void ejecutar() {
		ExplosionNuclear en = new ExplosionNuclear(juego);
		en.actuar();
	}

	@Override
	public void accept(Visitor v) {
		v.visitarBombaAtomica(this);
	}
	
}
