package no.hal.sharing;

public class LoopbackSharingTransport extends AbstractSharingTransport implements SharingTransport {

	@Override
	public void publishResource(SharedResource shared) {
		fireReceived(new SharedBytes(shared.key, shared.from, shared.to, shared.getPath(), shared.getContents()));
	}
}
