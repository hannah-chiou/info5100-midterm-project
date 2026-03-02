/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Library;

import java.util.ArrayList;

/**
 *
 * @author lajon
 */
public class BookDirectory {
        private ArrayList<Book> bookList;

    public BookDirectory() {
        bookList = new ArrayList<>();
    }

    public Book addBook(String id, String title, String author) {
        Book book = new Book(id, title, author);
        bookList.add(book);
        return book;
    }

    public void deleteBook(Book book) {
        bookList.remove(book);
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
}
