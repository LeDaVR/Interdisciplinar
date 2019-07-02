package com.aandb.AcademicSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aandb.AcademicSystem.model.DBConnection;
import com.aandb.AcademicSystem.model.Departamento_Academico;

public class Departamento_AcademicoDAO {
	private DBConnection dbConnection;
    private Connection connection;

    public Departamento_AcademicoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException
    {
        dbConnection = new DBConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }
    
    public boolean insert(Departamento_Academico departamento_academico) throws SQLException
    {
    	int nextId=0;
    	String sql_id = "SELECT * FROM `departamento-academico`";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        Statement statement_id = connection.createStatement();
        ResultSet resultSet = statement_id.executeQuery(sql_id);
        
        while(resultSet.next())
        {
            nextId = resultSet.getInt("id");
        }
    	
        statement_id.close();
        dbConnection.disconnect();
        
        String sql = "INSERT INTO `departamento-academico` VALUES (?, ?, ?)";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,nextId+1);
        statement.setString(2, departamento_academico.getName());
        statement.setString(3, departamento_academico.getName());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        dbConnection.disconnect();
        return rowInserted;
    }
    
    /*public List<Teacher> listTeachers() throws SQLException
    {
        List<Teacher> listTeachers = new ArrayList<Teacher>();
        String sql = "SELECT * FROM docentes";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        while(resultSet.next())
        {
            int id = resultSet.getInt("id");
            int dni = resultSet.getInt("dni");
            String name = resultSet.getString("nombre");
            String grado_academico = resultSet.getString("grado_academico");
            String docentescol = resultSet.getString("docentescol");
            int id_departamento_academico = resultSet.getInt("iddepartamentoacademico");
            
            Teacher teacher = new Teacher();
            teacher.setId(id);
            teacher.setDni(dni);
            teacher.setNombre(name);
            teacher.setGrado_academico(grado_academico);
            teacher.setDocentescol(docentescol);
            teacher.setId_departamento_academico(id_departamento_academico);
            
            listTeachers.add(teacher);
        }
        
        dbConnection.disconnect();
        return listTeachers;
    }*/
}
