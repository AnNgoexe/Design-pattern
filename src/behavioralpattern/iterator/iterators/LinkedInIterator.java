package behavioralpattern.iterator.iterators;

import behavioralpattern.iterator.collections.LinkedIn;
import behavioralpattern.iterator.collections.Profile;
import java.util.ArrayList;
import java.util.List;

public class LinkedInIterator implements ProfileIterator {
    private LinkedIn linkedIn;

    private String type;

    private String email;

    private int currentPosition = 0;

    private List<String> emails;

    private List<Profile> contacts = new ArrayList<>();

    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
        this.emails = linkedIn.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
        for (String friendEmail : emails) {
            Profile friendContact = linkedIn.requestContactInfoFromLinkedInAPI(friendEmail);
            this.contacts.add(friendContact);
        }
    }

    @Override
    public boolean hasNext() {
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }
        currentPosition++;
        return this.contacts.get(currentPosition - 1);
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
