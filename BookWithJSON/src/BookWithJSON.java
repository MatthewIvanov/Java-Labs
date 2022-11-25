import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

class Book  implements Comparable<Book> {
    String  name;
    @SerializedName("AUTH NAME")
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

public class BookWithJSON {
    public static void main(String [] args) throws IOException {
        Book first = new Book("Apple","Steve Jobs");
        Book second = new Book("Pineapple","Jimmy Salivan");
        Book third = new Book("Orange","Mike Wazovsky");

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(first);
        list.add(second);
        list.add(third);
        System.out.print("Before sort: ");
        for(Book temp: list) {
            System.out.print(temp.name+ " ");
        }
        System.out.println();
        list.sort(Book::compareTo);
        System.out.print("After sort: ");
        for(Book temp: list) {
            System.out.print(temp.name+ " ");
        }
        String jsonFileName = "txt.json";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Writer writer = Files.newBufferedWriter(Paths.get(jsonFileName));
        gson.toJson(list, writer);
        writer.close();


        


    }
}



