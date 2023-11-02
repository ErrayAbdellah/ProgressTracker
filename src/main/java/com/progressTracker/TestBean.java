package com.progressTracker;

import com.progressTracker.model.IUser;
import com.progressTracker.model.entities.Objective;
import com.progressTracker.model.entities.User;
import com.progressTracker.services.ServiceProgressTracker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        IUser user1 = context.getBean("objective", IUser.class);
         user1.showMessage();

        context.close();
    }
}
