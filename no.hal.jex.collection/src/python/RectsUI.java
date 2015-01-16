package python;

import java.util.Scanner;

class RectsUI {

	RectsCore rectsCore = new RectsCore();
	
	void main() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		    System.out.println("Rect1: " + rectsCore.rectangle2String(rectsCore.r1x1, rectsCore.r1y1, rectsCore.r1x2, rectsCore.r1y2));
		    System.out.println("Rect2: " + rectsCore.rectangle2String(rectsCore.r2x1, rectsCore.r2y1, rectsCore.r2x2, rectsCore.r2y2));
		    System.out.print(" > ");
		    String token = scanner.nextLine();
		    if (token.equals("overlaps?")) {
		    		System.out.println(rectsCore.rectanglesOverlap());
		    } else if (token.equals("exit")) {
		        break;
		    } else {
		        int pos = token.indexOf("=");
		        if (pos >= 4) {
		            int val = Integer.valueOf(token.substring(pos + 1).trim());
		            if (token.startsWith("r1x1")) {
		            	rectsCore.r1x1 = val;
		            } else if (token.startsWith("r1y1")) {
		            	rectsCore.r1y1 = val;
		            } else if (token.startsWith("r1x2")) {
		            	rectsCore.r1x2 = val;
		            } else if (token.startsWith("r1y2")) {
		            	rectsCore.r1y2 = val;
		            } else if (token.startsWith("r2x1")) {
		            	rectsCore.r2x1 = val;
		            } else if (token.startsWith("r2y1")) {
		            	rectsCore.r2y1 = val;
		            } else if (token.startsWith("r2x2")) {
		            	rectsCore.r2x2 = val;
		            } else if (token.startsWith("r2y2")) {
		            	rectsCore.r2y2 = val;
		            }
		        }
		    }
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new RectsUI().main();
	}
}
