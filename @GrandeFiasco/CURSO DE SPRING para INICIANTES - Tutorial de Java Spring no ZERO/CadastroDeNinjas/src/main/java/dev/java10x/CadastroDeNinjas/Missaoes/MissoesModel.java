package dev.java10x.CadastroDeNinjas.Missaoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    //private NinjaModel ninja;

    //@ManyToOne - Uma missão pode ter varios ninjas
    @ManyToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
