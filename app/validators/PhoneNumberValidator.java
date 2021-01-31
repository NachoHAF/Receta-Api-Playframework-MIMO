package validators;

import play.data.validation.Constraints;
import play.libs.F;
import play.libs.F.Tuple;

import javax.validation.ConstraintValidator;
import java.util.regex.Pattern;

public class PhoneNumberValidator
        extends Constraints.Validator<Long>
        implements ConstraintValidator<Phonenumber, Long>{

    @Override
    public boolean isValid(Long Phonenumber) {
       //Long number = Phonenumber.;
        Pattern pattern = Pattern.compile("^[0-9]*$");

    if (pattern.matcher(String.valueOf(Phonenumber)).matches()){
        return true;
    }
        return false;

    }

    @Override
    public Tuple<String, Object[]> getErrorMessageKey() {
        return new F.Tuple<String, Object[]>(
                "Debe de contener solo una palabra",
                new Object[]{""});
    }

    @Override
    public void initialize(Phonenumber constraintAnnotation) {
        // TODO Auto-generated method stub

    }

}
