import common.Console;
import common.Parameters;
import common.Util;

public class Main {
	private static final Test[] tests = new Test[] {
			new Put(),
			new Get(),
			new TestInfo(),
	};

	public static void init() {
		Parameters params = new Parameters();
		params.host = "192.168.56.10";
		//params.host = "127.0.0.1";
		//params.host = "3.134.111.24";
		//params.host = "18.217.82.47";
		params.port = 3000;
		Util.SetParams(params);

		Console console = Util.GetConsole();
		console.info("Hello world!");
	}

	public static void main(String[] args) {
		init();
		for (Test test : tests) {
			test.Run();
		}
	}

}
