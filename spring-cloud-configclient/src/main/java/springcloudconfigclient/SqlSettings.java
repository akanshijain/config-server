package springcloudconfigclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("sql")
public class SqlSettings {
      private String name;
      private String classes;
      private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClasses() {
		return classes;
	}
	public String getName() {
		return name;
	}
}
