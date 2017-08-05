package com.ingthor.arrays_and_strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 06/04/2017.
 */
class StringCompression_1_6Test {
    @Test
    void compressString() {
        String toCompress = "aabcccehee";
        String compressed = StringCompression_1_6.CompressString(toCompress);
        Assert.assertTrue(Objects.equals(compressed, "a2bc3ehe2"));
    }

}