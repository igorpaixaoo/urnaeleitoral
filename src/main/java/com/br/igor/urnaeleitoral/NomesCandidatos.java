/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.igor.urnaeleitoral;

/**
 *
 * @author Ivo
 */
public enum NomesCandidatos {
    BOLSONARO{
        @Override
        public String getNomeCandidato(){
            return "Jair Bolsonaro, PL 22";
        }
    }, LULA{
        @Override
        public String getNomeCandidato(){
            return "Lula, PT 13";
        }
    }, CIRO{
        @Override
        public String getNomeCandidato(){
            return "Ciro Gomes, PDT 12";
        }
    }, MORO{
        @Override
        public String getNomeCandidato(){
            return "Sérgio Moro, PODE 19";
        }
    };
    
    public String getNomeCandidato(){
        return null;
    }
}
