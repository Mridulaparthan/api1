package com.api1.validator;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductExpiryDateValidator implements ConstraintValidator<ProductExpiryDate, String> {

	@Override
	public boolean isValid(String productExpiryDate, ConstraintValidatorContext context) {
		if (productExpiryDate.matches("^\\d{4}-\\d{2}-\\d{2}$"))
		{
			if ((Date.valueOf(productExpiryDate)).after(Date.valueOf(LocalDate.now())))
			{
				return true;
			}
		return false;
		}
		return false;
	
	}
}
		
