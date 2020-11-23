package edu.upc.dsa.services;

import edu.upc.dsa.Covid19Manager;
import edu.upc.dsa.Covid19ManagerImpl;
import edu.upc.dsa.models.Persona;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Root resource (exposed at "myresource" path)
 */
@Api(value = "/user", description = "Endpoint to Text Service")
@Path("/user")
public class Service {
    private Covid19Manager m;

    // Constructor servicio: inicializar instancia + añadir objetos (parecido test)
    public Service() {

        this.m = Covid19ManagerImpl.getInstance();
        this.m.AñadirPersona("1", "Mickey", "Mouse", 20, "A");
        this.m.AñadirPersona("2", "Donald", "Duck", 25, "C");

    }

    @GET
    @ApiOperation(value = "Crea nuevo usuario en el sistema", notes = "a")
    @ApiResponses(value = {
            // Respuesta tiene que ser del tipo que nos piden
            @ApiResponse(code = 201, message = "Successful", response = Boolean.class),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response añadirPersona() {
        // Hacer lo que pide la función
        Boolean respuesta = this.m.AñadirPersona("3", "Miguel", "Marin", 20, "C");
        // Meter en JSON lo que nos piden
        GenericEntity<Boolean> entity = new GenericEntity<Boolean>(respuesta) {};
        // Retornar respuesta
        return Response.status(201).entity(entity).build() ;

    }
}
