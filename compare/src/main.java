import java.util.ArrayList;

class Book implements Comparable<Book> {

    String  name;
    String auth_name;
    public Book(String name,String auth_name){
        this.name = name;
        this.auth_name = auth_name;
    }

    public Book() {
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
    public int compareTo2(Book o){return this.auth_name.compareTo(o.auth_name);}
}
public class main {
    public static void main(String [] args){
        Book first = new Book("Apple","Steve Jobs");
        Book second = new Book("Pineapple","Jimmy Salivan");
        Book third = new Book("Orange","Mike Wazovsky");


        ArrayList <Book> list = new ArrayList<Book>();
        list.add(first);
        list.add(second);
        list.add(third);
        System.out.println("Before sort: ");
        for(Book temp: list) {
            System.out.println(temp.name);
        }
        list.sort(Book::compareTo2);
        System.out.println("After sort: ");
        for(Book temp: list) {
            System.out.println(temp.name);
        }
    }
}


