package com.example.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class FilterFileFormatRouter extends RouteBuilder {

    @Override
    public void configure() {

        from("file:/home/mahmoudxyz/Downloads/camel/files/input/?noop=true")
                .log("The file has been read")
                .choice()
                .when(simple("${header.CamelFileName} ends with 'xml'"))
                .filter(xpath("/order[@test]"))
                .to("file:/home/mahmoudxyz/Downloads/camel/files/xml-output")
                .log("Filtered and converted to JSON");
    }
}

