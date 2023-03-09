package DesafiosAulas.Ex014Data;

public class    Data {
    int dia;
    int mes;
    int ano;


    String dataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }


    String dataFormatadaNova(int d, int m, int a){
        return String.format("%d/%d/%d", d, m, a);
    }
    String dataFormatadaNova(){
        return "1/1/1997";
    }

}
