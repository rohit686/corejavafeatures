import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MainTesting {
    public void main(){

    }
    public static  void main(String args[]){
        Users users = new Users();
        users.setId(1);
        users.setAddress("new asok naagr");
        users.setName("ram");

        Users user2= new Users("raj",2,"xyz");
        Users user3= new Users("raj2",3,"xy3z");
        Users user4= new Users("raj3",4,"xyz4");
        Users user5= new Users("raj4",5,"xyz5");
        users.setId(1);
        users.setAddress("new asok naagr");
        users.setName("ram");



        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users("subh",1,"abcd ,xyz"));
        usersList.add(new Users("abhi",2,"efgh ,xyz"));
        usersList.add(new Users("abhi",2,"ijkl ,xyz"));
        usersList.add(new Users("bhushan",4,"mnop ,xyz"));
        usersList.add(new Users("dubey",5,"qrst ,xyz"));
        usersList.stream().sorted(Comparator.comparing(Users::getName)).collect(Collectors.toList()).forEach(System.out::println);
/*
        usersList.stream().forEach(t->System.out.println(t.getName()));
        List<Users>  usersList1 = usersList.stream().filter(u->u.getName().contains("a")).collect(Collectors.toList());
        System.out.println(usersList1);
        usersList.stream().filter(u->u.getName().contains("a")).sorted(Comparator.comparing(Users::getName)).collect(Collectors.toList()).forEach(System.out::println);

        usersList.stream().map(s->s.getName()).collect(Collectors.toList()).forEach(System.out::println);
        usersList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        List<String> lst = Arrays.asList("STACK","OOOVER");
        lst.stream().map(s->s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::print);
*/
        /*List<String> list = Arrays.asList("arm","ram","state","taste");
        list.stream().collect(Collectors.partitioningBy((a,b)->Arrays.equals(a.toCharArray(),b)))*/
        /*List<String[]> strings =list.stream().map(s->s.split("")).collect(Collectors.toList());
        Collections.sort(list,(s1,s2)-> {Arrays.sort(s1.toCharArray());

        Arrays.sort(s2.toCharArray());
        Arrays.equals(s1.toCharArray(),s2.toCharArray());
            return 0;
        });

        for (String s:list
             ) {
            System.out.println(s);
        }*/

       /* CompletableFuture<List<Users>> listCompletableFuture = new CompletableFuture<>();




        int[] A ={2,4,5,1,3,6};
         Arrays.sort(A);
         int len= A.length;
         int number = A[(len/2)-1];

         System.out.println(number);

        String s1= "rohit";
        String s2 = "rohit";

        if(s1==s2){
//            System.out.print("true");
        }
        System.out.println(s1.equals(s2));

        List<String> list = Arrays.asList("arm","ram","state","taste");
        Map<String, List<String>> anagrams =
                list.stream().collect(Collectors.groupingBy(w -> sorted(w)));

                //list.stream().collect(Collectors.partitioningBy(w -> sorted(w)));

        System.out.println(anagrams.entrySet());*/

       /* Users exe = new Exe();*/




//                System.out.println(anagrams.get("amr"));
//                System.out.println(anagrams.get("aestt"));


      /*  usersList
                .stream() // get stream for original list
                .collect(Collectors.toCollection(//distinct elements stored into new SET
                        () -> new TreeSet<>(Comparator.comparing(Users::getId).thenComparing(Comparator.comparing(Users::getName)).thenComparing(Comparator.comparing(Users::getAddress))))
                ).forEach(s->System.out.println(s));*/

        usersList.stream().forEach(t->System.out.println(t.getName()));
        List<Users>  usersList1 = usersList.stream().filter(u->u.getName().contains("a")).collect(Collectors.toList());
        System.out.println(usersList1);
    }

    public static String sorted(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


}

class Exe extends Users{
    public Exe(){
        System.out.println("EXe");
    }
    public  static void printSc(){
        System.out.println("printsc");
    }
}



class Users{
    public Users() {
        //System.out.println("Users");
    }

    public Users(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public  static void printSc(){
        System.out.println("printsc");
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    String name;
    int id;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}