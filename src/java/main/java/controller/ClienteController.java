/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.controller;

import main.java.conection.Conexao;
import main.java.model.Cliente;

/**
 *
 * @author Camilo
 */
public class ClienteController {
    
    ClienteInterfaceDao newCliente = new ClienteDao();
    
    public void inserirCliente(Cliente cliente){
        newCliente.cadastrar(cliente);       
        
    }
    
}
