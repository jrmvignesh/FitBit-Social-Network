package com.vignesh.fitnetwork.repositories.searchRepository;

import org.springframework.stereotype.Repository;

import com.vignesh.fitnetwork.model.search.SearchResponse;

/**
 * Created by Pulkit on 11/27/16.
 */
@Repository
public interface SearchResultRepository {

    public SearchResponse searchAll(Long userId, String input);
}

