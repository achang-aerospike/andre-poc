import com.aerospike.client.AerospikeClient;

public class Main {
	private static final Test[] tests = new Test[] {
			new Put()
	};

	public static void init() {
		Console console = new Console();
		console.info("Hello world!");

		Parameters params = new Parameters();
		params.host = "192.168.56.10";
		params.port = 3000;

		Util util = new Util(console, params);
		AerospikeClient client = util.GetClient();
	}

	public static void main(String[] args) {
		init();
		for (Test test : tests) {
			test.Run();
		}
	}

}
