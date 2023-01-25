package ch.bbw.pr.springsql.model;

import jakarta.persistence.*;

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
    @JoinColumn(name = "author_id")
    private String author;

    private String topic;
    @Column(name = "date")
    private String date;
    @Column(name = "readtime")
    private int readtime;


    public Article(int id, String title, String content, String author, String topic, String date, int readtime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.topic = topic;
        this.date = date;
        this.readtime = readtime;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
