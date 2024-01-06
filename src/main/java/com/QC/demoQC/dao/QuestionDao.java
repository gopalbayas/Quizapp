package com.QC.demoQC.dao;
import com.QC.demoQC.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> { // jpa will minimize 7 steps to fetch database
    //  data jpa  need 2 thing (tableName, PrimaryKey Type)
     List<Question> findByCategory(String category);
    @Query(value = "SELECT * FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
