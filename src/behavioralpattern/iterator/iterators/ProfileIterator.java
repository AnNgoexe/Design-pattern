package behavioralpattern.iterator.iterators;

import behavioralpattern.iterator.collections.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}