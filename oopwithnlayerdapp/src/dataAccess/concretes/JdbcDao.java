package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.CourseDao;
import dataAccess.abstracts.EducatorDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Educator;

public class JdbcDao implements CategoryDao,CourseDao, EducatorDao {

    @Override
    public void add(Educator educator) {
    	System.out.println("JDBC ile  Eğitimci eklendi.");
        
    }

    @Override
    public void add(Course course) {
        System.out.println("JDBC ile  Kurs eklendi.");
        
    }

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile  Kategory eklendi.");
        
    }
    
}
