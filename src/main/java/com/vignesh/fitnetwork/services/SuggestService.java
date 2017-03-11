package com.vignesh.fitnetwork.services;

import com.vignesh.fitnetwork.model.suggestion.FriendSuggestion;
import com.vignesh.fitnetwork.repositories.suggestionRepository.SuggestionResponseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pulkit on 11/30/16.
 */
@Service
public class SuggestService {
    @Autowired
    SuggestionResponseRepository suggestionResponseRepository;
    public FriendSuggestion getFriendSuggestions(long userId){
        return suggestionResponseRepository.getFriendSug(userId);
    }
}
