public class Software extends Product {
	private String version;

	public Software() {
		super();

	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public int getCount() {
		int count = super.getCount();
		count++;
		return count;
	}

	@Override
	public String toString() {
		return super.toString() + "Version: " + version + "\n";
	}
}
