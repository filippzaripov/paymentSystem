

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@SpringBootApplication
public class WebApp {

    @Bean
    protected ServletContextListener listener(){
        return new ServletContextListener() {
            @Override
            public void contextInitialized(ServletContextEvent servletContextEvent) {

            }

            @Override
            public void contextDestroyed(ServletContextEvent servletContextEvent) {

            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}
