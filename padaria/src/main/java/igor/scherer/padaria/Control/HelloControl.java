package igor.scherer.padaria.Control;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @GetMapping("/")
    public String mensagem(){
        return "Seja Bem-Vindo!";
    }
}

