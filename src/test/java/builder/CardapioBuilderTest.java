package builder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardapioBuilderTest {

    @Test
    void deveRetornarExecaoParaCardapioSemNomePrato() {
        try {
            CardapioBuilder cardapioBuilder = new CardapioBuilder();
            Cardapio cardapio = cardapioBuilder
                    .setIngredientesPrato("Tomate")
                    .setPrecoPrato(15)
                    .setTipoPrato("Entrada")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome não pode ser vazio!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExecaoParaCardapioSemIngredientePrato() {
        try {
            CardapioBuilder cardapioBuilder = new CardapioBuilder();
            Cardapio cardapio = cardapioBuilder
                    .setNomePrato("Pão")
                    .setPrecoPrato(15)
                    .setTipoPrato("Entrada")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Prato deve conter um ingrediente!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExecaoParaCardapioSemTipoPrato() {
        try {
            CardapioBuilder cardapioBuilder = new CardapioBuilder();
            Cardapio cardapio = cardapioBuilder
                    .setNomePrato("Pão")
                    .setPrecoPrato(15)
                    .setIngredientesPrato("Amido")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Prato deve pertencer a um grupo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExecaoParaCardapioSemPrecoPrato() {
        try {
            CardapioBuilder cardapioBuilder = new CardapioBuilder();
            Cardapio cardapio = cardapioBuilder
                    .setNomePrato("Pão")
                    .setIngredientesPrato("Amido")
                    .setTipoPrato("Entrada")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Prato não pode ser de graça!", e.getMessage());
        }
    }

    @Test
    void deveRetornarCardapioValido() {
        CardapioBuilder cardapioBuilder = new CardapioBuilder();
        Cardapio cardapio = cardapioBuilder
                .setNomePrato("Pão")
                .setPrecoPrato(15)
                .setIngredientesPrato("Amido")
                .setTipoPrato("Entrada")
                .build();
        assertNotNull(cardapio);
    }


}