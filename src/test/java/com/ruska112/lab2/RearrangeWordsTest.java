package com.ruska112.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RearrangeWordsTest {

    @Test
    public void rearrangeWordsTest0() {
        String result = RearrangeWords.rearrangeWords(" abc ");
        assertEquals(" abc ", result);
    }

    @Test
    public void rearrangeWordsTest1() {
        String result = RearrangeWords.rearrangeWords("abc");
        assertEquals("abc", result);
    }

    @Test
    public void rearrangeWordsTest2() {
        String result = RearrangeWords.rearrangeWords(" ab ac ");
        assertEquals(" ac ab ", result);
    }

    @Test
    public void rearrangeWordsTest3() {
        String result = RearrangeWords.rearrangeWords(" ab ac");
        assertEquals(" ac ab", result);
    }

    @Test
    public void rearrangeWordsTest4() {
        String result = RearrangeWords.rearrangeWords("ab ac ");
        assertEquals("ac ab ", result);
    }

    @Test
    public void rearrangeWordsTest5() {
        String result = RearrangeWords.rearrangeWords("ab ac");
        assertEquals("ac ab", result);
    }
}