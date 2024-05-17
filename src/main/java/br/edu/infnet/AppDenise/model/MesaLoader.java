package br.edu.infnet.AppDenise.model;

import br.edu.infnet.AppDenise.model.domain.Armario;
import br.edu.infnet.AppDenise.model.domain.Mesa;
import br.edu.infnet.AppDenise.model.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class MesaLoader implements ApplicationRunner {
    @Autowired
    private MesaService mesaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("arquivos/mesas.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        System.err.println("#mesas");
        while(linha != null) {

            campos = linha.split(";");

            Mesa mesa = new Mesa();
            mesa.setDescricao(campos[0]);
            mesa.setPreco(Float.valueOf(campos[1]));
            mesa.setCodigo(Integer.valueOf(campos[2]));
            mesa.setTipoMadeira(campos[3]);
            mesa.setDisponivel(Boolean.valueOf(campos[4]));
            mesa.setVidro(Boolean.valueOf(campos[5]));
            mesa.setFormato(campos[6]);

            mesaService.incluir(mesa);

            linha = leitura.readLine();
        }

        System.out.println("Iniciando o processamento!");
        for(Mesa mesa : mesaService.obterLista()) {
            System.out.println(mesa);
        }
        System.out.println("Processamento realizado com sucesso!");

        leitura.close();
    }
}
