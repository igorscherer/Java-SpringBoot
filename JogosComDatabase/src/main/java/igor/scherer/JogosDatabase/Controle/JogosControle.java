package igor.scherer.JogosDatabase.Controle;

import igor.scherer.JogosDatabase.Modelo.JogosEntity;
import igor.scherer.JogosDatabase.Repositorio.JogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jogo")
public class JogosControle {

    @Autowired
    private JogosRepository jogosRepositorio;

    @GetMapping
    public ResponseEntity<List<JogosEntity>> findAll (){
        return new ResponseEntity<List<JogosEntity>>(
                (List<JogosEntity>) this.jogosRepositorio.findAll(),
                new HttpHeaders(), HttpStatus.OK); //error 404
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<JogosEntity> findById(@PathVariable ("id") long id)   {
        if(this.jogosRepositorio.findById(id).isPresent()){
            return new ResponseEntity<JogosEntity>(
                    this.jogosRepositorio.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<JogosEntity>(HttpStatus.NOT_FOUND);
    }
    public ResponseEntity<JogosEntity>  cadastrar (@RequestBody JogosEntity jogosEntity){
        return new ResponseEntity<JogosEntity>(
                this.jogosRepositorio.save(jogosEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<JogosEntity> atualizar (@PathVariable("id") long id,
                                                  @RequestBody JogosEntity jogosEntity) throws Exception{
        if(id == 0 || !this.jogosRepositorio.existsById(id)){
            throw new Exception("Codigo nao encontrado ou inexistente");
        }
        return new ResponseEntity<JogosEntity>(
                this.jogosRepositorio.save(jogosEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @DeleteMapping(value= "/{id}")
    public ResponseEntity<JogosEntity> deletar (@PathVariable("id") long id ){
        this.jogosRepositorio.deleteById(id);
        return new ResponseEntity<JogosEntity>(new HttpHeaders(), HttpStatus.OK);
    }
}