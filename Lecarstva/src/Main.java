import java.io.*;
import java.io.IOException;


class Leca2 Comparable<Leca2>{
    String name;
    int srok;
    String fact_name;
    int count;
    int price;

    public Leca2(String name, int srok, String fact_name, int count, int price) {
        this.name = name;
        this.srok = srok;
        this.fact_name = fact_name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSrok() {
        return srok;
    }

    public void setSrok(int srok) {
        this.srok = srok;
    }

    public String getFact_name() {
        return fact_name;
    }

    public void setFact_name(String fact_name) {
        this.fact_name = fact_name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Leca{" +
                "name='" + name + '\'' +
                ", srok=" + srok +
                ", fact_name='" + fact_name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}



public class Main {
    public static void main(String[] args)  throws IOException {
        
        Leca2 first = new Leca2("One",2023,"zavod",55,100);
        Leca2 second = new Leca2("Second",2024,"minsk",23,65);




    }
}