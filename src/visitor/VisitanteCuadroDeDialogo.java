package visitor;

import entidades.CuadroDeDialogo;

public class VisitanteCuadroDeDialogo extends Visitante {
	
	@SuppressWarnings("unused")
	private CuadroDeDialogo cuadroDeDialogo;
	
	public VisitanteCuadroDeDialogo(CuadroDeDialogo cdd) {
		this.cuadroDeDialogo = cdd;
	}
}
