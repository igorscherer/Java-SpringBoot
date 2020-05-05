package ProjetoAdocao.Animais.Model;

import lombok.*;

/**
 * @author igorscherer
 * @since 03/05/2020 17:26
 * @version 1.0.
 */

@ToString
@AllArgsConstructor // construtor com argumento
@NoArgsConstructor  //construtor sem argumento

public class Animais {

    @Setter @Getter
    private String animal;
    @Setter @Getter
    private int idade;
    @Setter @Getter
    private String nome;

}
