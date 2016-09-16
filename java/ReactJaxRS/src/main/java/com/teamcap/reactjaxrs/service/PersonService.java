/*
 * Copyright (c) Jeries Handal - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jeries Handal <Jeries Handal>,  2016.
 */
package com.teamcap.reactjaxrs.service;

import com.teamcap.reactjaxrs.json.JSONResponse;
import com.teamcap.reactjaxrs.json.ResponseStatus;
import com.teamcap.reactjaxrs.model.Person;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * PersonService
 *
 * @author JeriesHG
 * @version 1.0.0
 */
@Path("/persons")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonService extends AbstractService {

    @GET
    public Response retrievePersons() {
        JSONResponse response = new JSONResponse(ResponseStatus.fail);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Agurcia"));
        response.put("persons", persons);

        response.setStatus(ResponseStatus.success);
        status = Response.Status.OK;

        response.setCode(Integer.toString(status.getStatusCode()));
        return Response.status(status).entity(gson.toJson(response)).build();
    }
}
