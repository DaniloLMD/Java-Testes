package DesafiosAulas.Ex017PessoaComidaJantar;

public class Pessoa {
    String nome;
    Double peso;
    void setNome(String nome){
       this.nome = nome;
    }
    void setPeso(double peso){
        this.peso = peso;
    }
    String getNome(){
        return nome;
    }
    double getPeso(){
        return peso;
    }

    double Comer(int escolha){
        Comida comer = new Comida();
        switch (escolha){
            case 1:
                peso += comer.arroz;
                break;

            case 2:
                peso += comer.feijao;
                break;

            case 3:
                peso += comer.bife;
                break;

            case 4:
                peso += comer.salada;
                break;
            default:
                System.out.println("Default");
                break;

        }
        return peso;
    }
}
