package com.satyam;

import com.satyam.service.ICustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext Con = SpringApplication.run(Application.class, args);
        ICustomerService service = Con.getBean(ICustomerService.class);
//        CustomerDTO dto = new CustomerDTO(23, "Satyam", "Braj ");
//        String status = service.registerCustomer(dto);
//        System.out.println(status);
//
//        CustomerDTO dto = new CustomerDTO();
//        dto.setId(IdGenerator.generateId());
//        dto.setCustNo(5);
//        dto.setName("Radha");
//        dto.setCity("Braj");
//        service.findAllCustomer().forEach(customer -> System.out.println(customer));
//
//        String status = service.registerCustomer(dto);
//        System.out.println(status);
//         System.out.println(status);

//        String status = service.removeDocument("b66fb0ae-996d-4219-9d7e-43a346ffe90e");
//        System.out.println(status);

        service.findAllCustomer().forEach(customer -> System.out.println(customer));

    }
}
