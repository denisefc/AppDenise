package br.edu.infnet.AppDenise.controller;

import br.edu.infnet.AppDenise.model.service.ArmarioService;
import br.edu.infnet.AppDenise.model.service.MesaService;
import br.edu.infnet.AppDenise.model.service.MovelMadeiraService;
import br.edu.infnet.AppDenise.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private MovelMadeiraService movelMadeiraService;
    @Autowired
    private ArmarioService armarioService;
    @Autowired
    private MesaService mesaService;

    @GetMapping(value = "/")
    public String telaHome(Model model){

        model.addAttribute("qtdePedido", pedidoService.obterQtde());
        model.addAttribute("qtdeMovelMadeira", movelMadeiraService.obterQtde());
        model.addAttribute("qtdeArmario", armarioService.obterQtde());
        model.addAttribute("qtdeMesa", mesaService.obterQtde());

        return "home";
    }

    @GetMapping(value = "/pedido/listagem")
    public String listaPedidos(Model model){

        model.addAttribute("titulo", "Listagem de Pedidos");
        model.addAttribute("listagem", pedidoService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/movelMadeira/listagem")
    public String listaMoveisMadeira(Model model){

        model.addAttribute("titulo", "Listagem de Móveis de Madeira");
        model.addAttribute("listagem", movelMadeiraService.obterLista());

        return telaHome(model);
    }
    @GetMapping(value = "/armario/listagem")
    public String listaArmarios(Model model){

        model.addAttribute("titulo", "Listagem de Armários");
        model.addAttribute("listagem", armarioService.obterLista());

        return telaHome(model);
    }
    @GetMapping(value = "/mesa/listagem")
    public String listaMesas(Model model){

        model.addAttribute("titulo", "Listagem de Mesas");
        model.addAttribute("listagem", mesaService.obterLista());

        return telaHome(model);
    }
}
