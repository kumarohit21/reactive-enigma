package com.culturevector.social.initializer;

import com.culturevector.social.blogger.entity.Blog;
import com.culturevector.social.blogger.repo.BlogRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class BlogInitializer {

    @Bean
    public CommandLineRunner init(BlogRepository blogRepository) {
        return args -> {

            Flux.just(
                    new Blog("This is a test Blog"),
                    new Blog("This is a another Blog"))
                    .flatMap(blogRepository::save)
                    .subscribe(System.out::println);
        };

    }

}