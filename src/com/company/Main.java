package com.company;

import com.company.model.GuardaRoupa;
import com.company.model.Roupa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GuardaRoupa guardaRoupa = new GuardaRoupa(0, new HashMap<>());
        Integer codigo = 0;
        for (int i = 0; i < 2; i++) {
            String marca, roupa;
            List<Roupa> roupas = new ArrayList<>();

            Scanner marcaEntrada = new Scanner(System.in);
            System.out.println("Qual é a marca da sua roupa!");
            marca = marcaEntrada.next();

            Scanner roupaEntrada = new Scanner(System.in);
            System.out.println("Qual é o modelo da sua roupa!");
            roupa = marcaEntrada.next();

            roupas.add(new Roupa(marca, roupa));

            guardaRoupa.guardarRoupas(roupas);
        }

        guardaRoupa.mostrarRoupas();

        List<Roupa> devolucao = guardaRoupa.devolverRoupas(1);
        for (Roupa item : devolucao) {
            System.out.println("Retirada de itens do guarda-roupa:" + item.getMarca() + "---" + item.getModelo());
        }
    }
}
