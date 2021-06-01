/*Construa um algoritmo que seja capaz de concluir qual dentre os seguintes animais foi escolhido
atraves de perguntas e respostas. Animais possíveis:leão,cavalo,homem,macaco,morcego,baleia,avestruz, pinguim
pato, águia, tartaruga, crocodilo e cobra. (Exemplo)
 */
public class EscolhaAnimal {
    public static void main(String[] args) {
        boolean mamifero = true;
        boolean bipede = true;
        boolean onivoro = true;
        String animalEsolhido;

        if ((mamifero = true) && (bipede = false) && (onivoro = true)) {
            animalEsolhido = "homem";
        } else {
            animalEsolhido = "inválido";
        }
        System.out.println(animalEsolhido);
    }
}
