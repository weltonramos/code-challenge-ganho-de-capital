package br.com.desafio.nubank.ganhodecapital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acoes")
public class AcoesController {

    @GetMapping
    public String teste() {
        return "Hello teste Nubank";
    }
}
