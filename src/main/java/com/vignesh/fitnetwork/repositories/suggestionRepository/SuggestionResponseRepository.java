package com.vignesh.fitnetwork.repositories.suggestionRepository;

import org.springframework.stereotype.Repository;

import com.vignesh.fitnetwork.model.suggestion.FriendSuggestion;

/**
 * Created by Pulkit on 11/30/16.
 */
@Repository
public interface SuggestionResponseRepository {
    FriendSuggestion getFriendSug(long userid);
}
