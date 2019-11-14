package com.javahelps.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Notes;
import com.javahelps.restservice.repository.NoteRepository;

import javassist.tools.web.BadHttpRequest;
@RestController
@RequestMapping(path = "/notes")
public class NotesController {
    @Autowired
    private NoteRepository repository;

    @GetMapping
    public Iterable<Notes> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{title}")
    public Notes find(@PathVariable("title") String title) {
        return repository.findOne(title);
    }

    @PostMapping(consumes = "application/json")
    public Notes create(@RequestBody Notes notes){
        return repository.save(notes);
    }

    @DeleteMapping(path = "/{title}")
    public void delete(@PathVariable("title") String title){
        repository.delete(title);
    }

    @PutMapping(path = "/{title}")
    public Notes update(@PathVariable("title") String title, @RequestBody Notes notes) throws BadHttpRequest{
        if(repository.exists(title)){
            notes.setTitle(title);
            return repository.save(notes);
        }else{
            throw new BadHttpRequest();
        }
    }
}
