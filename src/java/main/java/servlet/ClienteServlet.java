/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.controller.ClienteController;
import main.java.model.Cliente;

/**
 *
 * @author Camilo
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
    
    public ClienteServlet(){
        
    }
    
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,IOException
    {
        request.getRequestDispatcher( "/view/index_cliente.html" )
                .forward(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,IOException
    {
      
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String celular = request.getParameter("celular");
        String dataNascimento = request.getParameter("datanascimento");
        String endereco = request.getParameter("endereco");
        String complemento = request.getParameter("complemento");
        int numero = Integer.parseInt(request.getParameter("numero"));
        String cep = request.getParameter("cep");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String email = request.getParameter("email");
        int is_mail = Integer.parseInt(request.getParameter("confirmaEmail"));
        
        
        Cliente cliente = new Cliente();
        cliente.setBairro(bairro);
        cliente.setCelular(celular);
        cliente.setCep(cep);
        cliente.setCidade(cidade);
        cliente.setComplemento(complemento);
        cliente.setCpf(cpf);
        cliente.setDataNascimento(dataNascimento);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cliente.setEstado(estado);
        cliente.setNome(nome);
        cliente.setNumero(numero);
        cliente.setRecebeEmail(is_mail);
        cliente.setTelefone(telefone);
        
        ClienteController clienteController = new ClienteController();
        clienteController.inserirCliente(cliente);
        
    }
    
}
