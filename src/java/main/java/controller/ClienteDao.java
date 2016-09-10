/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import main.java.conection.Conexao;
import main.java.model.Cliente;

/**
 *
 * @author Camilo
 */
public class ClienteDao implements ClienteInterfaceDao{

    Conexao conexao = new Conexao();
    
    public ClienteDao(){
        conexao.getInstacia();     
    }
    
    @Override
    public void cadastrar(Cliente cliente) {
       
        Connection conectar = conexao.conectar();
        
        String SQL = "INSERT INTO cliente (nome,cpf,telefone,celular,datanascimento,"
                                           +"endereco,complemento,numero,cep,bairro,cidade,estado,"
                                           +"email,is_email) VALUES"
                                           + " (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         try{
            
            PreparedStatement pstm = conectar.prepareStatement(SQL);
            // DADOS PESSOAIS
            pstm.setString(1,cliente.getNome());
            pstm.setString(2,cliente.getCpf());
            pstm.setString(3,cliente.getTelefone());
            pstm.setString(4,cliente.getCelular());
            pstm.setString(5,cliente.getDataNascimento());
            // ENDEREÇO RESIDENCIAL
            pstm.setString(6,cliente.getEndereco());
            pstm.setString(7,cliente.getComplemento());
            pstm.setInt(8,cliente.getNumero());
            pstm.setString(9,cliente.getCep());
            pstm.setString(10,cliente.getBairro());
            pstm.setString(11,cliente.getCidade());
            pstm.setString(12,cliente.getEstado());
            // OUTROS CONTATOS
            pstm.setString(13,cliente.getEmail());
            pstm.setInt(14,cliente.getRecebeEmail());
            
            pstm.execute();
            pstm.close();
       
        }catch(SQLException e){
            System.out.append(e.getMessage());
          throw new RuntimeException(e);  
        }finally{
             
             conexao.desconectar(conectar);
         }
    }
    
}
