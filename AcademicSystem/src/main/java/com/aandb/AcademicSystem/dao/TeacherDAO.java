package com.aandb.AcademicSystem.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aandb.AcademicSystem.model.DBConnection;
import com.aandb.AcademicSystem.model.Teacher;


public class TeacherDAO {
	private DBConnection dbConnection;
    private Connection connection;

    public TeacherDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException
    {
        dbConnection = new DBConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }
    
    public boolean insert(Teacher teacher) throws SQLException
    {
        String sql = "INSERT INTO docentes VALUES (?, ?, ?, ?, ?, ? )";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, teacher.getId());
        statement.setInt(2, teacher.getDni());
        statement.setString(5, teacher.getNombre());
        statement.setString(3, teacher.getGrado_academico());
        statement.setString(4, teacher.getDocentescol());
        statement.setInt(6, teacher.getId_departamento_academico());
        
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        dbConnection.disconnect();
        return rowInserted;
    }
    
    public List<Teacher> listTeachers() throws SQLException
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
    }
    
    public Teacher getTeacherByName(String name) throws SQLException
    {
        Teacher teacher = new Teacher();
        
        String sql = "SELECT * FROM docentes WHERE nombre='"+name+"';";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet res = statement.executeQuery();
        if(res.next())
        {
        	teacher.setId(res.getInt("id"));
        	teacher.setDni(res.getInt("dni"));
        	teacher.setNombre(res.getString("nombre"));
        	teacher.setGrado_academico(res.getString("grado_academico"));
        	teacher.setDocentescol(res.getString("docentescol"));
        	teacher.setId_departamento_academico(res.getInt("iddepartamentoacademico"));
        }
        res.close();
        dbConnection.disconnect();
        
        return teacher;
    }
    /*
    public boolean update(Student student) throws SQLException
    {
        String sql = "UPDATE alumno SET nombre=?, apellidos=?, edad=?, sexo=? WHERE cui=?";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, student.getName());
        statement.setString(2, student.getLastName());
        statement.setInt(3, student.getAge());       
        statement.setString(4, student.getSex());
        statement.setInt(5, student.getCui());
        
        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        dbConnection.disconnect();
        return rowUpdated;
    }
    
    public boolean delete(Student student) throws SQLException
    {
        String sql = "DELETE FROM alumno WHERE cui=?";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, student.getCui());
        
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        dbConnection.disconnect();
        return rowDeleted;
    }
     */
}
