/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.teamcap.reactjaxrs.model;

import java.io.Serializable;

/**
 * Person
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -6832657722732991662L;
    
    private int id;
    private String name;
    
    public Person(){
        
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
