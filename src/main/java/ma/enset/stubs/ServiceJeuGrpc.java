package ma.enset.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: GrpcModele.proto")
public final class ServiceJeuGrpc {

  private ServiceJeuGrpc() {}

  public static final String SERVICE_NAME = "ServiceJeu";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.GrpcModele.NumMessage,
      ma.enset.stubs.GrpcModele.NumResponse> getNbrChooseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NbrChoose",
      requestType = ma.enset.stubs.GrpcModele.NumMessage.class,
      responseType = ma.enset.stubs.GrpcModele.NumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.GrpcModele.NumMessage,
      ma.enset.stubs.GrpcModele.NumResponse> getNbrChooseMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.GrpcModele.NumMessage, ma.enset.stubs.GrpcModele.NumResponse> getNbrChooseMethod;
    if ((getNbrChooseMethod = ServiceJeuGrpc.getNbrChooseMethod) == null) {
      synchronized (ServiceJeuGrpc.class) {
        if ((getNbrChooseMethod = ServiceJeuGrpc.getNbrChooseMethod) == null) {
          ServiceJeuGrpc.getNbrChooseMethod = getNbrChooseMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.GrpcModele.NumMessage, ma.enset.stubs.GrpcModele.NumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ServiceJeu", "NbrChoose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.GrpcModele.NumMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.GrpcModele.NumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceJeuMethodDescriptorSupplier("NbrChoose"))
                  .build();
          }
        }
     }
     return getNbrChooseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceJeuStub newStub(io.grpc.Channel channel) {
    return new ServiceJeuStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceJeuBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceJeuBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceJeuFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceJeuFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceJeuImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.GrpcModele.NumMessage> nbrChoose(
        io.grpc.stub.StreamObserver<ma.enset.stubs.GrpcModele.NumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getNbrChooseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNbrChooseMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.GrpcModele.NumMessage,
                ma.enset.stubs.GrpcModele.NumResponse>(
                  this, METHODID_NBR_CHOOSE)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceJeuStub extends io.grpc.stub.AbstractStub<ServiceJeuStub> {
    private ServiceJeuStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceJeuStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceJeuStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceJeuStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.GrpcModele.NumMessage> nbrChoose(
        io.grpc.stub.StreamObserver<ma.enset.stubs.GrpcModele.NumResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getNbrChooseMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ServiceJeuBlockingStub extends io.grpc.stub.AbstractStub<ServiceJeuBlockingStub> {
    private ServiceJeuBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceJeuBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceJeuBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceJeuBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ServiceJeuFutureStub extends io.grpc.stub.AbstractStub<ServiceJeuFutureStub> {
    private ServiceJeuFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceJeuFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceJeuFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceJeuFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_NBR_CHOOSE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceJeuImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceJeuImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NBR_CHOOSE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.nbrChoose(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.GrpcModele.NumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceJeuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceJeuBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.GrpcModele.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceJeu");
    }
  }

  private static final class ServiceJeuFileDescriptorSupplier
      extends ServiceJeuBaseDescriptorSupplier {
    ServiceJeuFileDescriptorSupplier() {}
  }

  private static final class ServiceJeuMethodDescriptorSupplier
      extends ServiceJeuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceJeuMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServiceJeuGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceJeuFileDescriptorSupplier())
              .addMethod(getNbrChooseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
