package com.estudos.io.demo;

import java.io.Serializable;

public class Cliente implements Serializable {

    //boa pratica usar isso para verificar se eh o mesmo objeto que foi gravado anteriormente
    //isso porque podem ter sido criados varios objetos inclusive com mudancas e isso garante
    // a volta do objeto pois a versao da classe eh igual (adm versao da classe)
    private static final long serialVersionUID = 1L;

    //a palavra reservada transient diz que nao faz parte da serializacao

    String nome;
    String cpf;
    Integer idade;

}
