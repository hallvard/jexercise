package no.hal.learning.exercise.adm.plots.util;

import difflib.DiffUtils;
import difflib.Patch;
import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.RelativeStringEdit;
import no.hal.learning.exercise.util.Util;

public class StringEditPatchAdapter extends StringEditAdapter<Patch> {

	public StringEditPatchAdapter() {
		super(Patch.class);
	}

	@Override
	public Patch<String> getStringEditAdapter(AbstractStringEditEvent editEvent) {
		AbstractStringEdit lastEdit = editEvent.getEdit();
		if (editEvent instanceof RelativeStringEdit) {
			AbstractStringEdit previousEdit = ((RelativeStringEdit) editEvent).getEdit();
			if (previousEdit != null) {
				String lastString = lastEdit.getString(), previousString = previousEdit.getString();
				return DiffUtils.diff(Util.splitLines(previousString), Util.splitLines(lastString));
			}
		}
		return null;
	}
}
