package ProjetoAdocao.Animais.Control;

import ProjetoAdocao.Animais.Model.Animais;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AnimalControl {
    @GetMapping("/animais")
    public ArrayList<Animais> Animais(){

        Animais animal1 = new Animais();
        animal1.setAnimal("Coelho");
        animal1.setIdade(4);
        animal1.setNome("Carlinho");

        Animais animal2 = new Animais();
        animal2.setAnimal("Cobra");
        animal2.setIdade(1);
        animal2.setNome("Jeniffer");

        Animais animal3 = new Animais();
        animal3.setAnimal("Borboleta");
        animal3.setIdade(2);
        animal3.setNome("Carla");

        ArrayList<Animais> animais = new ArrayList<>();
        animais.add(animal1);
        animais.add(animal2);
        animais.add(animal3);
        return animais;
    }
}
