package kr.phodobit.grpc_kafka_chat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrpcKafkaChatApplication

fun main(args: Array<String>) {
	runApplication<GrpcKafkaChatApplication>(*args)
}
