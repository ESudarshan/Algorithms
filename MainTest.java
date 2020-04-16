import static org.esudarshan.Main.createApiVersionMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.esudarshan.Main.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MainTest {

	@Test
	@DisplayName("Testing createApiVersionMap method")
	void testCreateApiVersionMap() {
		List<Record> records = Arrays.asList(new Record("app1", "api1", 1), new Record("app2", "api1", 2));
		Map<String, Integer> apiVersionMap = createApiVersionMap(records);
		int expected = 2;
		int actual = apiVersionMap.get("api1");
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Testing getOldAPIClients method")
	void testGetOldAPIClients() {
		List<Record> records = Arrays.asList(new Record("app1", "api1", 2), new Record("app2", "api1", 1));
		Map<String, Integer> apiVersionMap = createApiVersionMap(records);
		Set<String> expected = new HashSet<>(Arrays.asList("app2"));
		Set<String> actual = getOldAPIClients(records, apiVersionMap);
		assertEquals(expected, actual);

	}

}
