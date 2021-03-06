package bp.eventSets;

import bp.BEvent;
import bp.exceptions.BPJRequestableSetException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * An interface for what can be requested in bSync call. Currently only facades
 * Iterable<Event>, future implementations may have complex iterators
 */
public interface RequestableInterface extends Iterable<RequestableInterface>, EventSetInterface {

    List<BEvent> getEventList();
}
