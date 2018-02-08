
class Snake {
	int viciousness;
	boolean venomous;

	Snake(int viciousness, boolean venomous) {
		this.venomous=venomous;
		this.viciousness=viciousness;
	}

	int getViciousness() {
		return viciousness;
	}

	void setViciousness(int vic) {
		vic = viciousness;
	}

	boolean getVenomous() {
		return venomous;
	}

	void setVenomous(boolean ven) {
		ven = venomous;
	}
}