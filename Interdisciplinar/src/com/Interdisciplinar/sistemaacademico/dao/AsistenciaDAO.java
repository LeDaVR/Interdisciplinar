package com.Interdisciplinar.sistemaacademico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Interdisciplinar.sistemaacademico.model.Alumno;
import com.Interdisciplinar.sistemaacademico.model.Asistencia;
import com.Interdisciplinar.sistemaacademico.model.Conexion;


public class AsistenciaDAO {

	private Conexion con;
	private Connection connection;


	public AsistenciaDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	public List<Asistencia> obtenerAsistencia(String atributo,String x) throws SQLException
	{
		List<Asistencia> listaAsistencias = new ArrayList<Asistencia>();
		
		Asistencia asistencia = null;
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement st;
		
		if(atributo == "" || atributo == null) 
		{
			String sql = "SELECT * FROM ASISTENCIA";
			st = connection.prepareStatement(sql);
		}
		else
		{
			String sql = "SELECT * FROM ASISTENCIA WHERE ? = ? ";
			st = connection.prepareStatement(sql);
			st.setString(1, atributo);
			st.setString(2, x);
		}
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			int id_asistencia = rs.getInt(1);
			int fk_grupo = rs.getInt(2);
			boolean asis_profesor = rs.getBoolean(3);
			String fecha = rs.getString(4);
			
			asistencia = new Asistencia(id_asistencia,fk_grupo,asis_profesor,fecha);
			listaAsistencias.add(asistencia);
		}
		
		if(connection != null) connection.close();
		if(st != null) st.close();
		if(rs != null) rs.close();
		
		return listaAsistencias;
		
	}
	
	public List<Alumno> obtenerAsisAlumnos(int id_asistencia) throws SQLException
	{
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		Alumno alumno = null;
		con.conectar();
		connection =  con.getJdbcConnection();
		
		String sql = "SELECT ALUMNO.CUI,ALUMNO.NOMBRE,ALUMNO.APELLIDOS,ALUMNO.EDAD,ALUMNO.SEXO FROM ALUMNO \n" + 
			  "INNER JOIN ASISTENCIA_ALUMNO \n" + 
			  "ON ASISTENCIA_ALUMNO.FK_CUI = ALUMNO.CUI\n" + 
		      "INNER JOIN ASISTENCIA\n" + 
			   "ON ASISTENCIA_ALUMNO.FK_ASISTENCIA = ASISTENCIA.ID_ASISTENCIA WHERE ASISTENCIA.ID_ASISTENCIA = ? ";
		
		PreparedStatement st = connection.prepareStatement(sql);
		st.setInt(1, id_asistencia);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			int cui = rs.getInt(1);
			String nombre = rs.getString(2);
			String apellido = rs.getString(3);
			int edad = rs.getInt(4);
			String sexo = rs.getString(5);
			
			
			alumno = new Alumno(cui,nombre,apellido,edad,sexo);
			listaAlumnos.add(alumno);
		}
		
		if(connection != null) 
			connection.close();
		if(st != null) st.close();
		if(rs != null) rs.close();
		
		return listaAlumnos;
	}
	
	public boolean insertar(Asistencia asistencia) throws SQLException {
		String sql = "INSERT INTO  sistema_academico.asistencia (ID_ASISTENCIA,FK_GRUPO,ASISTENCIA_PROFESOR,FECHA) values (?,?,?,?);";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, asistencia.getId_asistencia());
		statement.setInt(2, asistencia.getFk_grupo());
		statement.setBoolean(3, asistencia.isAsistencia_profesor());
		statement.setString(4, asistencia.getFecha());
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowInserted;
	}

}