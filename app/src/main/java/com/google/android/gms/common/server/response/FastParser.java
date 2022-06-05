package com.google.android.gms.common.server.response;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;

/* loaded from: classes.dex */
public final class FastParser<T> {
    private static final char[] a = {'u', 'l', 'l'};
    private static final char[] b = {'r', 'u', 'e'};
    private static final char[] c = {'r', 'u', 'e', '\"'};
    private static final char[] d = {'a', 'l', 's', 'e'};
    private static final char[] e = {'a', 'l', 's', 'e', '\"'};
    private static final char[] f = {'\n'};
    private static final ads<Integer> g = new adk();
    private static final ads<Long> h = new adl();
    private static final ads<Float> i = new adm();
    private static final ads<Double> j = new adn();
    private static final ads<Boolean> k = new ado();
    private static final ads<String> l = new adp();
    private static final ads<BigInteger> m = new adq();
    private static final ads<BigDecimal> n = new adr();
    private final char[] o = new char[1];
    private final char[] p = new char[32];
    private final char[] q = new char[1024];
    private final StringBuilder r = new StringBuilder(32);
    private final StringBuilder s = new StringBuilder(1024);
    private final Stack<Integer> t = new Stack<>();

    /* loaded from: classes.dex */
    public static class ParseException extends Exception {
    }
}
