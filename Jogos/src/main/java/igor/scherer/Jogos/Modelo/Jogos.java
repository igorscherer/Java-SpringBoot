package igor.scherer.Jogos.Modelo;

import lombok.*;

/**
 * @author igorscherer
 * @since 04/05/2020 13:26
 * @version 1.0.
 */

@ToString
@AllArgsConstructor // construtor com argumento
@NoArgsConstructor  //construtor sem argumento

public class Jogos {

    @Setter @Getter
    private String nome;

    @Setter @Getter
    private String estilo;

}
