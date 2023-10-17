package seedu.address.model.event;

import java.util.Objects;

import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's description in the address book.
 */
public class EventDescription {

    public final String value;

    public static final String MESSAGE_CONSTRAINTS = "Location can take any values up to 256 characters";

    public static final String VALIDATION_REGEX = "^(?!\\s)[\\s\\S]{0,256}$";

    public EventDescription(String descriptionText) {
        checkArgument(isValidDescription(descriptionText), MESSAGE_CONSTRAINTS);
        this.value = descriptionText;
    }

    public String getDescription() {
        return value;
    }

    public static boolean isValidDescription(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventDescription eventDescription = (EventDescription) obj;
        return Objects.equals(value, eventDescription.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
