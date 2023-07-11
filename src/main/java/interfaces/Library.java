package interfaces;

public class Library {

    public static void main(String[] args) {

        Product book = new Book();
        book.setName("A Tale of Two Cities");

        System.out.println(book.getName());
        System.out.println("book.getPrice() = " + book.getPrice());
    }
}
