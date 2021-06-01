//idade < 15 infantil; idade >= 15 e idade <18 jovenil; idade >= 18 adulto

public class ControleFluxo {
    public static void main(String[] args){
        int idade = 15;
        String categoria;
        if(idade< 15){
            categoria= "infantil";
        }else if(idade >=15 && idade< 18){
            categoria = "juvenil";
        }else{
            categoria= "Adulto";
        }
        System.out.println("Categoria: "+categoria);
    }
}
