package exer1.exer1_1;

public class HelloWorldPrinterFactory implements AbstractWorldPrinterFactory {
	public static final String SCREEN = "screen";
	public static final String FILE = "file";
	@Override
	public WorldPrinter getPrinterInstance(String printerType) {
		switch(printerType) {
		case SCREEN:
			return new HelloWorldPrinterFile();
		case FILE:
			return new HelloWorldPrinterScreen();
		}
		return null;
	}

}
