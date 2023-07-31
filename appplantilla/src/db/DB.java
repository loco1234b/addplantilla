package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
	Connection cn= null;
	PreparedStatement ps = null;
	String SQL = "";
	
	public DB(String database) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database,"root","");
		} catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
	}
	public void Sentencia(String sql) {
		if ( cn== null)return;
		
		this.SQL = sql;
		try {
			ps = cn.prepareStatement(sql);
		} catch (SQLException e) {e.printStackTrace();}
	}
	public String[] getRegistro() {
		if(cn == null || ps == null)return null;
		try {
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String[] aRegistro = new String[rs.getMetaData().getColumnCount() ];
				for(int i=0; i < aRegistro.length; i++)
					aRegistro[i] = rs.getString(i + 1).trim();
				rs.close();
				return aRegistro;
			}
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	public ArrayList<String> getArrayList() {
		if(cn == null || ps == null)return null;
		try {
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ArrayList<String> aRegistro = new ArrayList<>();
				for(int i=0, columnas = rs.getMetaData().getColumnCount(); i < columnas; i++)
					aRegistro.add(rs.getString(i + 1).trim());
					
				rs.close();
				return aRegistro;
			   }
		}catch (SQLException e) {e.printStackTrace();}
	    return null;
	}
	
	/*String IP ="localhost", PORT= "3306", USER ="root", PASSWORD="", BD="",SQL="";
	PreparedStatement ps = null;
	
	public DB(String BD) {
		this.BD = BD;
		
	}
	private Connection getConnection() {
		try {
	
			return DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s" , IP,PORT,BD) ,USER,PASSWORD);
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	public void Sentencia(String SQL) {
		this.SQL = SQL;
		try {
			ps = getConnection().prepareStatement(SQL);
		}catch (SQLException ex) {
			System.out.println(ex.getMessage());
			Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	public String[][] getRegistros() {
		try {
			ResultSet rs= ps.executeQuery();
			if(rs.last()) {
				int filas =rs.getRow();
				int columnas = rs.getMetaData().getColumnCount();
				String [][] mRegistros = new String[filas][columnas];
				rs.beforeFirst();
				
				for (int fila = 0; rs.next(); fila++ )
					for (int columna = 0; columna < columnas; columna++ )
						mRegistros[fila][columna] = rs.getString(columna + 1).trim();
				
				return mRegistros;
						
			}
		}catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}*/

}
