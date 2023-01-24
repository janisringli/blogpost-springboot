package ch.bbw.pr.springsql.controller;

import ch.bbw.pr.springsql.model.SavedArticles;
import ch.bbw.pr.springsql.model.Topic;
import ch.bbw.pr.springsql.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {
    @Autowired
    private TopicRepository topicRepo;
    @GetMapping(path="/topics")
    public Iterable<Topic> getTopic() {
        return topicRepo.findAll();
    }
    @GetMapping(path="/topic/{id}")
    public Topic topicById(@PathVariable("id")int id) {
        return topicRepo.findById(id).get();
    }
    @PostMapping(path="/topics")
    public Topic addTopic(@RequestBody Topic topic) {
        return topicRepo.save(topic);
    }
    @PutMapping(path="/topic/{id}")
    public Topic updateTopic(@PathVariable("id")int id, @RequestBody Topic topic) {
        Topic topicToUpdate = topicRepo.findById(id).get();
        topicToUpdate.setName(topic.getName());
        return topicRepo.save(topicToUpdate);
    }
    @DeleteMapping(path="/topic/{id}")
    public void deleteTopic(@PathVariable("id")int id) {
        topicRepo.deleteById(id);
    }
    

}
