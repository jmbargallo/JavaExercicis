import java.util.ArrayList;

public class Fase2 {

    public static void main(String[] args) {
        ArrayList <Character> name ;
		name= new ArrayList();
        name.add('J');
        name.add('o');
        name.add('s');
        name.add('e');
        name.add(' ');
        name.add('M');
        name.add('a');
        name.add('r');
        name.add('i');
        name.add('a');

        name.add('7');


        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
            if ((name.get(i).equals('a')) || (name.get(i).equals('e'))
                    || (name.get(i).equals('i')) || (name.get(i).equals('o'))
                    || (name.get(i).equals('u'))) {

                System.out.println("es una vocal");
            } else if
            ((name.get(i).equals('0')) || (name.get(i).equals('1'))
                            || (name.get(i).equals('2')) || (name.get(i).equals('3'))
                            || (name.get(i).equals('4')) || (name.get(i).equals('5')
                            || (name.get(i).equals('6')) || (name.get(i).equals('7'))
                            || (name.get(i).equals('8')) || (name.get(i).equals('9')))) {

                System.out.println("els noms de persones no contenen numeros!!");
            } else if ((name.get(i).equals(' '))) {

                System.out.println("es un espai");
            } else {
                System.out.println("es una consonant");
                {
                }
            }
        }
    }
}