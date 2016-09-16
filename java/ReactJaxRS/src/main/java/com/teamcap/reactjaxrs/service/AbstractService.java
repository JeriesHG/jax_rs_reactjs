/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.teamcap.reactjaxrs.service;

import com.google.gson.Gson;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * AbstractService
 *
 * @author JeriesHG
 * @version 1.0.0
 */
public abstract class AbstractService {

    protected final Gson gson;
    protected Status status;

    public AbstractService() {
        gson = new Gson();
        status = Response.Status.BAD_REQUEST;
    }

}
