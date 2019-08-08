# first-hibernate-program
First Hibernate program

 Steps
 
  1 - Import the jars file to the classpath
  2 - Make the hibernate configuration file (hibernate.cfg.xml is the default name to SessionFactory looks for)
  3 - For use the hibernate, first it's necessary create a SessionFactory object, that is responsable to wrap the xml config and mapping the entity class
  4 - Get a Session hibernate object by SessionFactory.getCurrentSession() - The Session object wrap the JDBC connection and it is used to make all the operantions on the database.
