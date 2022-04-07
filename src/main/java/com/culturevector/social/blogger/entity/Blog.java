package com.culturevector.social.blogger.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Blog {

    @Id
    private String blogId;
    private String blogContent;

    public Blog(String blogContent) {
        this.blogContent = blogContent;
    }

}
