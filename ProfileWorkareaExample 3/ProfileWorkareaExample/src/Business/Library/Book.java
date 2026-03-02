/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Library;

/**
 *
 * @author lajon
 */
public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean available;
    private String issuedTo;
    private String issueDate;
    private String dueDate;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setAvailable(boolean available) { this.available = available; }

    
    public String getIssuedTo() {
    return issuedTo;
    }

    public void setIssuedTo(String issuedTo) {
    this.issuedTo = issuedTo;
    }

    public String getIssueDate() {
    return issueDate;
    }

    public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
    }

    public String getDueDate() {
    return dueDate;
    }

    public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
    }
    @Override
    public String toString() {
        return bookId;
    }
}
