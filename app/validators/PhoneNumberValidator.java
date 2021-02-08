package validators;

import play.data.validation.Constraints;
import play.libs.F;
import play.libs.F.Tuple;

import javax.validation.ConstraintValidator;

public class PhoneNumberValidator
        extends Constraints.Validator<String>
        implements ConstraintValidator<Phonenumber, String>{

    @Override
    public Tuple<String, Object[]> getErrorMessageKey () {
        return new F.Tuple<>(
                "Phonenumber is not valid",
                new Object[]{""});
    }

    @Override
    public boolean isValid(String Phonenumber) {

        {
            if(Phonenumber==null){return true;}
            return Phonenumber.matches("^(\\+\\d{1,5}) \\d{6,11}$");
        }
    }

    }


