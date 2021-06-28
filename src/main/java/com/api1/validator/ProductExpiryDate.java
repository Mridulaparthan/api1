package com.api1.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ProductExpiryDateValidator.class)
public @interface ProductExpiryDate {
	  String message() default "{productExpiryDate}";

	  Class<?>[] groups() default {};

	  Class<? extends Payload>[] payload() default {};

}
