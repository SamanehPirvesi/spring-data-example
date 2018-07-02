package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
 public Student findByName(String name);
 public Student findBySurName(String surname);
 public Student findByNameAndSurName(String name , String surName);
 
 
 // string operateres
 public List<Student> findByNameLike(String name);
 public List<Student> findByNameContaining(String name);
 public List<Student> findByNameStartingWith(String name);
 public List<Student> findByNameEndingWith(String name);
 public List<Student> findByNameIgnoreCase(String name);
 
 
 //relational operated
 public List<Student> findByAgeEquals(int age); 
 public List<Student> findByAgeGreaterThan(int age);
 public List<Student> findByAgeGreaterThanEqual(int age);
 public List<Student> findByAgeLessThan(int age);
 public List<Student> findByAgeLessThanEqual(int age);
 public List<Student> findByAgeBetween(int minAge , int maxAge);

 //ordering queryy result
 public List<Student> findByNameContainingOrderByAge(String name);
 public List<Student> findByNameContainingOrderByAgeDesc(String name);
 public List<Student> findByNameContainingOrderByAgeAsc(String name);
 
 
 // limiting query result
 public List<Student> findTopByOrderByAgeAsc();
 public List<Student> findTopByOrderByAgeDesc();
 public List<Student> findFirstByOrderByAgeAsc();
 public List<Student> findTop2ByOrderByAgeAsc();
 
 //query
 @Query("select s from Student s where s.age>:in_age") 
 public List<Student> myCustomQuery(@Param("in_age") int age);
 

 
 
}
