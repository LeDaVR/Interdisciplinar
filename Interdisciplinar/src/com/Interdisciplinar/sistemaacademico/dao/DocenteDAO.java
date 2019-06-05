package com.Interdisciplinar.sistemaacademico.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Interdisciplinar.sistemaacademico.model.Docente;
import com.Interdisciplinar.sistemaacademico.model.Conexion;

public class DocenteDAO {
	private Conexion con;
	private Connection connection;

	public DocenteDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	// insertar Docente
	public boolean insertar(Docente docente) throws SQLException {
		String sql = "INSERT INTO sistema_academico.docente (CUD, NOMBRE, APELLIDOS,GRADO_ACADEMICO) VALUES ( ?, ?, ?, ?);";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, docente.getCud());
		statement.setString(2, docente.getNombre());
		statement.setString(3, docente.getApellido());
		statement.setString(4, docente.getGrado_academico());
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowInserted;
	}

		public List<Docente> listarDocentes() throws SQLException {
			List<Docente> listaDocentes = new ArrayList<Docente>();
			String sql = "SELECT * FROM sistema_academico.docente";
			con.conectar();
			connection = con.getJdbcConnection();
			Statement statement = connection.createStatement();
			ResultSet resulSet = statement.executeQuery(sql);

			while (resulSet.next()) {
				int cud = resulSet.getInt("CUD");
				String nombre = resulSet.getString("NOMBRE");
				String apellido = resulSet.getString("APELLIDOS");
				String grado = resulSet.getString("GRADO_ACADEMICO");
				Docente docente = new Docente(cud, nombre, apellido,grado);
				listaDocentes.add(docente);
			}
			con.desconectar();
			return listaDocentes;
		}
		
}