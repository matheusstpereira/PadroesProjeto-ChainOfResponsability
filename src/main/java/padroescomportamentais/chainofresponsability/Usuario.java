package padroescomportamentais.chainofresponsability;
import java.util.ArrayList;

public abstract class Usuario {

    protected ArrayList listaInterfaces = new ArrayList();
    private Usuario usuarioSuperior;

    public Usuario getUsuarioSuperior(){
        return usuarioSuperior;
    }

    public void setUsuarioSuperior(Usuario usuarioSuperior){
        this.usuarioSuperior = usuarioSuperior;
    }

    public abstract String getDescricaoInterface();

    public String cadastrarInteracao(Interacao interacao){
        if(listaInterfaces.contains(interacao.getTipoInterface())){
            return getDescricaoInterface();
        }
        else{
            if(usuarioSuperior != null){
                return usuarioSuperior.cadastrarInteracao(interacao);
            }
            else
            {
                return "Sem Cadastro";
            }
        }
    }



}
