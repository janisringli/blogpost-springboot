package ch.bbw.pr.springsql.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @GetMapping(path="/getallauthors")
    public String getallauthors() {
        return "getallauthors";
    }
    @GetMapping(path="/getauthorbyid")
    public String getauthorbyid() {
        return "getauthorbyid";
    }


}
