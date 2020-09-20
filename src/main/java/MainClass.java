import model.Book;
import model.Seller;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Book book =  new Book.Builder().author("Napoleon Hill").name("Think and grow rich").price(500).build();
        Book book1 =  new Book.Builder().from(book).name("The Law of Success").build();
        System.out.println("Book : " +book);
        System.out.println("Book1 : " +book1);

        Seller seller1 = new Seller.Builder().name("Express Book depot").address("Jaipur").bookname("Word power made easy").build();
        Seller seller2 = new Seller.Builder().name("Pune book store").address("Pune").bookname("Word power made easy").build();
        Seller seller3 = new Seller.Builder().from(seller1).bookname("Ramayana").build();
        System.out.println("Seller1 : " +seller1);
        System.out.println("Seller2 : " +seller2);
        System.out.println("Seller3 : " +seller3);

    }
}
