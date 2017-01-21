package com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Created by andre on 04/12/16.
 */
@Controller
@Path("/teste")
public class TesteController {

    private static Logger logger = LoggerFactory.getLogger(TesteController.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String teste(){

        RestTemplate restTemplate = new RestTemplate();

        return "";
    }
}
