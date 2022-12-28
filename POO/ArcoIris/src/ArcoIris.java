import java.sql.SQLOutput;
import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {

//   Exiba todas as cores uma abaixo da outra
        Set<String> minhasCores = new HashSet<>();
        minhasCores.add("vermelho");
        minhasCores.add("laranja");
        minhasCores.add("amarelo");
        minhasCores.add("verde");
        minhasCores.add("azul");
        minhasCores.add("anil");
        minhasCores.add("violeta");

        System.out.println("Exiba todas as cores uma abaixo da outra: ");
        for (String cor : minhasCores) {
            System.out.println(cor);
        }


//   A quantidade de cores que o arco-íris tem
        Set<String>minhasCores1 = new TreeSet<>();
        System.out.println("A quantidade de cores que o arco-íris tem: " + minhasCores.size());

//
//  Exiba as cores em ordem alfabética
        Set<String> minhasCores2 = new TreeSet<>(minhasCores);

        System.out.println(minhasCores2);
//
//  Exiba as cores na ordem inversa da que foi informada
        Set<String> minhasCores3 = new LinkedHashSet<>(Arrays.asList("amarelo", "anil","azul", "laranja", "verde", "vermelho", "violeta"));
        System.out.println(minhasCores3);
        List<String> minhasCoresList = new ArrayList<>(minhasCores3);
        Collections.reverse(minhasCoresList);
        System.out.println(minhasCoresList);

        //  Exiba todas as cores que começam com a letra ”v”
        for (String cor: minhasCores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }
//
//  Remova todas as cores que não começam com a letra “v”
        Iterator<String> iterator1 = minhasCores.iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            if (next != "v") iterator1.remove();
        }

//  Limpe o conjunto
        minhasCores.clear();
//
//  Confira se o conjunto está vazio
        System.out.println("Confira se o conjunto está vazio: " + minhasCores.isEmpty());
    }
}
