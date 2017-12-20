package no.hal.learning.exercise;

public interface TaskEventsAdapter<A extends TaskAnswer> {

	/**
	 * Tells of a specific TaskAnswer is supported.
	 * @param type
	 * @return
	 */
	public boolean supportsTaskAnswer(TaskAnswer type);

	/**
	 * Returns the TaskProposal that this adapter is attached to. 
	 * @return
	 */
	public TaskProposal<A> getTaskProposal();
}
