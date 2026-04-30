package com.desafio.globaltracker.client;

import com.desafio.globaltracker.model.CotacaoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Map;

@FeignClient(name = "cotacao", url = "https://economia.awesomeapi.com.br/json")
public interface CotacaoClient {

    @GetMapping("/last/{par}")
    Map<String, CotacaoDTO> buscarCotacao(@PathVariable("par") String par);
}