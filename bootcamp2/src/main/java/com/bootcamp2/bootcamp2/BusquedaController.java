package com.bootcamp2.bootcamp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class BusquedaController {
    //programa para autocompletar palabras como el de google
    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda){

        String[] frasesTipicasDeBusqueda = {"bootcamp de java", "bootcamp de python", "curso de nodejs", "curso de C", "bootcamp avanzado de java"};
        String[] resultadoDeLaBusqueda = new String[10];
        int contador = 0;

        for(String frase : frasesTipicasDeBusqueda){
            if(frase.contains(busqueda)){
                resultadoDeLaBusqueda[contador] = frase;
                contador++;

            }
        }
        return resultadoDeLaBusqueda;
        //return resultadoDeLaBusqueda;
    }
}
