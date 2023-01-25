package ch.bbw.pr.springsql.model;

import jakarta.persistence.*;

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

    public Topic(int id, String topicName) {
        this.id = id;
        this.topicName = topicName;
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

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", topicName='" + topicName + '\'' +
                '}';
    }
}
