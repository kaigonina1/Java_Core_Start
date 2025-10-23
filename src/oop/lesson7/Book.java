package oop.lesson7;

public class Book {
    String name;
    String Author;
    int countOfPages;
    boolean documental;

    public Book(String nameBook,String nameAuthor, int count, boolean doc){
        this.name = nameBook;
        this.Author = nameAuthor;
        this.countOfPages = count;
        this.documental = doc;
    }

    public void printed(){
        System.out.println(countOfPages*40);
    }

    public void str(int countOfStr){
        System.out.println(countOfPages * countOfStr);
    }

    public void info(){
        System.out.printf("%s от %s - %s", name, Author, documental ? "Документальная" : "Недокументальная");
    }
}
