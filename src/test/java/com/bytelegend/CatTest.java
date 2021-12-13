package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsStringIgnoringCase("My name is abcdef"));
        Cat.createNewCat("ABCDEF").sayName();
    }
}
