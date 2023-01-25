package br.com.informacoesvoos.infovoos.controller;

import br.com.informacoesvoos.infovoos.domain.Voos;
import br.com.informacoesvoos.infovoos.service.VoosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/voos")
public class VoosController {
    @Autowired
    private VoosService service;
    @GetMapping
    public List<Voos> listaTodos(){
        return service.listaTodos();
    }
}
