
package com.ufba.eng.soft.bibliotecapessoal.model.user;

import com.ufba.eng.soft.bibliotecapessoal.model.product.Livro;
import java.util.ArrayList;


public class Professor extends UsuarioDoSistema {
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    

    public Professor(String idUsuario, String nomeDeUusario, String userName, String senha) {
        super(idUsuario, nomeDeUusario, userName, senha);
    }

    public Professor() {
        super();
    }
    
    @Override
    public boolean consultarLivroEmprestado(Livro livro) {
        if(livrosEmprestados.contains(livro)){
            System.out.println("sim");
            return true;
        }
        System.out.println("nao");
        return false;
    }

    @Override
    public void consultarLivroPeloNome() {
        
    }

    @Override
    public void consultarLivroPeloCodBarra() {
        
    }
    
    public void realizarEmprestimo() {
        
    }
    
    @Override
    public void realizarDevolucao(Livro livro) {
        livrosEmprestados.remove(livro);
    }
    
    public void realizarReserva() {
        
    }

    @Override
    public void addLivroListaEmprestimos(Livro livro) {
        if(this.livrosEmprestados == null){
            this.livrosEmprestados = new ArrayList<>();
        }
        livrosEmprestados.add(livro);
        
    }

    
    
}
