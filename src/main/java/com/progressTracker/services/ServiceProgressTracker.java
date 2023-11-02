package com.progressTracker.services;

import com.progressTracker.model.entities.Objective;
import com.progressTracker.model.entities.User;

public class ServiceProgressTracker {
    private User user;
    private Objective objective;

    // Constructor for dependency injection
    public void setUser(User user) {
        this.user = user;
    }
    public void setObjective(Objective objective) {
        this.objective = objective;
    }

//    public void assignObjective(Objective objective) {
//
//    }
//
//    public void updateProgress(Objective objective) {
//
//    }
//
//    public void trackAchievements() {
//
//    }
}
