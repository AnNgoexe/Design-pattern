package behavioralpattern.iterator;

import behavioralpattern.iterator.collections.Profile;
import behavioralpattern.iterator.collections.SocialNetwork;
import behavioralpattern.iterator.iterators.ProfileIterator;

public class SocialSpammer {
    private SocialNetwork network;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over friends...\n");
        ProfileIterator iterator = this.network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\nIterating over coworkers...\n");
        ProfileIterator iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }
}
