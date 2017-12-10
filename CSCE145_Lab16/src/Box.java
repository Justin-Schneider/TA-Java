
public class Box {

		String label; 
		double length;
		double width;
		double height;
		
		public Box() {
			label = "";
			length = 0.0;
			width = 0.0;
			height = 0.0;
		}
		public Box(String label, double length, double width, double height) {
			this.label = label;
			if(length > 0) this.length = length;
			if(width > 0) this.width = width;
			if(height > 0) this.height = height;
		}
		
		public String getLabel() {
			return label;
		}
		public double getLength() {
			return length;
		}
		public double getWidth() {
			return width;
		}
		public double getHeight() {
			return height;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public void setLength(double length) {
			if(length > 0) this.length = length;
		}
		public void setWidth(double width) {
			if(width > 0) this.width = width;
		}
		public void setHeight(double height) {
			if(height > 0) this.height = height;
		}
		
		public double getVolume() {
			return (getLength() * getWidth() * getHeight());
		}
		
		public String toString() {
			return "Label: " + getLabel() + " Volume: " + getVolume();
		}
		
}
