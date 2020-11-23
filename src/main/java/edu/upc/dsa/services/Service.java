package edu.upc.dsa.services;

import edu.upc.dsa.Manager;
import edu.upc.dsa.ManagerImpl;
import edu.upc.dsa.models.Objeto;
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
@Api(value = "/objects", description = "Endpoint to Text Service")
@Path("/objects")
public class Service {
    private Manager m;

    // Constructor servicio: inicializar instancia + añadir objetos (parecido test)
    public Service() {

        this.m = ManagerImpl.getInstance();
        String idProducto1;
        String idProducto2;
        String idProducto3;
        idProducto1=this.m.añadirObjeto("cafe", 1.25);
        idProducto2=this.m.añadirObjeto("cortado", 1.50);
        idProducto3=this.m.añadirObjeto("te", 1.00);
    }

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */

    @GET
    @ApiOperation(value = "Retorna productos ordenados", notes = "asaf")
    @ApiResponses(value = {
            // Respuesta tiene que ser del tipo que nos piden
            @ApiResponse(code = 201, message = "Successful", response = Objeto.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts() {
        // Hacer lo que pide la función
        List<Objeto> objetos = this.m.listarObjetosPorAlgo();
        // Meter en JSON lo que nos piden
        GenericEntity<List<Objeto>> entity = new GenericEntity<List<Objeto>>(objetos) {};
        // Retornar respuesta
        return Response.status(201).entity(entity).build() ;

    }
}
