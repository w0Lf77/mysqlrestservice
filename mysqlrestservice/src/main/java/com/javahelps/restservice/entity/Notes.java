package com.javahelps.restservice.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notes {

    private String title;
    private String content;
    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date created = new Date(System.currentTimeMillis());
    Date modified = new Date(System.currentTimeMillis());

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public Date getCreated(){
        return created;
    }

    public void setCreated(Date created){
        this.created = created;
    }

    public Date getModified(){
        return modified;
    }

    public void setModified(Date created){
        this.modified = modified;
    }

    public String toString(){
        return "Title : "+ title + " , content : "+ content + " , was created : "+ created + " , modified " + modified;
    }

}
