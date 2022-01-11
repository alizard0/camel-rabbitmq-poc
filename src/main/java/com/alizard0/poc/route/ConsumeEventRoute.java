package com.alizard0.poc.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ConsumeEventRoute extends RouteBuilder {

  @Override
  public void configure() {
    from("rabbitmq://localhost?queue=event")
            .log("Message received ${body} ${headers}");
  }
}