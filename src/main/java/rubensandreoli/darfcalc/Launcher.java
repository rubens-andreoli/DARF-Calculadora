package rubensandreoli.darfcalc;

import rubensandreoli.darfcalc.gui.MainFrame;

public class Launcher {

    public static void main(String args[]) {

	java.awt.EventQueue.invokeLater(() -> {
	    new MainFrame().setVisible(true);
	});
    }
}
