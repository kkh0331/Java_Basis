package day05.practice01;

import java.awt.*;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Report {

    public void reportBy(List<PrintStatusAble> trashMachines) throws IOException {
    	printTitle();
        printTrashMachineStatus(trashMachines);
		printFooter();
	}

	private static void printFooter() throws IOException {
		System.out.println("====================");
	}

	private void printTitle() throws IOException {
		System.out.println("< FACTORY REPORT >");
	}

	private void printTrashMachineStatus(List<PrintStatusAble> trashMachine)
			throws IOException {
		for (PrintStatusAble printStatusAble : trashMachine) {
			printStatusAble.printStatus();
		}
	}
	
	public static void main(String[] args) throws IOException {
		TrashMachine trashMachine1 = new TrashMachine("Machine1", new Basket("Basket1"), new Location("Location 1"));
		TrashMachine trashMachine2 = new TrashMachine("Machine2", new Basket("Basket2"), new Location("Location 2"));
		TrashMachine trashMachine3 = new TrashMachine("Machine3", new Basket("Basket3"), new Location("Location 3"));

		TrashRobot trashRobot = new TrashRobot(new Location("BASE"));
		trashRobot.moveTo(trashMachine2);
		trashRobot.getBasketFrom(trashMachine2);

		List<PrintStatusAble> trashMachines = new ArrayList<>();
		trashMachines.add(trashMachine1);
		trashMachines.add(trashMachine2);
		trashMachines.add(trashMachine3);
		trashMachines.add(trashRobot);

		Report report = new Report();
		report.reportBy(trashMachines);
	}

}