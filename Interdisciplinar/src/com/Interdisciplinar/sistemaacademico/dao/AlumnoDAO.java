package com.Interdisciplinar.sistemaacademico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Interdisciplinar.sistemaacademico.model.Alumno;
import com.Interdisciplinar.sistemaacademico.model.Conexion;

public class AlumnoDAO {
	private Conexion con;
	private Connection connection;

	public AlumnoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	// insertar artículo
	public boolean insertar(Alumno alumno) throws SQLException {
		String sql = "INSERT INTO sistema_academico.alumno (CUI, NOMBRE, APELLIDOS, EDAD, SEXO) VALUES (?, ?, ?, ?, ?);";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, alumno.getCui());
		statement.setString(2, alumno.getNombre());
		statement.setString(3, alumno.getApellido());
		statement.setInt(4, alumno.getEdad());
		statement.setString(5, alumno.getSexo());
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowInserted;
	}
	// listar todos los productos
		public List<Alumno> listarAlumnos() throws SQLException {
			List<Alumno> listaAlumnos = new ArrayList<Alumno>();
			String sql = "SELECT * FROM sistema_academico.alumno";
			con.conectar();
			connection = con.getJdbcConnection();
			Statement statement = connection.createStatement();
			ResultSet resulSet = statement.executeQuery(sql);

			while (resulSet.next()) {
				int cui = resulSet.getInt("CUI");
				String nombre = resulSet.getString("NOMBRE");
				String apellido = resulSet.getString("APELLIDOS");
				int edad = resulSet.getInt("EDAD");
				String sexo= resulSet.getString("SEXO");
				Alumno alumno = new Alumno(cui, nombre, apellido,edad,sexo);
				listaAlumnos.add(alumno);
			}
			con.desconectar();
			return listaAlumnos;
		}
		
}
