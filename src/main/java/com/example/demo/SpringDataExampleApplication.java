package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@SpringBootApplication
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repository")
@ComponentScan("com.example.service")
public class SpringDataExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(SpringDataExampleApplication.class, args);
		
		StudentRepository studentRepo= context.getBean(StudentRepository.class);
		
//		Student s1= new Student("hh","vv",20);
//		Student s2= new Student("a aaaaaa","bb",45);
//		Student s3= new Student("ramin","dd",26);
//		
//		studentRepo.save(s1);
//		studentRepo.save(s2);
//		studentRepo.save(s3);
		//System.out.println(studentRepo.findById((long)1).get().getName());
		//System.out.println(studentRepo.findByName("aaa").getSurName());
		//System.out.println(studentRepo.findBySurName("bbb").getId());
		//System.out.println(studentRepo.findByNameAndSurName("aaa", "bbb").getId());
		
		//studentRepo.findByNameLike("a%").stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByNameContaining("a").stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByNameStartingWith("r").stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByNameEndingWith("a").stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByNameEndingWith("aa").stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByAgeEquals(45).stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByAgeGreaterThan(26).stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByAgeGreaterThanEqual(26).stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByAgeLessThan(26).stream().map(s->s.getName()).forEach(System.out::println);
	//studentRepo.findByAgeLessThanEqual(26).stream().map(s->s.getName()).forEach(System.out::println);
		
		//studentRepo.findByAgeBetween(26,45).stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findByNameContainingOrderByAgeDesc("a").stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.findTop2ByOrderByAgeAsc().stream().map(s->s.getName()).forEach(System.out::println);
		//studentRepo.myCustomQuery(26).stream().map(s->s.getName()).forEach(System.out::println);
		
		StudentService studentService=context.getBean(StudentService.class);
		System.out.println(studentService.getStudentByName("Aa").getSurName());
		
}
}
