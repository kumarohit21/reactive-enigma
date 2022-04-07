package com.culturevector.social.blogger.web;

import com.culturevector.social.blogger.entity.Blog;
import com.culturevector.social.blogger.repo.BlogRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    private final BlogRepository blogRepository;

    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @RequestMapping("")
    public Flux<Blog> blogs() {

        return blogRepository.findAll();

    }
    @RequestMapping("/{blogId}")
    public Mono<Blog> blogById(@PathVariable(name ="blogId", required = true ) String id) {

        return blogRepository.findById(id);

    }

}
