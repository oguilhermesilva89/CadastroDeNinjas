package dev.java10x.CadastroDeNinjas.Ninjas;

// JPA - Java Persistence API
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele transforma um classe em uma entidade do Banco de Dados
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne // @ManyToOne - Uma unica missão para muitos ninjas (N:1)
    @JoinColumn(name = "missoes_id") // Foreing Key - Chave estrangeira
    private MissoesModel missoes;

}
