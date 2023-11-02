package com.progressTracker.model.entities;

import com.progressTracker.model.IUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  implements IUser {


    private long id ;


    private String name;


    private String lastName ;


    private String avatar;


    private List<Objective> objectives ;

    public void test(){
        System.out.println("this id user bebe");
    }

    @Override
    public void showMessage() {
        System.out.println("this is User");
    }
}
