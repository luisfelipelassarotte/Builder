package builder;

public class Cardapio {
    private String tipoPrato;
    private String nomePrato;
    private int precoPrato;
    private String ingredientesPrato;

    public Cardapio () {
        this.nomePrato = "";
        this.tipoPrato = "";
        this.ingredientesPrato = "";
        this.precoPrato = 0;
    }


    public String getTipoPrato() {
        return tipoPrato;
    }

    public void setTipoPrato(String tipoPrato) {
        this.tipoPrato = tipoPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public int getPrecoPrato() {
        return precoPrato;
    }

    public void setPrecoPrato(int precoPrato) {
        this.precoPrato = precoPrato;
    }

    public String getIngredientesPrato() {
        return ingredientesPrato;
    }

    public void setIngredientesPrato(String ingredientesPrato) {
        this.ingredientesPrato = ingredientesPrato;
    }


}
