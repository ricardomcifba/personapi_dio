package com.ricardo.personapi.dto.request;

import com.ricardo.personapi.enums.PhoneType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {
	
	private Long id;
	
	private PhoneType type;
	
	private String number;

}
