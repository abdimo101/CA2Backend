package rest;

import com.google.gson.Gson;
import utils.HttpUtils;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@Path("catfacts")
public class CatFactsResource {
    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;

    Gson gson = new Gson();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("user")
    public String getCatFacts() throws IOException, ExecutionException, InterruptedException {
        String result = gson.toJson(HttpUtils.fetchData("https://catfact.ninja/fact"));
        return result;
    }

}