package OOPS.Encapsulation;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
}

public class Encapsulation1 {

    public static void main(String[] args) {

        Author author = new Author(
                "Aravind",
                "aravind@gmail.com",
                'M');

        Book book = new Book(
                "Java Programming",
                author,
                599.50,
                25);

        System.out.println("Book Name : " + book.getName());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity : " + book.getQtyInStock());

        System.out.println("\nAuthor Details");
        System.out.println("Name : " + book.getAuthor().getName());
        System.out.println("Email : " + book.getAuthor().getEmail());
        System.out.println("Gender : " + book.getAuthor().getGender());
    }
}