package com.example;

import com.example.dao.Studentdao;
import com.example.dao.studentdaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class jdbcConfig {
    @Bean("ds")
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("rana@123");
        return ds;
    }
     @Bean("jdbctemplate")
    public JdbcTemplate gettemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

     @Bean("studentdao")
    public Studentdao getStudentdao(){
     studentdaoImpl studentdao = new studentdaoImpl();
     studentdao.setJdbcTemplate(gettemplate());
     return studentdao;
    }

}
