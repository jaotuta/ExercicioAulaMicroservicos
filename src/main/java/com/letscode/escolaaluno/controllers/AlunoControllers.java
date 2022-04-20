package com.letscode.escolaaluno.controllers;

import com.letscode.escolaaluno.dtos.AlunoRequest;
import com.letscode.escolaaluno.models.Aluno;
import com.letscode.escolaaluno.services.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/aluno")
public class AlunoControllers {

    @Autowired
    AlunoServices alunoServices;

    @PostMapping
    public ResponseEntity<Aluno> novoAluno (@RequestBody AlunoRequest alunoRequest) {

        return ResponseEntity.status(HttpStatus.CREATED).body(alunoServices.criarAluno(alunoRequest));

    }

    @GetMapping
    public List<Aluno> on() {
        return alunoServices.buscarTodos();
    }

}
