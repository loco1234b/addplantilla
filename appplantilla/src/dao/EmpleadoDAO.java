package dao;

import bean.Empleado;

public class EmpleadoDAO {
	db.DB db = new db.DB("plantilla");
	

	public void Login(Empleado empleado) {
		db.Sentencia(String.format("call sp_getempleadoLogin('%s','%s')", empleado.getDni(), empleado.getPasswordd()));
		empleado.setRegistro(db.getRegistro());
		
	}

}
