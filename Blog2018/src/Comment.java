/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;

public class Comment {
    private String author,content;
    private LocalDate date;

    public Comment(String author, String content) {
        this.author = author;
        this.content = content;
        this.date = LocalDate.now();
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getDate() {
        return date;
    }
    
    public String toString()
    {
        return author+": "+content+" ("+date+")";
    }
    
}