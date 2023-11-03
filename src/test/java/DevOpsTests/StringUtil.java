package DevOpsTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtil {
	
	String str;

	@Test
	void isNullOrEmpty() {
		String s="";
		assertEquals("",s);
		assertEquals(null,str);
	}
}
