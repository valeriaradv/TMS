package org.example;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CarListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        if(se.getSession()==null){
            System.out.println("NULL");
        }else {
            String id = se.getSession().getId();
            System.out.println("SESSION CREATED " + id);
        }

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
