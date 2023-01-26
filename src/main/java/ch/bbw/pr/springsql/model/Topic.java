package ch.bbw.pr.springsql.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "topic")
@NamedQuery(name = "Topic.findAll", query = "FROM Topic")
public class Topic {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "topicName")
    private String topicName;

    @ManyToMany
    @JoinTable(name = "article_topic",
            joinColumns = @JoinColumn(name = "topic_id"),
            inverseJoinColumns = @JoinColumn(name = "article_id")
    )
    List<Article> article;

    public Topic() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return topicName;
    }

    public void setName(String topicName) {
        this.topicName = topicName;
    }

    public List<Article> getArticle() {
        return article;
    }
    public void setArticle(List<Article> article) {
        this.article = article;
    }
    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", topicName='" + topicName + '\'' +
                '}';
    }
}
