// package com.dalwaricorps.managapp;

// import java.util.List;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import com.dalwaricorps.managapp.model.Role;
// import com.dalwaricorps.managapp.model.User;
// import com.dalwaricorps.managapp.repository.UserRepository;

// @Configuration
// public class DatabaseLoader {
//     private UserRepository repo;
//     public DatabaseLoader(UserRepository repo){
//         this.repo=repo;
//     }
//     @Bean
//     public CommandLineRunner initializeDatabase(){
//         return args->{
//             // User user1=new User("admin@codejava.net","admin123",Role.ADMIN);
//             // User user2=new User("david@codejava.net","david123",Role.ADMIN);
//             User user3=new User("alex@codejava.net","alex123",Role.USER);
//             // User user4=new User("jane@codejava.net","alex123",Role.ADMIN);
//             repo.save(user3);
//             // repo.saveAll(List.of(user1,user2,user3,user4));
//             System.out.println("Sample database initialized");
//         };
//     }
    
// }
