package com.xworkz.userData.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "userdetails")
public class UserDTO {

	public UserDTO() {
		System.out.println("Calling Default Constructor Of:" + this.getClass().getSimpleName());
	}
	
	@Id
	@GenericGenerator(name = "save", strategy = "increment")
	@GeneratedValue(generator = "save")
	@Min(value = 1)
	private Integer uId;
	@NotNull @NotEmpty @Length(min = 3)@Length(max = 50)
	private String userName;
	@NotNull @NotEmpty @Length(min = 3)@Length(max = 50)
	private String userEmail;
	@NotNull @NotEmpty @Length(min = 10)@Length(max = 13)
	private String contactInfo;
}
