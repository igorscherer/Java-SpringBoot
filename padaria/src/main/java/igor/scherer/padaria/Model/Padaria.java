package igor.scherer.padaria.Model;

import lombok.*;

/**
 * @author igorscherer
 * @since 04/05/2020 14:30
 * @version 1.0.
 */

@ToString
@AllArgsConstructor // construtor com argumento
@NoArgsConstructor  //construtor sem argumento

public class Padaria {

    @Setter @Getter
    public String produto;

    @Setter @Getter
    public double preco;

}
