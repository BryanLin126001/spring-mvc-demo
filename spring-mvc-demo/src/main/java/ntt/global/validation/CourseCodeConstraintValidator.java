package ntt.global.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>
{
    private String[] coursePrefixs;

    @Override
    public void initialize(CourseCode theCourseCode)
    {
//        ConstraintValidator.super.initialize(constraintAnnotation);
        coursePrefixs = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext)
    {
        return theCode == null? true : Arrays.stream(coursePrefixs).anyMatch(x->theCode.startsWith(x));
    }
}
