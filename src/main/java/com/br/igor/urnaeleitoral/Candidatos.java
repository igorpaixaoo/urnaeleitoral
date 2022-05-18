package com.br.igor.urnaeleitoral;

/**
 *
 * @author Igor
 */

public enum Candidatos {
    
    BOLSONARO{
        @Override
        public Integer getNumeroEleitoral(){
            return 22;
        }
    }, LULA{
        @Override
        public Integer getNumeroEleitoral(){
            return 13;
        }
    }, CIRO{
        @Override
        public Integer getNumeroEleitoral(){
            return 12;
        }
    }, MORO{
        @Override
        public Integer getNumeroEleitoral(){
            return 19;
        }
    };
    
    public Integer getNumeroEleitoral(){
        return 0;
    }
}
