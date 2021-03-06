package rest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Article {
    @Id
    @Column
    @GeneratedValue
    private long id;

    @Column
    private String title;
    @Column
    private String body;

    public Article(long id,String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Article() {
    }


    public void setId(long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public String getBody() {
        return body;
    }

    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}