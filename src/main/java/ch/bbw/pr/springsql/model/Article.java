package ch.bbw.pr.springsql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "article")
@NamedQuery(name = "Article.findAll", query = "FROM Article")
public class Article {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @ManyToOne
    private Author author;
    @ManyToMany(mappedBy = "article")
    List<Topic> topic;

    @Column(name = "date")
    private String date;
    @Column(name = "readtime")
    private int readtime;


    public Article() {
    }


    public void setTopic(List<Topic> topic) {
        this.topic = topic;
    }
    public List<Topic> getTopic(){
        return topic;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int getReadtime() {
        return readtime;
    }
    public void setReadtime(int readtime) {
        this.readtime = readtime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", topic='" + topic + '\'' +
                ", date='" + date + '\'' +
                ", readtime=" + readtime +
                '}';
    }
}
