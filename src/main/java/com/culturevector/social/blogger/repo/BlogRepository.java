package com.culturevector.social.blogger.repo;

import com.culturevector.social.blogger.entity.Blog;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends ReactiveCrudRepository<Blog, String> {
    
}
