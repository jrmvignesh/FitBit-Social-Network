package com.vignesh.fitnetwork.repositories.likeRepository;

import org.springframework.stereotype.Repository;

import com.vignesh.fitnetwork.model.Newsfeed.Like;

/**
 * Created by sid on 26-Nov-2016.
 */


@Repository
public interface LikeRepository {

    Like setLikeStatus (int id , long userid);
    Like setUnlikeStatus (int id , long userid);

}