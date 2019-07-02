package com.aandb.AcademicSystem;

import java.sql.SQLException;

import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.aandb.AcademicSystem.dao.StudentDAO;
import com.aandb.AcademicSystem.dao.SubjectDAO;
import com.aandb.AcademicSystem.dao.SilabusDAO;
import com.aandb.AcademicSystem.dao.CronogramaDAO;
import com.aandb.AcademicSystem.dao.CompetenciasDAO;
import com.aandb.AcademicSystem.dao.ResultadosDAO;
import com.aandb.AcademicSystem.dao.TeacherDAO;
import com.aandb.AcademicSystem.dao.Departamento_AcademicoDAO;
import com.aandb.AcademicSystem.dao.Silabo_DocenteDAO;
import com.aandb.AcademicSystem.dao.HorarioDAO;
import com.aandb.AcademicSystem.dao.Competencia_ResultadosDAO;
import com.aandb.AcademicSystem.dao.Estrategia_EnseniansaDAO;
import com.aandb.AcademicSystem.dao.Silabo_EstrategiaDAO;
import com.aandb.AcademicSystem.dao.BibliographyDAO;
import com.aandb.AcademicSystem.dao.Silabo_BibliografiaDAO;

@SpringBootApplication
public class Application
{
    private static ConfigurableApplicationContext context;
    public static SilabusDAO silaboDAO;
    public static StudentDAO studentDAO;
    public static SubjectDAO subjectDAO;
    public static CronogramaDAO cronogramaDAO;
    public static CompetenciasDAO competenciasDAO;
    public static ResultadosDAO resultadosDAO;
    public static TeacherDAO teacherDAO;
    public static Departamento_AcademicoDAO departamento_academicoDAO;
    public static Silabo_DocenteDAO silabo_docenteDAO;
    public static HorarioDAO horarioDAO;
    public static Competencia_ResultadosDAO competencia_resultadosDAO;
    public static Estrategia_EnseniansaDAO estrategia_enseniansaDAO;
    public static Silabo_EstrategiaDAO silabo_estrategiaDAO;
    public static BibliographyDAO bibliographyDAO;
    public static Silabo_BibliografiaDAO silabo_bibliografiaDAO;
    public static void main(String[] args)
    {
        String jdbcURL = "jdbc:mysql://localhost:3306/academicSystemDB";
        String jdbcUsername = "root";
        String jdbcPassword = "root";
        
        try
        {
        	silaboDAO = new SilabusDAO(jdbcURL, jdbcUsername, jdbcPassword);
            studentDAO = new StudentDAO(jdbcURL, jdbcUsername, jdbcPassword);
            subjectDAO = new SubjectDAO(jdbcURL, jdbcUsername, jdbcPassword);
            cronogramaDAO = new CronogramaDAO(jdbcURL, jdbcUsername, jdbcPassword);
            competenciasDAO = new CompetenciasDAO(jdbcURL, jdbcUsername, jdbcPassword);
            resultadosDAO = new ResultadosDAO(jdbcURL, jdbcUsername, jdbcPassword);
            teacherDAO  = new TeacherDAO(jdbcURL, jdbcUsername, jdbcPassword);
            departamento_academicoDAO = new Departamento_AcademicoDAO(jdbcURL, jdbcUsername, jdbcPassword);
            silabo_docenteDAO = new Silabo_DocenteDAO(jdbcURL, jdbcUsername, jdbcPassword);
            horarioDAO = new HorarioDAO(jdbcURL, jdbcUsername, jdbcPassword);
            competencia_resultadosDAO = new Competencia_ResultadosDAO(jdbcURL, jdbcUsername, jdbcPassword);
            estrategia_enseniansaDAO = new Estrategia_EnseniansaDAO(jdbcURL, jdbcUsername, jdbcPassword);
            silabo_estrategiaDAO = new Silabo_EstrategiaDAO(jdbcURL, jdbcUsername, jdbcPassword);
            bibliographyDAO =  new BibliographyDAO(jdbcURL, jdbcUsername, jdbcPassword);
            silabo_bibliografiaDAO = new Silabo_BibliografiaDAO(jdbcURL, jdbcUsername, jdbcPassword);
        }
        catch(SQLException e)
        {
            System.out.println("Failed to initialize the DAOs!");
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("CONNECTION SUCCESS! Done At: " + jdbcURL);
        System.out.println("--------------------------------------------------------------------------");
        context = SpringApplication.run(Application.class, args);
    }
    
    @PreDestroy
    public void onShutDown()
    {
        context.close();
        System.out.println("Closing safety . . .");
    }
}
