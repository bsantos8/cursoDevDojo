public class OperadoresAtribuicao {
    public static void main(String[] args){
        // += -= *= /= %=
        int salario =  1800;
        //salario = salario + salario;
        //salario += salario;
        //multiplicar por num decimal pode forçar modficar o valor para int ao inves de usar double(td n decimal consideredo double
        salario = salario + (int) (salario * 0.1);

        System.out.println(salario);
    }
}
