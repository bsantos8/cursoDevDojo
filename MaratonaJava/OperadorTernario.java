public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 18;
        String status;
       /*
        if (idade<18){
            status = "não adulto";
        }else{
            status = "adulto";
        }
        */
        //Operador ternario - para uma instrução if else apenas
        status = idade < 18 ? "Não adulto" : "Adulto";
        System.out.println(status);
    }
}
