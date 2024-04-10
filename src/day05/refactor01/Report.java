package day05.refactor01;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Report {

    public void report(Writer out, List<Machine> machines, Robot robot) throws IOException {
    	printTitle(out);
        printMachineStatus(out, machines);
        printRobotStatus(out, robot);
		printFooter(out);
	}

	private static void printFooter(Writer out) throws IOException {
		out.write("====================\n");
	}

	private static void printRobotStatus(Writer out, Robot robot) throws IOException {
//		out.write("Robot");
		out.write(robot.toString());
//		out.write("\n");
	}

	private void printTitle(Writer out) throws IOException {
		out.write("< FACTORY REPORT >\n");
	}

	private void printMachineStatus(Writer out, List<Machine> machines)
			throws IOException {

		for ( Machine machine : machines) {
			out.write(machine.toString());
		}

        out.write("\n");
	}
	
	public static void main(String[] args) throws IOException {
		
		Writer out = new OutputStreamWriter(System.out);
		
		Machine machine1= new Machine("name1");
		Machine machine2= new Machine("name2");
		Machine machine3= new Machine("name3");
		
		machine1.putBasket("basket1");
		machine2.putBasket("basket2");
		machine3.putBasket("basket3");
		
		List<Machine> machines = new ArrayList<Machine>();
		
		machines.add(machine1);
		machines.add(machine2);
		machines.add(machine3);
		
		
				
		Robot robot = new Robot();
		robot.moveToMachine(machine2);
		robot.pickBasket();
		
		
		Report report = new Report();
		report.report(out, machines, robot);
		
		out.close();
		
		
	}

}