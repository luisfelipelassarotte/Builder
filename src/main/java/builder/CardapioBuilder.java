package builder;

import java.util.Objects;

public class CardapioBuilder {
    private final Cardapio cardapio;

    public CardapioBuilder() {
        this.cardapio = new Cardapio();
    }

    public Cardapio build() {
        if (Objects.equals(this.cardapio.getNomePrato(), "")) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        if (Objects.equals(this.cardapio.getIngredientesPrato(), "")) {
            throw new IllegalArgumentException("Prato deve conter um ingrediente!");
        }
        if (Objects.equals(this.cardapio.getTipoPrato(), "")) {
            throw new IllegalArgumentException("Prato deve pertencer a um grupo!");
        }
        if (Objects.equals(this.cardapio.getPrecoPrato(), 0)) {
            throw new IllegalArgumentException("Prato não pode ser de graça!");
        }

        return this.cardapio;
    }

    public CardapioBuilder setNomePrato(String nomePrato) {
        this.cardapio.setNomePrato(nomePrato);
        return this;
    }
    public CardapioBuilder setTipoPrato(String tipoPrato) {
        this.cardapio.setTipoPrato(tipoPrato);
        return this;
    }
    public CardapioBuilder setIngredientesPrato(String ingredientesPrato) {
        this.cardapio.setIngredientesPrato(ingredientesPrato);
        return this;
    }
    public CardapioBuilder setPrecoPrato(int precoPrato) {
        this.cardapio.setPrecoPrato(precoPrato);
        return this;
    }

}
