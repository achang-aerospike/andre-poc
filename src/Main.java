import com.aerospike.client.AerospikeClient;

public class Main {
	private static final Test[] tests = new Test[] {
			new Put(),
			new Get()
	};

	public static void init() {
		Parameters params = new Parameters();
		params.host = "192.168.56.10";
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
