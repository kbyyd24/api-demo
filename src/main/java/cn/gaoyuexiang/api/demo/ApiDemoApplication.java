package cn.gaoyuexiang.api.demo;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class ApiDemoApplication {

	public static void main(String[] args) {
	  startH2Server();
		SpringApplication.run(ApiDemoApplication.class, args);
	}

  private static void startH2Server() {
    try {
      Server h2Server = Server.createTcpServer().start();
    } catch (SQLException e) {
      throw new RuntimeException("Failed to start H2 server: ", e);
    }
  }
}
