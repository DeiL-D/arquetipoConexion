package CONTROLLER;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import MODELO.conexion.conexionPostgresql;
import util.variablesConexionPostgreSQL;
import java.sql.PreparedStatement;


public class homecontroller  {
public static void main(String[] args) {
	//CONSTANTES
	 variablesConexionPostgreSQL vcpsql = new variablesConexionPostgreSQL();
	 final String HOST = vcpsql.getHost();
	final String PORT = vcpsql.getPort();
	 final String DB = vcpsql.getDb();
	 final String USER = vcpsql.getUser();
	 final String PASS = vcpsql.getPass();
		
		Statement declaracionSQL = null;
		ResultSet rs = null;
		
		/*Se crea una instancia de la clase en la que estamos para poder generar la conexión a PostgreSQL
		*utilizando el método generaConexion
		*/
		conexionPostgresql conexionPostgresql = new conexionPostgresql();
		Connection conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);
		
		
		
	
	}
}
