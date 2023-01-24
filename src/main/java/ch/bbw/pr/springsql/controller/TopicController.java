package ch.bbw.pr.springsql.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @GetMapping(path="/getalltopics")
    public String getalltopics() {
        return "getalltopics";
    }
    @GetMapping(path="/gettopicbyid")
    public String gettopicbyid() {
        return "gettopicbyid";
    }
}
