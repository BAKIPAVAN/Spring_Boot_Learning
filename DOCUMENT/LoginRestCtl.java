package com.learning.demo.Controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@RestController
@RequestMapping("/api/users1")
public class LoginRestCtl {

	@PostMapping("/name")
	public String GetName(@RequestBody String users) {

		System.out.println(users);
		Map<String,Object> map=new Gson().fromJson(users, new TypeToken<HashMap<String,Object>>(){}.getType());
		System.out.println(map.keySet());
		String respo=map.get("userName").toString();
		System.out.println(respo);

		return respo;
	}

}
