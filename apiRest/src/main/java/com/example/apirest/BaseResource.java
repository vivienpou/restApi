package com.example.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class BaseResource
{

	public BaseResource()
	{
	}

	@GetMapping("/get")
	public String get()
	{
		return "getExample";
	}

	@GetMapping("/post")
	public String create(RequestBody body)
	{
		return body.toString();
	}

	@GetMapping("/delete")
	public String delete(Integer id)
	{
		return "try to delete but not delete";
	}

	// restApi created with create table vegetables (vegetable_id serial PRIMARY KEY, name VARCHAR ( 50 ) UNIQUE NOT NULL, color VARCHAR ( 50 ) UNIQUE NOT NULL );
}
