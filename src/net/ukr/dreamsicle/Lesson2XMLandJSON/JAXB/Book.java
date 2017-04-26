package net.ukr.dreamsicle.Lesson2XMLandJSON.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Yura on 14.04.2017.
 */

@XmlRootElement(name="book")
public class Book {

    private String author;
    private String title;
    private double price;
    private Date publishDate;

    public Book(){}

    public Book(String author, String title, double price, Date publishDate) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                '}';
    }

    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public void setPrice(double price) {
        this.price = price;
    }

    @XmlElement(name="publish_date")
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
