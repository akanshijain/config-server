package springcloudconfigclient;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class myGreeting {
   
	@Value("${my.greeting}")
	private String greeting;
	
	@Value("${my.list.call}")
	private List<String> listCall;

	
	@Autowired
	private SqlSettings sqlSettings;
	
	@GetMapping("/sqlValues")
	public String doGreet() {
		return sqlSettings.getClasses() +"  "+ sqlSettings.getName()+"  "+sqlSettings.getAge();
	}

}
