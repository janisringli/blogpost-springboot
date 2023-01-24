package ch.bbw.pr.springsql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    @GetMapping(path="/getallarticles")
    public String getallarticles() {
        return "getallarticles";
    }
    @GetMapping(path="/getarticlebyid")
    public String getarticlebyid() {
        return "getarticlebyid";
    }
}
