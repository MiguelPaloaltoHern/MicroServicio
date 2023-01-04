package com.servicioCuentasBancarias.Banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient
@ComponentScan({"com.servicioCuentasBancarias.banco.servicio","com.servicioCuentasBancarias.banco.controlador","com.servicioCuentasBancarias.banco.ServicioImplementacion"})
@EnableFeignClients
@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

}
