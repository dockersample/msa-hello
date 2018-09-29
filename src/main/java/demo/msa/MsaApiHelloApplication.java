package demo.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MsaApiHelloApplication {

        
        @RequestMapping("/")
        public String index()
        {   
            
            return "这是首页";
        }
        
         @RequestMapping("/hello")
        public String hello()
        {   
            
            return "Hello";
        }
        
        
    
	public static void main(String[] args) {
		SpringApplication.run(MsaApiHelloApplication.class, args);
	}
        
        
}
