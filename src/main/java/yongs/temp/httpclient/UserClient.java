package yongs.temp.httpclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import yongs.temp.vo.User;

@FeignClient(name="example-user")
public interface UserClient {
	@GetMapping("/user/email/{email}")
	User findByEmail(@PathVariable("email") String email);
}
