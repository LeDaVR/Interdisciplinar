package com.aandb.AcademicSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aandb.AcademicSystem.model.Resultados;
import com.aandb.AcademicSystem.model.DBConnection;

public class ResultadosDAO {
	
	private DBConnection dbConnection;
    private Connection connection;
    
    public ResultadosDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException
    {
        dbConnection = new DBConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }
    
    public boolean insert(Resultados resultado) throws SQLException
    {
    	int nextId=0;
    	String sql = "SELECT * FROM resultado";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        while(resultSet.next())
        {
            nextId = resultSet.getInt("id");
        }
        
        String sqlinsert = "INSERT INTO resultado VALUES (?,?)";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        PreparedStatement statementinsert = connection.prepareStatement(sqlinsert);
        statementinsert.setInt(1,nextId+1);
        statementinsert.setString(2, resultado.getDescripcion());
        
        boolean rowInserted = statementinsert.executeUpdate() > 0;
        statement.close();
        dbConnection.disconnect();
        return rowInserted;
    }
    
    public List<Resultados> listResults() throws SQLException
    {
        List<Resultados> listResults = new ArrayList<Resultados>();
        String sql = "SELECT * FROM resultados";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        while(resultSet.next())
        {
            int id = resultSet.getInt("id");
            String descripcion = resultSet.getString("descripcion");
            
            Resultados result = new Resultados();
            result.setId(id);
            result.setDescripcion(descripcion);
            
            listResults.add(result);
        }
        
        dbConnection.disconnect();
        return listResults;
    }
    
    public Resultados getResultById(int id) throws SQLException
    {
    	Resultados result = new Resultados();
        
        String sql = "SELECT * FROM resultados WHERE id='"+Integer.toString(id)+"';";
        dbConnection.connect();
        connection = dbConnection.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet res = statement.executeQuery();
        if(res.next())
        {
        	result.setId(res.getInt("id"));
        	result.setDescripcion(res.getString("descripcion"));
        }
        res.close();
        dbConnection.disconnect();
        
        return result;
    }
}
