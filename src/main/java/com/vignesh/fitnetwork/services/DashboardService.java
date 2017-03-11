package com.vignesh.fitnetwork.services;

import com.vignesh.fitnetwork.model.dashboard.Dashboard;
import com.vignesh.fitnetwork.model.dashboard.WeeklyDashboard;
import com.vignesh.fitnetwork.repositories.dashboardRepository.DashBoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sid on 21-Nov-2016.
 */

@Service
public class DashboardService {
    @Autowired
    DashBoardRepository dashBoardRepository;

    public Dashboard getDailyDashboard(long userid, String dateid) {
        return dashBoardRepository.getDailyDashBoard(userid, dateid);
    }

    public WeeklyDashboard getWeekDashboard(long userid, String date1, String date2) {
        return new WeeklyDashboard(dashBoardRepository.getWeekDashBoard(userid, date1, date2));
    }
}



