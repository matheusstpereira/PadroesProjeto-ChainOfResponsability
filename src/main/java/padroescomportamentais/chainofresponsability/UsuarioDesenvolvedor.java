package padroescomportamentais.chainofresponsability;

public class UsuarioDesenvolvedor extends Usuario{

    public UsuarioDesenvolvedor(Usuario superior) {
        listaInterfaces.add(TipoInteracaoProgramacao.getTipoInterfaceProgramacao());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoInterface() {
        return "Desenvolvedor";
    }

}
