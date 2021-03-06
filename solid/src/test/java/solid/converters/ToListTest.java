package solid.converters;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static test_utils.AssertIterableEquals.assertIterableEquals;

public class ToListTest {
    @Test
    public void testToList() throws Exception {
        assertIterableEquals(Arrays.asList(1, 2, 3), ToList.<Integer>toList().call(Arrays.asList(1, 2, 3)));
        assertIterableEquals(Collections.<Integer>emptyList(), ToList.<Integer>toList().call(Collections.<Integer>emptyList()));
    }

    @Test
    public void testNewAndCall() throws Exception {
        assertIterableEquals(Arrays.asList(1, 2, 3), new ToList<Integer>().call(Arrays.asList(1, 2, 3)));
        assertIterableEquals(Collections.<Integer>emptyList(), new ToList<Integer>().call(Collections.<Integer>emptyList()));
    }
}