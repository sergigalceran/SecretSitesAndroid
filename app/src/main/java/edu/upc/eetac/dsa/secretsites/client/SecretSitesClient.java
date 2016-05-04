package edu.upc.eetac.dsa.secretsites.client;

import com.google.gson.Gson;

import org.glassfish.jersey.client.ClientConfig;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import edu.upc.eetac.dsa.secretsites.client.entity.Link;
import edu.upc.eetac.dsa.secretsites.client.entity.Root;

/**
 * Created by Sergi1 on 04/05/2016.
 */
public class SecretSitesClient {
    private final static String BASE_URI = "http://0.0.0.0:8080/";
    private static SecretSitesClient instance;
    private Root root;
    private ClientConfig clientConfig = null;
    private Client client = null;

    private SecretSitesClient() {
        clientConfig = new ClientConfig();
        client = ClientBuilder.newClient(clientConfig);
        loadRoot();
    }

    public static SecretSitesClient getInstance() {
        if (instance == null)
            instance = new SecretSitesClient();
        return instance;
    }

    private void loadRoot() {
        WebTarget target = client.target(BASE_URI);
        Response response = target.request().get();

        String json = response.readEntity(String.class);
        root = (new Gson()).fromJson(json, Root.class);
    }

    public Root getRoot() {
        return root;
    }

    public final static Link getLink(List<Link> links, String rel){
        for(Link link : links){
            if(link.getRels().contains(rel)) {
                return link;
            }
        }
        return null;
    }
}

