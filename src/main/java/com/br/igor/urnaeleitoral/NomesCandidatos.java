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
