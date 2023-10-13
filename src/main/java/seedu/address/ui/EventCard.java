package seedu.address.ui;

import java.time.format.DateTimeFormatter;
//import java.util.Comparator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.event.Event;

/**
 * A UI component that displays information of a {@code event}.
 */
public class EventCard extends UiPart<Region> {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    private static final String FXML = "eventListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Event event;

    @FXML
    private HBox cardPane;
    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private Label timeStart;
    @FXML
    private Label timeEnd;
    @FXML
    private Label clients;
    @FXML
    private Label location;
    @FXML
    private Label description;
    @FXML
    private FlowPane tags;

    /**
     * Creates a {@code eventCode} with the given {@code event} and index to display.
     */
    public EventCard(Event event, int displayedIndex) {
        super(FXML);
        this.event = event;
        id.setText(displayedIndex + ". ");
        name.setText(event.getName().eventName);
        clients.setText(event.getClients().toString());
        timeStart.setText(event.getTimeStart().toString());
        timeEnd.setText(event.getTimeEnd().toString());
        location.setText(event.getLocation().toString());
        description.setText(event.getDescription().toString());

    }
}