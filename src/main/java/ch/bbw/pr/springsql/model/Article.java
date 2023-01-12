package ch.bbw.pr.springsql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Article {
    @Id
    private int id;
    private String title;
    private String content;
    private String author;
    private String topic;
    private String date;
    private int readtime;

    public Article() {
    }

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

}
