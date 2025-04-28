
class Book {
    private String title;  // private: accessible only within the class

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getTitle() {
        return title;
    }
}

public class accessmodifier{
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("Java Programming");
        System.out.println(myBook.getTitle());
    }
}
