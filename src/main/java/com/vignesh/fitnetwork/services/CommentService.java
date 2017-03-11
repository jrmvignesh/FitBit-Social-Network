package com.vignesh.fitnetwork.services;

import com.vignesh.fitnetwork.model.Newsfeed.BooleanResponse;
import com.vignesh.fitnetwork.model.Newsfeed.Comment;
import com.vignesh.fitnetwork.model.Newsfeed.CommentsList;
import com.vignesh.fitnetwork.repositories.commentRepository.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sid on 26-Nov-2016.
 */

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public CommentsList getComments(int id){
        return commentRepository.getComments(id);
    }

    public BooleanResponse setComments(int id, String text , long timestamp,Long userId){
        return commentRepository.setComments(id , text , timestamp, userId);
    }

}
