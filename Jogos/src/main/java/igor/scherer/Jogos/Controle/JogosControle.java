package igor.scherer.Jogos.Controle;

import igor.scherer.Jogos.Modelo.Jogos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class JogosControle {

    @GetMapping("/jogos")
    public ArrayList<Jogos> setJogos() {
        Jogos jogo1 = new Jogos();
        jogo1.setNome("Counter-Strike");
        jogo1.setEstilo("Fps");

        Jogos jogo2 = new Jogos();
        jogo2.setNome("Grand Theft Auto");
        jogo2.setEstilo("Mundo Aberto");

        Jogos jogo3 = new Jogos();
        jogo3.setNome("Raft");
        jogo3.setEstilo("Sobrevivencia");

        ArrayList<Jogos> nome = new ArrayList<>();
        nome.add(jogo1);
        nome.add(jogo2);
        nome.add(jogo3);
        return nome;
    }
}