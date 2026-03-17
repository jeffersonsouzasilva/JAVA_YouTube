package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missaoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele transforma uma classe em uma entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //private List<MissoesModel> missoes;

    // @ManyToOne - Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;

    /*
    // No args
    public NinjaModel() {
    }

    // Quase allArgs
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


//    public NinjaModel(Long id, String nome, String email, int idade, MissoesModel missoes) {
//        this.id = id;
//        this.nome = nome;
//        this.email = email;
//        this.idade = idade;
//        this.missoes = missoes;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


//    @Override
//    public String toString() {
//        return "NinjaModel{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", email='" + email + '\'' +
//                ", idade=" + idade +
//                ", missoes=" + missoes +
//                '}';
//    }
    */


}

/*
- Criar os atributos
- Gerar um Constructor vazio
- Gerar Constructor com todos os atributos
- Gerar Getter e Setter para todos os atributos
 */