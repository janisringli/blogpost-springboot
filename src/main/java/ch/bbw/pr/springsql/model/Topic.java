package ch.bbw.pr.springsql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
    @Id
    private int id;
    private String topicName;

    public Topic() {
    }

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
}
