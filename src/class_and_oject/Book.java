//TODO:write a program to create class and object


package class_and_oject;

public class Book {

    String Book_Name="Python";
    int Book_Page=400;
    double Book_Price=589.34;

    public static void main(String[] args) {

        Book book1=new Book();
        System.out.println("print book name is:" +book1.Book_Name);
        System.out.println("print book page is:" +book1.Book_Page);
        System.out.println("print book price is:" +book1.Book_Price);
    }

}
