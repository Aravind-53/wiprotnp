class Writer {
    private String writerName;
    private String writerEmail;
    private char writerGender;

    public Writer(String writerName, String writerEmail, char writerGender) {
        this.writerName = writerName;
        this.writerEmail = writerEmail;
        this.writerGender = writerGender;
    }

    public String getWriterName() {
        return writerName;
    }

    public String getWriterEmail() {
        return writerEmail;
    }

    public char getWriterGender() {
        return writerGender;
    }
}

class Publication {
    private String title;
    private Writer writer;
    private double cost;
    private int stock;

    public Publication(String title, Writer writer, double cost, int stock) {
        this.title = title;
        this.writer = writer;
        this.cost = cost;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public Writer getWriter() {
        return writer;
    }

    public double getCost() {
        return cost;
    }

    public int getStock() {
        return stock;
    }
}

public class LibraryDemo {
    public static void main(String[] args) {

        Writer w = new Writer(
                "Aravind",
                "aravind@gmail.com",
                'M');

        Publication p = new Publication(
                "Core Java",
                w,
                450.75,
                20);

        System.out.println("Title : " + p.getTitle());
        System.out.println("Cost : " + p.getCost());
        System.out.println("Stock : " + p.getStock());

        System.out.println("\nWriter Details");
        System.out.println("Name : " + p.getWriter().getWriterName());
        System.out.println("Email : " + p.getWriter().getWriterEmail());
        System.out.println("Gender : " + p.getWriter().getWriterGender());
    }
}