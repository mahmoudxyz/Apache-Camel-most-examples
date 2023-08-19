package com.example.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/home/mahmoudxyz/Downloads/camel/files/input/?fileName=test2.html&noop=true")
                .log("test?>>>>>>>>>>>>>>>>")
                .to("file:/home/mahmoudxyz/Downloads/camel/files/output")
                .log("saved");
    }
}