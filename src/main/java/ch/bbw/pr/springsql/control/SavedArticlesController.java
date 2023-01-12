package ch.bbw.pr.springsql.control;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class SavedArticlesController {
    @GetMapping(path="/getallsavedarticles")
    public String getallsavedarticles() {
        return "getallsavedarticles";
    }
    @GetMapping(path="/getsavedarticlebyid")
    public String getsavedarticlebyid() {
        return "getsavedarticlebyid";
    }
}
