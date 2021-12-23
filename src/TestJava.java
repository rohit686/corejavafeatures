import java.util.Arrays;
import java.util.stream.Collectors;

class TestJava{

    public static  void main (String args[]){


         String nameArray[] = new String[] { "Oliver", "Jack", "Harry","Tejack","Elphinston", "Jacob", "Charlie", "James" };
        System.out.println();

         String ss = Arrays.stream(nameArray).filter(s->s.startsWith("Ja")).map(String::toUpperCase).reduce(",",String::concat);
         System.out.println(ss);

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}