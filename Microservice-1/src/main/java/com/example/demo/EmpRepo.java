package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpRepo extends JpaRepository<Employee, String> {
@Query("Select e from Employee e where e.user=?1 and e.password=?2")
public Employee findByUserNPwd(String user,String password);


}
