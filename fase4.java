import java.util.ArrayList;

public class fase4 {


    public static void main(String[] args) {
        ArrayList <Character> name; 
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

        ArrayList <Character> surname;
		surname= new ArrayList();
        name.add(' ');
        name.add('B');
        name.add('a');
        name.add('r');
        name.add('g');
        name.add('a');
        name.add('l');
        name.add('l');
        name.add('o');

        ArrayList <Character> fullname ;
		fullname= new ArrayList();


        for (int i = 0; i < name.size(); i++) {
            fullname.add(name.get(i));
        }


            for (int j = name.size(); j < (surname.size()+name.size()); j++) {
                fullname.add (surname.get (j-name.size()));
            }
        for (int k = 0; k < fullname.size(); k++) {
            System.out.print(fullname.get(k));
        }
        }

    }

