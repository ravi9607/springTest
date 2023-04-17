package com.example.test001.Repo;




import com.example.test001.Model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends JpaRepository<Employ, Integer> {
}
