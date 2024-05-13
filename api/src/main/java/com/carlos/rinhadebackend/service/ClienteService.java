package com.carlos.rinhadebackend.service;

import com.carlos.rinhadebackend.dto.ClienteDto;
import com.carlos.rinhadebackend.dto.ExtratoDto;
import com.carlos.rinhadebackend.dto.SaldoDto;
import com.carlos.rinhadebackend.dto.TransacaoDto;
import com.carlos.rinhadebackend.model.Cliente;
import com.carlos.rinhadebackend.model.NotFoundException;
import com.carlos.rinhadebackend.model.Tipo;
import com.carlos.rinhadebackend.model.Transacao;
import com.carlos.rinhadebackend.repository.ClienteRepository;
import com.carlos.rinhadebackend.repository.TransacaoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {


    private final TransacaoRepository transacaoRepository;

    private final ModelMapper modelMap;

    private final ClienteRepository clienteRepository;

    public ClienteService(TransacaoRepository transacaoRepository, ModelMapper modelMap, ClienteRepository clienteRepository) {
        this.transacaoRepository = transacaoRepository;
        this.modelMap = modelMap;
        this.clienteRepository = clienteRepository;
    }

    @Transactional
    public ClienteDto criaTransacao(Integer id, TransacaoDto dto) {

        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if (clienteOptional.isEmpty()){
            throw new NotFoundException();
        }
        Cliente cliente = clienteOptional.get();

        if (dto.getTipo().equals(Tipo.DEBITO)){
            cliente.saque(dto.getValor());
        }else{
            cliente.deposito(dto.getValor());
        }

        Transacao transacao = modelMap.map(dto, Transacao.class);
        clienteRepository.save(cliente);
        transacaoRepository.save(transacao);
        return new ClienteDto(cliente.getSaldo(), cliente.getLimite());
    }

    public ExtratoDto findExtratoByClienteId(Integer id) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow(NotFoundException::new);

        SaldoDto saldo = new SaldoDto();
        saldo.setTotal(cliente.getSaldo());
        saldo.setLimite(cliente.getLimite());
        saldo.setDataHoraExtrato(LocalDateTime.now());

        List<TransacaoDto> transacoes = transacaoRepository.findByCliente_Id(id)
                .stream()
                .map(element -> modelMap.map(element, TransacaoDto.class))
                .collect(Collectors.toList());


        return new ExtratoDto(saldo, transacoes);

    }
}
