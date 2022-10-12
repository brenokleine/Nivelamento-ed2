import java.util.LinkedList;
import java.util.Scanner;

class Questao6_Nivelamento_Ed2{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista:\n > ");
        int num = scanner.nextInt();
        
        LinkedList<Object> lista = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            lista.add(i);
        }

        Object first = "", last;

        for (int i = 1; i <= num; i++) {
            
            first = lista.removeFirst();
            
            try {
                last = lista.removeLast();
            } catch (Exception NoSuchElementException) {
                break;
            }


            if(lista.isEmpty()){
                System.out.println("Os elementos do meio eram: " + first.toString() + " e " + last.toString());
            }
        }

        System.out.println("O elemento do meio era: " + first.toString());

    }
}