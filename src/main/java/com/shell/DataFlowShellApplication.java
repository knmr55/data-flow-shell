package com.shell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.shell.EnableDataFlowShell;

@SpringBootApplication
@EnableDataFlowShell
public class DataFlowShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataFlowShellApplication.class, args);
	}
}
