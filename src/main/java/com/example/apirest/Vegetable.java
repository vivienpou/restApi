package com.example.apirest;

import javax.persistence.*;

@Entity
@Table(name="vegetables")
public class Vegetable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vegetable_id;
	private String name;
	private String color;
}
