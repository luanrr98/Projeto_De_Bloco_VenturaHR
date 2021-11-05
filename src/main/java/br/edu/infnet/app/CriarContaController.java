package br.edu.infnet.app;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cadastrar")
public class CriarContaController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tipo = request.getParameter("cadastro");
        if ("Candidato".equals(tipo)) {

            //Obter os dados do formulário
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String endereco = request.getParameter("endereco");
            String telefone = request.getParameter("telefone");
            String cpf = request.getParameter("cpf");
            String senha = request.getParameter("senha");
            String senhaConf = request.getParameter("senhaConf");

            //Validar os dados do formulário

            List<String> erros = new ArrayList<>();

            if(StringUtils.isBlank(nome)) erros.add("Campo Nome não foi preenchido!");
            if(StringUtils.isBlank(email)) erros.add("Campo Email não foi preenchido!");
            if(StringUtils.isBlank(endereco)) erros.add("Campo Endereco não foi preenchido!");
            if(StringUtils.isBlank(telefone)) erros.add("Campo Telefone não foi preenchido!");
            if(StringUtils.isNotBlank(telefone) && !StringUtils.isNumeric(telefone)) erros.add("Campo Telefone não recebeu apenas valores numéricos!");
            if(telefone.length() > 11) erros.add("Campo Telefone excedeu a quantidade de dígitos!");
            if(telefone.length() < 10) erros.add("Campo Telefone faltou dígitos!");
            if(StringUtils.isBlank(cpf)) erros.add("Campo CPF não foi preenchido!");
            if(cpf.length() > 11) erros.add("Campo CPF excedeu a quantidade de dígitos!");
            if(cpf.length() < 11) erros.add("Campo CPF faltou dígitos!");
            if(StringUtils.isNotBlank(cpf) && !StringUtils.isNumeric(cpf)) erros.add("Campo CPF não recebeu apenas valores numéricos!");
            if(StringUtils.isBlank(senha)) erros.add("Campo Senha não foi preenchido!");
            if(StringUtils.isBlank(senhaConf)) erros.add("Campo Confirmar Senha não foi preenchido!");
            if(!senha.equals(senhaConf)) erros.add("As senhas não conferem!");

            if(erros.isEmpty()) {
                request.setAttribute("nome", nome);
                request.setAttribute("email", email);
                request.setAttribute("tipo", tipo);
                request.getRequestDispatcher("/sucesso.jsp").forward(request, response);
            }else {
                request.setAttribute("erros", erros);
                request.getRequestDispatcher("/erro.jsp").forward(request, response);

            }

            //Gerar resposta
        }else {
            //Obter os dados do formulário

            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String endereco = request.getParameter("endereco");
            String telefone = request.getParameter("telefone");
            String razao = request.getParameter("razao");
            String cnpj = request.getParameter("cnpj");
            String senha = request.getParameter("senha");
            String senhaConf = request.getParameter("senhaConf");


            //Validar os dados do formulário

            List<String> erros = new ArrayList<String>();

            if(StringUtils.isBlank(nome)) erros.add("Campo Nome não foi preenchido!");
            if(StringUtils.isBlank(email)) erros.add("Campo Email não foi preenchido!");
            if(StringUtils.isBlank(endereco)) erros.add("Campo Endereco não foi preenchido!");
            if(StringUtils.isBlank(telefone)) erros.add("Campo Telefone não foi preenchido!");
            if(StringUtils.isNotBlank(telefone) && !StringUtils.isNumeric(telefone)) erros.add("Campo Telefone não recebeu apenas valores numéricos!");
            if(telefone.length() > 11) erros.add("Campo Telefone excedeu a quantidade de dígitos!");
            if(telefone.length() < 10) erros.add("Campo Telefone faltou dígitos!");
            if(StringUtils.isBlank(razao)) erros.add("Campo Razão Social não foi preenchido!");
            if(StringUtils.isBlank(cnpj)) erros.add("Campo CNPJ não foi preenchido!");
            if(StringUtils.isNotBlank(cnpj) && !StringUtils.isNumeric(cnpj)) erros.add("Campo CNPJ não recebeu apenas valores numéricos!");
            if(cnpj.length() > 14) erros.add("Campo CNPJ excedeu a quantidade de dígitos!");
            if(cnpj.length() < 14) erros.add("Campo CNPJ faltou dígitos!");
            if(StringUtils.isBlank(senha)) erros.add("Campo Senha não foi preenchido!");
            if(StringUtils.isBlank(senhaConf)) erros.add("Campo Confirmar Senha não foi preenchido!");
            if(!senha.equals(senhaConf)) erros.add("As senhas não conferem!");

            if(erros.isEmpty()) {
                request.setAttribute("nome", nome);
                request.setAttribute("email", email);
                request.setAttribute("tipo", tipo);
                request.getRequestDispatcher("/sucesso.jsp").forward(request, response);
            }else {
                request.setAttribute("erros", erros);
                request.getRequestDispatcher("/erro.jsp").forward(request, response);

            }

        }
    }
}
