package br.senac.sp.epictask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.senac.sp.epictask.Model.Tarefa;
import br.senac.sp.epictask.data.TarefaRepository;

@Controller
public class TarefaController{

    @Autowired
    TarefaRepository repository;

    @GetMapping("/tarefa")
    public String tarefa() {
        return "Tarefa";
    }

    @GetMapping("/tarefas/cadastrar")
    public String formulario(){
        return "formulario_tarefa";
    }
    
    @PostMapping("/tarefa")
    public String cadastrar(Tarefa tarefa){
        repository.save(tarefa);
        return "redirect:/tarefas";
    }
}
