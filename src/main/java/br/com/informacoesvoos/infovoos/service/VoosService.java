package br.com.informacoesvoos.infovoos.service;

import br.com.informacoesvoos.infovoos.domain.Voos;
import br.com.informacoesvoos.infovoos.repository.VoosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoosService {

    @Autowired
    private VoosRepository repository;

    public List<Voos> listaTodos(){
        return (List<Voos>) repository.findAll();
    }

}
