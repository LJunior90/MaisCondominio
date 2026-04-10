package service;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrar (Usuario usuario){

        usuarios.add(usuario);
    }

    public Usuario login(String nome, String email){
        for(Usuario u: usuarios){

            if(u.getEmail().equals(email) && u.getNome().equals(nome)){
                return u;
                               


            }
        }
        return null;

    }



}
