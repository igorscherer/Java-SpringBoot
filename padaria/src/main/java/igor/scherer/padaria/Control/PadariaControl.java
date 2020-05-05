package igor.scherer.padaria.Control;

import igor.scherer.padaria.Model.Padaria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PadariaControl {
    @GetMapping("/produto")
    public ArrayList<Padaria> setProduto(){
        Padaria produto1 = new Padaria();
        produto1.setProduto("Pao kg.");
        produto1.setPreco(3.50);

        Padaria produto2 = new Padaria();
        produto2.setProduto("Presunto kg.");
        produto2.setPreco(22.30);

        Padaria produto3 = new Padaria();
        produto3.setProduto("Cafe 1 xicara");
        produto3.setPreco(2.50);

        ArrayList<Padaria> produto = new ArrayList<>();
        produto.add(produto1);
        produto.add(produto2);
        produto.add(produto3);
        return produto;
    }
}
