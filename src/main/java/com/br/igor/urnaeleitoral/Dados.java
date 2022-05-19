package com.br.igor.urnaeleitoral;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author Igor
 */
public class Dados {
    private Urna urna;
    
    public void dados() throws IOException{
        //Soma todos os votos dos respectivos candidatos
        int soma = Votacao.votos1 + Votacao.votos2 + Votacao.votos3 + Votacao.votos4;
        double soma2 = Votacao.votos1 + Votacao.votos2 + Votacao.votos3 + Votacao.votos4;
        
        //Porcetagem do total de votos
        Double porcVotos1 = Votacao.votos1 / soma2;
        Double porcVotos2 = Votacao.votos2 / soma2;
        Double porcVotos3 = Votacao.votos3 / soma2;
        Double porcVotos4 = Votacao.votos4 / soma2;
        
        NumberFormat nf = NumberFormat.getPercentInstance(Locale.getDefault());
        
        //Computa os votos
        File file = new File("C:\\urnaeleitoral\\src\\main\\java\\com\\br\\igor\\urnaeleitoral\\votos-computados.txt");
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("VOTOS:");
        bw.newLine();
        bw.newLine();                
        bw.write("Total dos votos: " + soma);
        bw.newLine();
        bw.newLine();
        bw.write(NomesCandidatos.BOLSONARO.getNomeCandidato() + " = " + Votacao.votos1 + ", Votos: " + nf.format(porcVotos1));
        bw.newLine();
        bw.write(NomesCandidatos.LULA.getNomeCandidato() + " = " + Votacao.votos2 + ", Votos: " + nf.format(porcVotos2));
        bw.newLine();
        bw.write(NomesCandidatos.CIRO.getNomeCandidato() + " = " + Votacao.votos3 + ", Votos: " + nf.format(porcVotos3));
        bw.newLine();
        bw.write(NomesCandidatos.MORO.getNomeCandidato() + " = " + Votacao.votos4 + ", Votos: " + nf.format(porcVotos4));
        bw.newLine();
        bw.flush();
        bw.close();
        
        //Armazenar os nomes dos eleitores
        File file2 = new File("C:\\urnaeleitoral\\src\\main\\java\\com\\br\\igor\\urnaeleitoral\\eleitores.txt");
        FileWriter fw2 = new FileWriter(file2, false);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        bw2.write("ELEITORES: ");
        bw2.newLine();
        bw2.newLine();        
        
        SimpleDateFormat sd = new SimpleDateFormat("dd'/'MM'/'yyyy");
        
        for(String e : Urna.eleitores){
            bw2.write(e + ", Data: " + sd.format(file2.lastModified()));
            bw2.newLine();
        }
        
        bw2.flush();
        bw2.close();
        
    }

}
