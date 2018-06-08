package ua.lviv.iot;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;


@Path("/record")
@SessionScoped
public class RecordService implements Serializable{

    @Inject
    private MusicStore musicStore;
//    private static MusicStore musicStore = new MusicStore();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public Record getRecord(@PathParam("id") Integer id) {
        return musicStore.findById(id);
    }


    @POST
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response updateRecord(@PathParam("id") Integer id,
                                  Record record) {
        musicStore.updateRecord(id, record);
        return Response.status(200).entity("Success").build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response createRecord(Record record) {
        musicStore.addRecord(record);
        return Response.status(200).entity("Success").build();
    }

    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response deleteRecord(@PathParam("id") Integer id) {
        musicStore.deleteRecord(id);
        return Response.status(200).entity("Success").build();
    }
}

