package com.desafio.globaltracker.service;

import com.desafio.globaltracker.client.CotacaoClient;
import com.desafio.globaltracker.client.ViaCepClient;
import com.desafio.globaltracker.model.Despesa;
import com.desafio.globaltracker.model.EnderecoDTO;
import com.desafio.globaltracker.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository repository;

    @Autowired
    private ViaCepClient viaCepClient;

    @Autowired
    private CotacaoClient cotacaoClient;

    public Despesa salvar(Despesa despesa) {
        if (despesa.getCep() != null && !despesa.getCep().isEmpty()) {
            EnderecoDTO endereco = viaCepClient.buscarEndereco(despesa.getCep());
            despesa.setLogradouro(endereco.getLogradouro() + " - " + endereco.getLocalidade());
        }

        if (despesa.getMoeda() != null && !despesa.getMoeda().equalsIgnoreCase("BRL")) {
            String par = despesa.getMoeda().toUpperCase() + "-BRL";
            var cotacaoMap = cotacaoClient.buscarCotacao(par);
            
            Double valorMoeda = cotacaoMap.get(despesa.getMoeda().toUpperCase() + "BRL").getBid();
            despesa.setValorBRL(despesa.getValorOriginal() * valorMoeda);
        } else {
            despesa.setValorBRL(despesa.getValorOriginal());
        }

        despesa.setData(LocalDate.now());

        return repository.save(despesa);
    }

    public List<Despesa> listarTodas() {
        return repository.findAll();
    }
}