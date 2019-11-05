////////////////////////
// TITLE: TestTree
// AUTHOR: lego
// DATE: 2019-11-04
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.learningSorting;

import java.util.*;

public class TestTree {
    public static void main (String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book implements Comparable<Book>{
    String title;
    public Book(String t) {
        title = t;
    }

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.title);
    }
}
