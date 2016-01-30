package no.hal.learning.sharing.runtime.mqtt;

import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.runtime.AbstractSharingTransport;
import no.hal.learning.sharing.runtime.SharingTransport;

public class LoopbackSharingTransport extends AbstractSharingTransport implements SharingTransport {

	@Override
	public void publish(AbstractShare share) {
		byte[] byteArray = toByteArray(share);
		if (byteArray != null) {
			AbstractShare copy = fromByteArray(share.getName(), byteArray);
			if (copy != null) {
				fireReceived(copy);
			}
		}
	}
}
