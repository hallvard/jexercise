package no.hal.jex.jextest.extensions;

import java.util.NoSuchElementException;

public interface IndexedCollection<T> {
	T getElement(int pos) throws NoSuchElementException;
}
