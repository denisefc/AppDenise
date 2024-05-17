package br.edu.infnet.AppDenise.model;

import br.edu.infnet.AppDenise.model.domain.Pedido;
import br.edu.infnet.AppDenise.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class PedidoLoader implements ApplicationRunner {
    @Autowired
    private PedidoService pedidoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("arquivos/pedidos.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        System.err.println("#pedido");
        while(linha != null) {

            campos = linha.split(";");

            Pedido pedido = new Pedido();
            pedido.setNumeroPedido(Integer.valueOf(campos[0]));
            pedido.setTotalReais(Float.valueOf(campos[1]));

            pedidoService.incluir(pedido);

            linha = leitura.readLine();
        }

        System.out.println("Iniciando o processamento!");
        for(Pedido pedido : pedidoService.obterLista()) {
            System.out.println(pedido);
        }
        System.out.println("Processamento realizado com sucesso!");

        leitura.close();
    }
    
}
