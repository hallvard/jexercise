package no.hal.confluence.ui.actions;

import java.util.Collection;

public interface PostActionHook<T> {
	public void postActionHook(Collection<T> actionElements);
}
