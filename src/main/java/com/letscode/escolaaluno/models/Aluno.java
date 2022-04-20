package com.letscode.escolaaluno.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "aluno")
@Data
@NoArgsConstructor
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "serie")
    private String serie;
    @Column(name = "chaveCasaSeletora")
    private String chaveCasaSeletora;


}
