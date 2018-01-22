package com.indizen.fjpiqueras.kafka;

import com.indizen.fjpiqueras.kafka.streamjob.KStreamsJob;

public class KafkaStreamsApplication {

    //Recibe un argumento, nombre del tópico al que enviará los mensajes
    public static void main(String[] args) throws Exception {

        if(args.length==1) {
            KStreamsJob.init(args[0]);
        } else{
            throw new Exception("La applicación recibe un argumento: nombre del tópico");
        }
    }

}
