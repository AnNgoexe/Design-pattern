package behavioralpattern.iterator.collections;

import behavioralpattern.iterator.iterators.FacebookIterator;
import behavioralpattern.iterator.iterators.ProfileIterator;
import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    public Profile requestProfileFromFacebook(String profileEmail) {
        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");
        return this.findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
        Profile profile = this.findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }

}
