package com.vignesh.fitnetwork.repositories.newsfeedRepository;


import org.springframework.stereotype.Repository;

import com.vignesh.fitnetwork.model.Newsfeed.NewsfeedList;
import com.vignesh.fitnetwork.model.request.FriendResponse;
import com.vignesh.fitnetwork.model.suggestion.Suggestlist;

import java.util.List;

/**
 * Created by sid on 26-Nov-2016.
 */

@Repository
public interface NewsfeedRepository {

    NewsfeedList getNewsfeed(List<Suggestlist> friends, int pagenumber);

    NewsfeedList getNewsfeedByUser(List<FriendResponse> friends);

}
