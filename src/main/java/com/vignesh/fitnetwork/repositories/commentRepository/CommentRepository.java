package com.vignesh.fitnetwork.repositories.commentRepository;

import org.springframework.stereotype.Repository;

import com.vignesh.fitnetwork.model.Newsfeed.BooleanResponse;
import com.vignesh.fitnetwork.model.Newsfeed.Comment;
import com.vignesh.fitnetwork.model.Newsfeed.CommentsList;

import java.util.List;

/**
 * Created by sid on 26-Nov-2016.
 */

@Repository
public interface CommentRepository {

    CommentsList getComments(int userid);

    BooleanResponse setComments(int id, String text, long timestamp, Long userId);
}
