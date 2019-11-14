package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javahelps.restservice.entity.Notes;
import org.springframework.data.rest.core.annotation.RestResource;

//@RepositoryRestResource(path = "/notes")
@RestResource(exported = false)
public interface NoteRepository extends JpaRepository<Notes, String>{
}
