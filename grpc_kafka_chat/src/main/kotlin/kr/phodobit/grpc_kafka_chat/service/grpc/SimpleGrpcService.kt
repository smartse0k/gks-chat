package kr.phodobit.grpc_kafka_chat.service.grpc

import io.grpc.stub.StreamObserver
import kr.phodobit.gks_chat.SimpleGrpc;
import kr.phodobit.gks_chat.HelloReply
import kr.phodobit.gks_chat.HelloRequest
import net.devh.boot.grpc.server.service.GrpcService


@GrpcService
class SimpleGrpcService : SimpleGrpc.SimpleImplBase() {
    override fun sayHello(req: HelloRequest, responseObserver: StreamObserver<HelloReply?>) {
        val reply = HelloReply.newBuilder().setMessage("Hello ==> " + req.name).build()
        responseObserver.onNext(reply)
        responseObserver.onCompleted()
    }
}