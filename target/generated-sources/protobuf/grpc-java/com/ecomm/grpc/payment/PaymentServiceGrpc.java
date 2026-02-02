package com.ecomm.grpc.payment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: payment_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "payment.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecomm.grpc.payment.paymentRequest,
      com.ecomm.grpc.payment.paymentResponse> getProcessPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "processPayment",
      requestType = com.ecomm.grpc.payment.paymentRequest.class,
      responseType = com.ecomm.grpc.payment.paymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecomm.grpc.payment.paymentRequest,
      com.ecomm.grpc.payment.paymentResponse> getProcessPaymentMethod() {
    io.grpc.MethodDescriptor<com.ecomm.grpc.payment.paymentRequest, com.ecomm.grpc.payment.paymentResponse> getProcessPaymentMethod;
    if ((getProcessPaymentMethod = PaymentServiceGrpc.getProcessPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getProcessPaymentMethod = PaymentServiceGrpc.getProcessPaymentMethod) == null) {
          PaymentServiceGrpc.getProcessPaymentMethod = getProcessPaymentMethod =
              io.grpc.MethodDescriptor.<com.ecomm.grpc.payment.paymentRequest, com.ecomm.grpc.payment.paymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "processPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecomm.grpc.payment.paymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecomm.grpc.payment.paymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("processPayment"))
              .build();
        }
      }
    }
    return getProcessPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecomm.grpc.payment.paymentStatusRequest,
      com.ecomm.grpc.payment.paymentStatusResponse> getGetPaymentStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPaymentStatus",
      requestType = com.ecomm.grpc.payment.paymentStatusRequest.class,
      responseType = com.ecomm.grpc.payment.paymentStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecomm.grpc.payment.paymentStatusRequest,
      com.ecomm.grpc.payment.paymentStatusResponse> getGetPaymentStatusMethod() {
    io.grpc.MethodDescriptor<com.ecomm.grpc.payment.paymentStatusRequest, com.ecomm.grpc.payment.paymentStatusResponse> getGetPaymentStatusMethod;
    if ((getGetPaymentStatusMethod = PaymentServiceGrpc.getGetPaymentStatusMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getGetPaymentStatusMethod = PaymentServiceGrpc.getGetPaymentStatusMethod) == null) {
          PaymentServiceGrpc.getGetPaymentStatusMethod = getGetPaymentStatusMethod =
              io.grpc.MethodDescriptor.<com.ecomm.grpc.payment.paymentStatusRequest, com.ecomm.grpc.payment.paymentStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPaymentStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecomm.grpc.payment.paymentStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecomm.grpc.payment.paymentStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("getPaymentStatus"))
              .build();
        }
      }
    }
    return getGetPaymentStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecomm.grpc.payment.refundRequest,
      com.ecomm.grpc.payment.refundResponse> getRefundPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "refundPayment",
      requestType = com.ecomm.grpc.payment.refundRequest.class,
      responseType = com.ecomm.grpc.payment.refundResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecomm.grpc.payment.refundRequest,
      com.ecomm.grpc.payment.refundResponse> getRefundPaymentMethod() {
    io.grpc.MethodDescriptor<com.ecomm.grpc.payment.refundRequest, com.ecomm.grpc.payment.refundResponse> getRefundPaymentMethod;
    if ((getRefundPaymentMethod = PaymentServiceGrpc.getRefundPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getRefundPaymentMethod = PaymentServiceGrpc.getRefundPaymentMethod) == null) {
          PaymentServiceGrpc.getRefundPaymentMethod = getRefundPaymentMethod =
              io.grpc.MethodDescriptor.<com.ecomm.grpc.payment.refundRequest, com.ecomm.grpc.payment.refundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "refundPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecomm.grpc.payment.refundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecomm.grpc.payment.refundResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("refundPayment"))
              .build();
        }
      }
    }
    return getRefundPaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void processPayment(com.ecomm.grpc.payment.paymentRequest request,
        io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.paymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessPaymentMethod(), responseObserver);
    }

    /**
     */
    default void getPaymentStatus(com.ecomm.grpc.payment.paymentStatusRequest request,
        io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.paymentStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaymentStatusMethod(), responseObserver);
    }

    /**
     */
    default void refundPayment(com.ecomm.grpc.payment.refundRequest request,
        io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.refundResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefundPaymentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PaymentService.
   */
  public static abstract class PaymentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PaymentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PaymentService.
   */
  public static final class PaymentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void processPayment(com.ecomm.grpc.payment.paymentRequest request,
        io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.paymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaymentStatus(com.ecomm.grpc.payment.paymentStatusRequest request,
        io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.paymentStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaymentStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refundPayment(com.ecomm.grpc.payment.refundRequest request,
        io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.refundResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefundPaymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PaymentService.
   */
  public static final class PaymentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecomm.grpc.payment.paymentResponse processPayment(com.ecomm.grpc.payment.paymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecomm.grpc.payment.paymentStatusResponse getPaymentStatus(com.ecomm.grpc.payment.paymentStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaymentStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecomm.grpc.payment.refundResponse refundPayment(com.ecomm.grpc.payment.refundRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefundPaymentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PaymentService.
   */
  public static final class PaymentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecomm.grpc.payment.paymentResponse> processPayment(
        com.ecomm.grpc.payment.paymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecomm.grpc.payment.paymentStatusResponse> getPaymentStatus(
        com.ecomm.grpc.payment.paymentStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaymentStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecomm.grpc.payment.refundResponse> refundPayment(
        com.ecomm.grpc.payment.refundRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefundPaymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_PAYMENT = 0;
  private static final int METHODID_GET_PAYMENT_STATUS = 1;
  private static final int METHODID_REFUND_PAYMENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_PAYMENT:
          serviceImpl.processPayment((com.ecomm.grpc.payment.paymentRequest) request,
              (io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.paymentResponse>) responseObserver);
          break;
        case METHODID_GET_PAYMENT_STATUS:
          serviceImpl.getPaymentStatus((com.ecomm.grpc.payment.paymentStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.paymentStatusResponse>) responseObserver);
          break;
        case METHODID_REFUND_PAYMENT:
          serviceImpl.refundPayment((com.ecomm.grpc.payment.refundRequest) request,
              (io.grpc.stub.StreamObserver<com.ecomm.grpc.payment.refundResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getProcessPaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecomm.grpc.payment.paymentRequest,
              com.ecomm.grpc.payment.paymentResponse>(
                service, METHODID_PROCESS_PAYMENT)))
        .addMethod(
          getGetPaymentStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecomm.grpc.payment.paymentStatusRequest,
              com.ecomm.grpc.payment.paymentStatusResponse>(
                service, METHODID_GET_PAYMENT_STATUS)))
        .addMethod(
          getRefundPaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecomm.grpc.payment.refundRequest,
              com.ecomm.grpc.payment.refundResponse>(
                service, METHODID_REFUND_PAYMENT)))
        .build();
  }

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecomm.grpc.payment.PaymentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PaymentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getProcessPaymentMethod())
              .addMethod(getGetPaymentStatusMethod())
              .addMethod(getRefundPaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
