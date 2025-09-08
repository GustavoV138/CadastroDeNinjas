package dev.java10x.CadastroDeNinjas.Ninjas.Model;

import dev.java10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // Um ninja tem uma unica missao. Lê-se Muitos ninjas para uma missão
    @ManyToOne
    // Juntando as tabelas numa nova coluna missoes_id
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

    public NinjaModel() {

    }

    public NinjaModel (String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public NinjaModel (String nome, String email, int idade, MissoesModel missoes) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
    }

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

    public MissoesModel getMissoes() {
        return missoes;
    }
    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }
}
