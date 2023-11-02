package com.progressTracker.model.entities;

import com.progressTracker.model.IUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Objective implements IUser {

    private long id ;


    private String description ;


    private String status;

    private User user ;

    @Override
    public void showMessage() {
        System.out.println("this is Object");
    }
}
