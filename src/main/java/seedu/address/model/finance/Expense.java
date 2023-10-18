package seedu.address.model.finance;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.commons.util.ToStringBuilder;

/**
 * Represents an expense incurred by the user.
 */
public class Expense extends Finance {

    private Amount amount;
    private ClientName client;
    private Description description;

    /**
     * Constructs an Expense object with the specified amount, client, and description.
     *
     * @param amount      The amount of the expense
     * @param client      The client or payee associated with the expense
     * @param description A description of the exoense
     */
    public Expense(Amount amount, ClientName client, Description description) {
        requireAllNonNull(amount, description);
        this.amount = amount;
        this.client = client;
        this.description = description;
    }

    /**
     * Get the amount of the expense.
     *
     * @return The amount of the expense.
     */
    @Override
    public Amount getAmount() {
        return amount;
    }

    /**
     * Get the client or payee associated with the expense.
     *
     * @return The client or payee associated with the expense.
     */
    @Override
    public ClientName getClient() {
        return client;
    }

    @Override
    public Description getDescription() {
        return description;
    }

    /**
     * Returns true if two expenses have the same fields.
     * This is a less strict equals that is used for testing.
     */
    public boolean haveSameFields(Expense expense) {
        return amount.equals(expense.getAmount())
                && client.equals((expense.getClient()))
                && description.equals(expense.getDescription());
    }

    /**
     * Returns true if they are the same instance.
     */
    @Override
    public boolean equals(Object other) {
        return this == other;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("client", client)
                .add("amount", amount)
                .add("description", description)
                .toString();
    }
}