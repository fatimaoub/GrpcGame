package ma.enset.service;

import io.grpc.stub.StreamObserver;
import ma.enset.stubs.GrpcModele;
import ma.enset.stubs.ServiceJeuGrpc;

import java.util.ArrayList;
import java.util.Scanner;

public class Service extends ServiceJeuGrpc.ServiceJeuImplBase {
    Scanner scanner=new Scanner(System.in);
    int rand= 10;//(int) (Math.random()*100);
    ArrayList<StreamObserver<GrpcModele.NumResponse>> list=new ArrayList<>();
    public void broadcaast(String name){
        GrpcModele.NumResponse broadcast;
        broadcast = GrpcModele.NumResponse.newBuilder()
                .setReponse(name +" a trouver le nombre magique ")
                .build();
        for(StreamObserver<GrpcModele.NumResponse> n : list)
        {
            System.out.println(n);
            n.onNext(broadcast);
        }
    }
    @Override
    public StreamObserver<GrpcModele.NumMessage> nbrChoose(StreamObserver<GrpcModele.NumResponse> responseObserver) {

        return new StreamObserver<GrpcModele.NumMessage>() {

            @Override
            public void onNext(GrpcModele.NumMessage value) {

                String Nom = value.getNom();
                GrpcModele.NumResponse response;

                int nbr = Integer.parseInt(value.getNombre());
                if (nbr == rand) {
                    response = GrpcModele.NumResponse.newBuilder()
                            .setReponse("bravo t'as choisis le numero exact")
                            .build();
                    responseObserver.onNext(response);
                    list.remove(responseObserver);
                    broadcaast(value.getNom());
                } else if (nbr < rand) {
                    list.add(responseObserver);
                    response = GrpcModele.NumResponse.newBuilder()
                            .setReponse("essayer de choisis un nombre plus grand")
                            .build();
                    responseObserver.onNext(response);
                } else if (nbr > rand) {
                    list.add(responseObserver);
                    response = GrpcModele.NumResponse.newBuilder()
                            .setReponse("essayer de choisis un nombre plus petit")
                            .build();
                    responseObserver.onNext(response);
                }
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
               // responseObserver.onCompleted();
            }
        };
    }
}
