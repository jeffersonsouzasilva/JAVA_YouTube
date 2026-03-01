package com.javanauta.agendador_horarios.services;

import com.javanauta.agendador_horarios.infrastructure.entity.Agendamento;
import com.javanauta.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public Agendamento salvarAgendamento(Agendamento agendamento){
        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
    }
}
