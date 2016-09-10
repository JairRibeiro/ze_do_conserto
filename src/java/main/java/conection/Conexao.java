/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Conexao {
    
    private final String driver;
    private final String banco;
    private final String url;
    private final String usuario;
    private final String senha;

    private Conexao instacia;

    /*
     CONSTRUTOR PADRÃO DA CLASSE ConnectionBD
     */
    //localhost: 127.0.0.1
    public Conexao() {
        this.driver = "com.mysql.jdbc.Driver";
        this.banco = "zeconserto"; 
        //this.banco = "doctor_alliance"; 
        //URL para servidor Web UOLHOST
        //this.url = "jdbc:mysql://doctoralliance.mysql.uhserver.com:3306/" + banco;
        //URL para servidor LOCALHOST
        this.url = "jdbc:mysql://localhost:3306/" + banco;
        //this.usuario = "k8fvwc3";
        this.usuario = "root";
        //this.senha = "@5RWx96bC862t";
        this.senha = "vital";
        

    }

    /*
     METODO QUE INSTACIA UMA NOVA CONEXÃO COM O BANCO DE DADOS
     QUANDO ELE NÃO ESTA CONECTADO. 
    
     Retorna a instacia com o banco
     @return instacia;
        
     */
    public Conexao getInstacia() {
        if (instacia == null) {
            instacia = new Conexao(); //Verifiar com Vital como esse método Funciona?????
            return instacia;
        } else {
            return instacia;
        }

    }

    public Connection conectar() {
        Connection c = null;
        try {
            System.err.println("Entrou aqui");
            Class.forName(this.driver);
            c = DriverManager.getConnection(url, usuario, senha);
            //System.out.println("Conectado");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;

    }

    /*
     METODO SIMPLES PARA DESCONECTAR O BANCO DE DADOS
     */
    public void desconectar(Connection c) {
        try {
            c.close();
            System.err.println("desconectado");
            // System.err.println("desconectado"); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Exception: " + e.getMessage());
        }
    }

    public void getInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
