package padroescomportamentais.chainofresponsability;

public class Interacao {

    private TipoInteracao tipoInteracao;

    public Interacao(TipoInteracao tipoInteracao){
        this.tipoInteracao = tipoInteracao;
    }

    public TipoInteracao getTipoInterface(){
        return tipoInteracao;
    }

    public void setTipoInterface(TipoInteracao tipoInteracao){
        this.tipoInteracao = tipoInteracao;
    }

}
