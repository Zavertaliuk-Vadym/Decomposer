import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 11/4/16.
 */
public class DecomposerTest {

    @Test
    public void whereYouEnteredOne(){
        assertThat(1, is(Decomposer.add(1)));
    }
}