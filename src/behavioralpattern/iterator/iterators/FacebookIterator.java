package behavioralpattern.iterator.iterators;

import behavioralpattern.iterator.collections.Facebook;
import behavioralpattern.iterator.collections.Profile;
import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;

    private String type;

    private String email;

    private int currentPosition = 0;

    private List<String> emails;

    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
        this.emails = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
        for (String friendEmail : emails) {
            Profile friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            this.profiles.add(friendProfile);
        }
    }

    @Override
    public boolean hasNext() {
        return this.currentPosition < this.emails.size();
    }

    @Override
    public Profile getNext() {
        if (!this.hasNext()) {
            return null;
        }
        this.currentPosition++;
        return this.profiles.get(currentPosition - 1);
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
