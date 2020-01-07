package com.algaworks.gestaoconvidados;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controlador {

    @Autowired
    private Convidados convidados;

    @RequestMapping("/convidados")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("ListarConvidados.html");
        mv.addObject("convidados", convidados.todos());
        mv.addObject(new Convidado());
        return mv;
    }

   @RequestMapping("/convidados/adicionar")
    public String salvar(Convidado convidado) {
        this.convidados.adicionar(convidado);
        return "redirect:/convidados";
    }

}