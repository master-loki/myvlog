package com.myblog.myblog.controller;

import com.myblog.myblog.Entity.Post;
import com.myblog.myblog.payload.PostDto;
import com.myblog.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
    this.postService=postService;
    }
    @PostMapping
    public ResponseEntity<PostDto> CreatePost(@RequestBody PostDto postDto){
        PostDto dto = postService.CreatePost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<PostDto> getPostById(@RequestParam long id){
       PostDto dto = postService.getPostByID(id);
       return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
