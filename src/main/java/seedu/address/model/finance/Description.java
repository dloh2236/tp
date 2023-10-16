package seedu.address.model.finance;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Description of a Finance.
 */
public class Description {
    public static final String MESSAGE_CONSTRAINTS =
            "Descriptions cannot start with a whitespace";
    public static final String VALIDATION_REGEX = "[\\p{Alnum}][\\p{Alnum} ]*";
    public final String value;
    /**
     * Constructs a Description object with the specified description value.
     *
     * @param description The description value to be associated with this object.
     */
    public Description(String description) {
        requireNonNull(description);
        this.value = description;
    }
    /**
     * Returns true if a given string is a valid description.
     */
    public static boolean isValidDescription(String test) {
        return test.matches(VALIDATION_REGEX);
    }


    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Description)) {
            return false;
        }

        Description otherDescription = (Description) other;
        return value.equals(otherDescription.value);
    }
    @Override
    public String toString() {
        return value;
    }

}
