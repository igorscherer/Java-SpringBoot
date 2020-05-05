package igor.scherer.JogosDatabase.Modelo;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

// JPA - Java Persistence API
@Entity
@Table(name= "Jogo")
public class JogosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jogo")
    private long id;

    @Column(name = "Nome")
    private String Nome;

    @Column(name = "Estilo")
    private String Estilo;

    @Column(name = "idade_recomendada")
    private int idade_recomandada;

    @Column(name = "perspectiva")
    private String perspectiva;

    @Column(name = "resumo")
    private String resumo;


}
