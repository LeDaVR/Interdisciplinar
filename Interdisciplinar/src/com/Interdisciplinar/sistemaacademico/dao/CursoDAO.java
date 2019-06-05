package com.Interdisciplinar.sistemaacademico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Interdisciplinar.sistemaacademico.model.Curso;
import com.Interdisciplinar.sistemaacademico.model.Conexion;

public class CursoDAO {
	private Conexion con;
	private Connection connection;

	public CursoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	public boolean insertar(Curso curso) throws SQLException {
		String sql = "INSERT INTO sistema_academico.curso (CASI, NOMBRE, CREDITOS, CATEGORIA,H_TEORICAS, H_PRACTICAS, DESCRIPCION) VALUES (?, ?, ?, ?,?,?,?);";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, curso.getCasi());
		statement.setString(2, curso.getNombre());
		statement.setInt(3, curso.getCreditos());
		statement.setString(4,curso.getCategoria());
		statement.setInt(5, curso.getH_teoricas());
		statement.setInt(6, curso.getH_practicas());
		statement.setString(7, curso.getDescripcion());
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowInserted;
	}
	
		public List<Curso> listarCursos() throws SQLException {
			List<Curso> listaCursos = new ArrayList<Curso>();
			String sql = "SELECT * FROM sistema_academico.curso";
			con.conectar();
			connection = con.getJdbcConnection();
			Statement statement = connection.createStatement();
			ResultSet resulSet = statement.executeQuery(sql);

			while (resulSet.next()) {
				int casi = resulSet.getInt("CASI");
				String nombre = resulSet.getString("NOMBRE");
				int creditos = resulSet.getInt("CREDITOS");
				String categoria = resulSet.getString("CATEGORIA");
				int horasteoricas = resulSet.getInt("H_TEORICAS");
				int horaspracticas= resulSet.getInt("H_PRACTICAS");
				String descripcion = resulSet.getString("DESCRIPCION");
				Curso curso = new Curso(casi, nombre, creditos,categoria,horasteoricas,horaspracticas,descripcion);
				listaCursos.add(curso);
			}
			con.desconectar();
			return listaCursos;
		}
}
