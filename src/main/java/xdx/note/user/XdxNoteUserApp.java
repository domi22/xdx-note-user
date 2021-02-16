package xdx.note.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan(basePackages = {"xdx.note.user.mapper"})
@EnableDiscoveryClient
@SpringBootApplication
public class XdxNoteUserApp {

    public static void main(String[] args) {
        SpringApplication.run(XdxNoteUserApp.class, args);
    }




}
