package config;

import com.google.gson.Gson;

public class VARS {
  private static final String DBSCHEMA = "db_goimob";
  public static final String DBURL = "jdbc:mysql://localhost:3306/" + DBSCHEMA;
  public static final String DBUSER = "root";
  public static final String DBPASS = "nl?d4XTj$(aH";
  public static final Gson gson = new Gson();
}
