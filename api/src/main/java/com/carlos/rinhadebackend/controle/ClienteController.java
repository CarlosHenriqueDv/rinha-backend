package com.carlos.rinhadebackend.controle;

import com.carlos.rinhadebackend.dto.ClienteDto;
import com.carlos.rinhadebackend.dto.ExtratoDto;
import com.carlos.rinhadebackend.dto.TransacaoDto;
import com.carlos.rinhadebackend.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteController {


    private final ClienteService service;

    public ClienteController(ClienteService clienteService){
        this.service = clienteService;
    }


    @PostMapping("/{id}/transacoes")
    public ClienteDto salvaTransacao(@PathVariable("id") Integer id, @Valid @RequestBody TransacaoDto dto ){
        return service.criaTransacao(id, dto);

    }

    @GetMapping("/{id}/extrato")
    public ExtratoDto findExtradoCliente(@PathVariable("id") Integer id){
        return service.findExtratoByClienteId(id);
    }


}
