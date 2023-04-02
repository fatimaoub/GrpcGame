package ma.enset.serveur;

import io.grpc.ServerBuilder;
import ma.enset.service.Service;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server= ServerBuilder.forPort(5555).addService(new Service()).build();
        server.start();
        server.awaitTermination();
    }
}
