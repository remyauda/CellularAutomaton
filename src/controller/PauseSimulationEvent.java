package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.SimulationState;
import vue.MainWindow;

public class PauseSimulationEvent implements ActionListener {
	
	/******ATTRIBUTES******/
	MainWindow window;
	
	
	/**
	 * ****CONSTRUCTOR*****.
	 */
	public PauseSimulationEvent(MainWindow window) {
		super();
		this.window = window;
		
	}

	
	/**
	 * ****CLASS METHODS*****.
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.window.setm_simulationState(SimulationState.PAUSE);;	
	}

}
