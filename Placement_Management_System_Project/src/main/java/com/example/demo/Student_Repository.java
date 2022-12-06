
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/*jpa repository is exists in spring data jpa   
dependency and it contains all the crud operation   */

public interface Student_Repository extends JpaRepository<Student, Integer>{

}
