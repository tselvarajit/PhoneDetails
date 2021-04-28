package org.phone;

public class InternalStorage {
private void processorName() {
System.out.println("Processor Name Intel");
}
private void ramsize() {
System.out.println("Ramsize 8Gb");
}
public static void main(String[] args) {
//	ExternalStorage ab = new ExternalStorage ();
//	ab.Size();
	InternalStorage cd = new InternalStorage ();
	cd.processorName();
	cd.ramsize();
	cd.ramsize();
}
}
