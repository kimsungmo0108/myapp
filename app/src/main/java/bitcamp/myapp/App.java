package bitcamp.myapp;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableTransactionManagement
@PropertySource({
    "file:${user.home}/config/jdbc.properties",
    "file:${user.home}/config/ncp.properties",
    "file:${user.home}/config/ncp-secret.properties"
})
@Controller
public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("과제관리 시스템 서버 실행!");
    SpringApplication.run(App.class, args);
  }

  @GetMapping("/home")
  public void home() {
  }

  @GetMapping("/about")
  public void about() {
  }
}
