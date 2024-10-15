package ru.honeyrinn.MyUiRestDbService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.honeyrinn.MyUiRestDbService.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {


}
