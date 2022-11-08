package business;

import core.logging.Logger;
import dataAccess.abstracts.EducatorDao;
import entities.concretes.Educator;

public class EducatorManager {
    private EducatorDao educatorDao;
    private Logger logger[];
    
    public EducatorManager(EducatorDao educatorDao, Logger[] logger) {
        this.educatorDao = educatorDao;
        this.logger = logger;
    }


    public void add (Educator educator){
        educatorDao.add(educator);
for (Logger logger2 : logger) {
  logger2.log(educator.getEducatorName());
}

    }


}
