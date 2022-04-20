package com.letscode.escolaaluno.services;

import com.letscode.escolaaluno.dtos.AlunoRequest;
import com.letscode.escolaaluno.dtos.ChaveCasaSeletora;
import com.letscode.escolaaluno.models.Aluno;
import com.letscode.escolaaluno.repository.AlunoRepository;
import org.h2.util.json.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AlunoServices {

    @Autowired
    AlunoRepository alunoRepository;

    public Aluno criarAluno(AlunoRequest alunoRequest) {
        Aluno aluno = new Aluno();
        BeanUtils.copyProperties(alunoRequest, aluno);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<ChaveCasaSeletora> chaveCasaSeletora =  restTemplate.exchange("https://api-harrypotter.herokuapp.com/sortinghat", HttpMethod.GET, entity, ChaveCasaSeletora.class);
        aluno.setChaveCasaSeletora(chaveCasaSeletora.getBody().getChaveCasaSeletora());
        alunoRepository.save(aluno);
        return aluno;
    }

    public List<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

}
