package pokemon;

public abstract class Turno {

	
	 private int numTurno;
	 private int cuentaTurno;
	
	//Movimiento movEntrenador;
	//Movimiento movEntrenadorRival;
	 private String Movimiento;
	 private String movJugadorMovimiento;
	 private String movRivalMovimiento;

	 
	 public Turno(int numTurno, int cuentaTurno, String movimiento, String movJugadorMovimiento,
				String movRivalMovimiento) {
			this.numTurno = numTurno;
			this.cuentaTurno = cuentaTurno;
			Movimiento = movimiento;
			this.movJugadorMovimiento = movJugadorMovimiento;
			this.movRivalMovimiento = movRivalMovimiento;
		}
	 
	 


		public int getNumTurno() {
		return numTurno;
	}




	public void setNumTurno(int numTurno) {
		this.numTurno = numTurno;
	}




	public String getCuentaTurno() {
		return "Turno " + numTurno + ":";
	}




	public void setCuentaTurno(int cuentaTurno) {
		this.cuentaTurno = cuentaTurno;
	}




	public String getMovimiento() {
		return Movimiento;
	}




	public void setMovimiento(String movimiento) {
		Movimiento = movimiento;
	}




	public String getMovJugadorMovimiento() {
		return "Entrenador: " + movJugadorMovimiento;
	}




	public void setMovJugadorMovimiento(String movJugadorMovimiento) {
		this.movJugadorMovimiento = movJugadorMovimiento;
	}




	public String getMovRivalMovimiento() {
		return "Rival: "+ movRivalMovimiento;
	}




	public void setMovRivalMovimiento(String movRivalMovimiento) {
		this.movRivalMovimiento = movRivalMovimiento;
	}




		

		
		
}
