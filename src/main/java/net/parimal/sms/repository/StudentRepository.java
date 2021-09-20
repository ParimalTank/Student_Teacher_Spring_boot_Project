package net.parimal.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.parimal.sms.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
