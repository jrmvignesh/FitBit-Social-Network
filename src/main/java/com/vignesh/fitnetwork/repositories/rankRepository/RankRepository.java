package com.vignesh.fitnetwork.repositories.rankRepository;

import org.springframework.stereotype.Repository;

import com.vignesh.fitnetwork.model.rank.RankList;
import com.vignesh.fitnetwork.model.rank.RankResponse;

import java.util.List;

/**
 * Created by Pulkit on 11/27/16.
 */
@Repository
public interface RankRepository {

    public List<RankList> getRank();
}