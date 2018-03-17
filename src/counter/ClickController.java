package counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the Counter buttons user interface.
 * 
 * @author Kanchanok Kannee
 *
 */
public class ClickController {
	@FXML
	private Button plusbutton;
	@FXML
	private Button minusbutton;
	/** The counter that records button clicks. */
	private Counter counter;

	/**
	 * Set a reference to the Counter.
	 * 
	 * @param counter
	 *            that records button clicks.
	 */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	/**
	 * The button handler methods to add +1 to the counter.
	 * 
	 * @param event is a event of a user.
	 */
	public void plusButtonHandler(ActionEvent event) {
		counter.add(1);
		System.out.println("TODO: add 1 to counter and delete this pritnln");
	}

	/**
	 * The button handler methods to add -1 to the counter.
	 * 
	 * @param event is a event of a user.
	 */
	public void minusButtonHandler(ActionEvent event) {
		counter.add(-1);
		System.out.println("TODO: add -1 to counter and delete this pritnln");
	}
}
