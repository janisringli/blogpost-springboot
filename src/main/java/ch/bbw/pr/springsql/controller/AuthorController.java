package ch.bbw.pr.springsql.controller;

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
    //add author
    @GetMapping(path="/addauthor")
    public String addauthor() {
        return "addauthor";
    }
    //update author
    @GetMapping(path="/updateauthor")
    public String updateauthor() {
        return "updateauthor";

    }



}
