package homework5.HW5;

import java.util.Arrays;
public class Book {
    private int id;
    private String name;
    private String authors;
    private String publishingHouse;
    private int year;
    private int numberOfPages;
    private double price;
    private String typeofBinding;

    public Book(int id, String name, String authors, String publishingHouse, int year, int numberOfPages, int price, String typeofBinding) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeofBinding = typeofBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return authors;
    }

    public void setAuthor(String author) {
        this.authors = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getCreationYear() {
        return year;
    }

    public void setCreationYear(int creationYear) {
        this.year = creationYear;
    }

    public int getNumbersOfPages() {
        return numberOfPages;
    }

    public void setNumbersOfPages(int numbersOfPages) {
        numberOfPages = numbersOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeofBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeofBinding = typeOfBinding;
    }

    public static void main(String[] args) {
        Book book1 = new Book(123, "Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", "Bloomsbury", 1999, 846, 48, "case binding");
        Book book2 = new Book(412, "In Search of Lost Time", "Marcel Proust", "Grasset", 1927, 513, 57, "case binding");
        Book book3 = new Book(315, "Hamlet", "William Shakespeare", "Penguin Classics", 1602, 746, 43, "case binding");
        Book book4 = new Book(293, "Lolita", "Vladimir Nabokov", "Olympia Press", 1955, 648, 92, "case binding");
        Book[] arr = {book1, book2, book3, book4};

        System.out.print("Book by Marcel Proust: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAuthor() == "Marcel Proust") {
                System.out.println(arr[i].getName() + " " + arr[i].getAuthor() + " " + arr[i].getPublishingHouse() + " " + arr[i].getCreationYear() + " " + arr[i].getNumbersOfPages() + " " + arr[i].getPrice() + " " + arr[i].getTypeOfBinding());
            }
        }
        System.out.print("Books by Bloomsbury: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPublishingHouse() == "Bloomsbury") {
                System.out.println(arr[i].getName() + " " + arr[i].getAuthor() + " " + arr[i].getPublishingHouse() + " " + arr[i].getCreationYear() + " " + arr[i].getNumbersOfPages() + " " + arr[i].getPrice() + " " + arr[i].getTypeOfBinding());
            }
        }
        System.out.print("Books published after 1927: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCreationYear() > 1927) {
                System.out.println(arr[i].getName() + " " + arr[i].getAuthor() + " " + arr[i].getPublishingHouse() + " " + arr[i].getCreationYear() + " " + arr[i].getNumbersOfPages() + " " + arr[i].getPrice() + " " + arr[i].getTypeOfBinding());
            }
        }
    }
}