package cn.gaoyuexiang.api.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig{

  public JerseyConfig() {
    packages("cn.gaoyuexiang.api.demo.controllers");
  }

}
