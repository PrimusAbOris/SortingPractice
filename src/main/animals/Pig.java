package main.animals;

import java.io.Serializable;

public class Pig implements Comparable<Pig>, Serializable {
	private String name;
	private String status;

	public Pig(String name, String status) {
		this.name = name;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public int compareTo(Pig that) {
		return this.name.compareTo(that.name); // this will sort names in asc order
	}
}
