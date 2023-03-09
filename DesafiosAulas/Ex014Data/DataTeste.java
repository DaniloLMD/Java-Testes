package DesafiosAulas.Ex014Data;
public class DataTeste {

    public static void main(String[] x){

        Data data1 = new Data();
        data1.dia = 29;
        data1.mes = 10;
        data1.ano = 2004;
//        System.out.printf("%d/%d/%d", data1.dia, data1.mes, data1.ano);


        Data data2 = new Data();
        data2.dia = 5;
        data2.mes = 3;
        data2.ano = 2023;
//        System.out.printf("%d/%d/%d", data2.dia, data2.mes, data2.ano);


        String dataFormatada1 = data1.dataFormatada();
        System.out.println(dataFormatada1);

        String dataFormatada2 = data2.dataFormatada();
        System.out.println(dataFormatada2);


        Data dataNova1 = new Data();
        String DataNovaComParametros = dataNova1.dataFormatadaNova(29, 10, 2004);
        System.out.println( DataNovaComParametros );

        Data dataNova2 = new Data();
        String DataNovaSemParamentros = dataNova2.dataFormatadaNova();
        System.out.println( DataNovaSemParamentros );




    }
}
