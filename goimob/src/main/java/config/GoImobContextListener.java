package config;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

public class GoImobContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    System.out.println("************** Starting up! **************");
  }

  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {

    System.out.println("************** Shutting down! **************");
    // System.out.println("Destroying Context...");
    // System.out.println("Calling MySQL AbandonedConnectionCleanupThread checkedShutdown");
    AbandonedConnectionCleanupThread.checkedShutdown();

    ClassLoader cl = Thread.currentThread().getContextClassLoader();

    Enumeration<Driver> drivers = DriverManager.getDrivers();
    while (drivers.hasMoreElements()) {
      Driver driver = drivers.nextElement();

      if (driver.getClass().getClassLoader() == cl) {

        // System.out.println("Driver name: " + driver.getClass().getName());
        // System.out.println("Driver name: " + driver.getClass().getSimpleName());
        // System.out.println("Driver name: " + driver.getClass().getCanonicalName());

        try {
          System.out.println("Deregistering JDBC driver: " + driver.getClass().getName());
          DriverManager.deregisterDriver(driver);

        } catch (SQLException ex) {
          System.out.println("Error deregistering JDBC driver {}" + driver.getClass().getName());
          ex.printStackTrace();
        }
      } else {
        System.out.println("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader");
      }
    }

  }
}
