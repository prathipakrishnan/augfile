package org.phone;

public class InternalStorage {
private void processorName() {
	System.out.println("RAM");
}
private void ramSize() {
	System.out.println("39GB");
}
public static void main(String[] args) {
	InternalStorage i = new InternalStorage();
	ExternalStorage e = new ExternalStorage();
	i.processorName();
	i.ramSize();
	e.size();
}
}
