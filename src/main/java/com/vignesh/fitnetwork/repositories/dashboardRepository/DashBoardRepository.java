package com.vignesh.fitnetwork.repositories.dashboardRepository;

import org.springframework.stereotype.Repository;

import com.vignesh.fitnetwork.model.dashboard.Dashboard;

import java.util.List;

/**
 * Created by Shikher on 10-Sep-16.
 */

@Repository
public interface DashBoardRepository {

    Dashboard getDailyDashBoard(long userid , String dateid);
    List<Dashboard> getWeekDashBoard(long userid, String startDate, String endDate);

}
