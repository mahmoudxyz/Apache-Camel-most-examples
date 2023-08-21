package com.example.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;

import static org.apache.camel.LoggingLevel.INFO;

public class RestRouterConsumer extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(Course.class);
        restConfiguration().host("https://glossy-toy-production.up.railway.app/api/noauth");
        final Course course1 = new Course();

        from("timer:rest-client?period=10s")
                .log("Started")
                .to("rest:get:/course/54")
                .log("Consumed")
                .unmarshal(jacksonDataFormat).process(
                        exchange -> {
                            Course course = (exchange.getIn().getBody(Course.class));
                            course1.setCourseType(course.getCourseType());
                        }
                )
                .log(INFO, this.log,"serialized Data: ${body}")
                .marshal(jacksonDataFormat)
                .log(INFO, this.log,"Deserialized Data: ${body}")
                .log("" + course1);


    }
}
