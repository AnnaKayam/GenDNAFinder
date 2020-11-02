//package com.genfinfder.demo.model;
//
//
//import javax.validation.Constraint;
//import javax.validation.Payload;
//import java.lang.annotation.*;
//
//@Documented
//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy = {GenValidator.class})
//public @interface ConfurmPattern {
//
//    String message() default "Password and Confirm Password do not match.";
//
//    Class<?>[] groups() default {};
//
//    Class<? extends Payload>[] payload() default {};
//}