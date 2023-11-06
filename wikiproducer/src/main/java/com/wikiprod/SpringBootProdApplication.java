package com.wikiprod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProdApplication implements CommandLineRunner {

    @Autowired
    private WikChangesProducer wikChangesProducer ;
    public static void main(String[] args) {

        SpringApplication.run(SpringBootProdApplication.class, args) ;

    }

    @Override
    public void run(String... args) throws Exception {

        wikChangesProducer.sendMessage();
    }
}
