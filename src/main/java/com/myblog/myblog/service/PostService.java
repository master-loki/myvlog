package com.myblog.myblog.service;

import com.myblog.myblog.payload.PostDto;

public interface PostService {
    public PostDto CreatePost(PostDto postDto);

   public  PostDto getPostByID(long id);
}
