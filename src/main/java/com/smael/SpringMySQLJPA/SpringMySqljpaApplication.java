package com.smael.SpringMySQLJPA;

import com.samskivert.mustache.Mustache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories( basePackages = "com.smael.SpringMySQLJPA.Repository")
@SpringBootApplication
public class SpringMySqljpaApplication {

	public static void main(String[] args) {
       // System.setProperty("spring.devtools.restart.enabled", true);
	    SpringApplication.run(SpringMySqljpaApplication.class, args);
	}

    /**
     * Fonction qui a permit que je puisse executer des pages html.
     * @param mustacheTemplateLoader
     * @param environment
     * @return
     */
    @Bean
    public Mustache.Compiler mustacheCompiler(Mustache.TemplateLoader mustacheTemplateLoader,
                                              Environment environment) {

        MustacheEnvironmentCollector collector = new MustacheEnvironmentCollector();
        collector.setEnvironment(environment);

        // default value
        Mustache.Compiler compiler = Mustache.compiler().defaultValue("")
                .withLoader(mustacheTemplateLoader)
                .withCollector(collector);
        return compiler;

    }
}
