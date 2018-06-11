package top.leagle.refactoring.chapter8.duplicate.observed.data.improvement;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

public class IntervalWindow extends Frame implements Observer {
	private static final long serialVersionUID = 1L;
	private Interval subject;

	TextField startField = new TextField();
	TextField endField = new TextField();
	TextField lengthField = new TextField();

	void initial() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(800, 600);
		Label startLabel = new Label("start");
		add(startLabel);

		Label endLabel = new Label("end");
		add(endLabel);

		Label lengthLabel = new Label("length");
		add(lengthLabel);

		startField.setSize(100, 20);
		add(startField);
		endField.setSize(100, 20);
		add(endField);
		lengthField.setSize(100, 20);
		add(lengthField);
		setVisible(true);

		startField.addFocusListener(new SymFocus());
		endField.addFocusListener(new SymFocus());
		lengthField.addFocusListener(new SymFocus());

		subject = new Interval();
		subject.addObserver(this);
		update(subject, null);
	}

	class SymFocus extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			Object object = e.getSource();
			if (object == startField) {
				StartField_FocusLost(e);
			} else if (object == endField) {
				EndField_FocusLost(e);
			} else if (object == lengthField) {
				LengthField_FocusLost(e);
			}
		}
	}

	void StartField_FocusLost(FocusEvent event) {
		setStart(startField.getText());
		if (!getStart().equals("")) {
			System.out.println("startField");
			subject.calculateLength();
		}
	}

	void EndField_FocusLost(FocusEvent event) {
		setEnd(endField.getText());
		if (!getEnd().equals("")) {
			System.out.println("endField");
			subject.calculateLength();
		}
	}

	void LengthField_FocusLost(FocusEvent event) {
		setLength(lengthField.getText());
		if (!getLength().equals("")) {
			System.out.println("lengthField");
			subject.calculateEnd();
		}
	}

	public static void main(String[] args) {
		IntervalWindow intervalWindow = new IntervalWindow();
		intervalWindow.initial();
	}

	@Override
	public void update(Observable o, Object arg) {
		startField.setText(subject.getStart());
		endField.setText(subject.getEnd());
		lengthField.setText(subject.getLength());
	}

	public String getEnd() {
		return subject.getEnd();
	}

	public void setEnd(String end) {
		subject.setEnd(end);
	}

	public String getStart() {
		return subject.getStart();
	}

	public void setStart(String start) {
		subject.setStart(start);
	}

	public String getLength() {
		return subject.getLength();
	}

	public void setLength(String length) {
		subject.setLength(length);
	}

}
