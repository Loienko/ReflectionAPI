package net.ukr.dreamsicle.Lesson2XMLandJSON.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yura on 14.04.2017.
 */
@XmlRootElement(name="catalog")
public class Catalog {

    @XmlElement(name = "book")
    private List<Book> books = new ArrayList<>();

    public void add(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(books.toArray());
    }
}
