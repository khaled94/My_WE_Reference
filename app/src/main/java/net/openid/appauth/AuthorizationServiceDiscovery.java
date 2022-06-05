package net.openid.appauth;

import defpackage.dzx;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class AuthorizationServiceDiscovery {
    static final dzx.d a = new dzx.d("issuer", (byte) 0);
    static final dzx.f b = a("authorization_endpoint");
    static final dzx.f c = a("token_endpoint");
    static final dzx.f d = a("userinfo_endpoint");
    static final dzx.f e = a("jwks_uri");
    static final dzx.f f = a("registration_endpoint");
    static final dzx.e g = b("scopes_supported");
    static final dzx.e h = b("response_types_supported");
    static final dzx.e i = b("response_modes_supported");
    static final dzx.e j = a("grant_types_supported", Arrays.asList("authorization_code", "implicit"));
    static final dzx.e k = b("acr_values_supported");
    static final dzx.e l = b("subject_types_supported");
    static final dzx.e m = b("id_token_signing_alg_values_supported");
    static final dzx.e n = b("id_token_encryption_enc_values_supported");
    static final dzx.e o = b("id_token_encryption_enc_values_supported");
    static final dzx.e p = b("userinfo_signing_alg_values_supported");
    static final dzx.e q = b("userinfo_encryption_alg_values_supported");
    static final dzx.e r = b("userinfo_encryption_enc_values_supported");
    static final dzx.e s = b("request_object_signing_alg_values_supported");
    static final dzx.e t = b("request_object_encryption_alg_values_supported");
    static final dzx.e u = b("request_object_encryption_enc_values_supported");
    static final dzx.e v = a("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));
    static final dzx.e w = b("token_endpoint_auth_signing_alg_values_supported");
    static final dzx.e x = b("display_values_supported");
    static final dzx.e y = a("claim_types_supported", Collections.singletonList("normal"));
    static final dzx.e z = b("claims_supported");
    static final dzx.f A = a("service_documentation");
    static final dzx.e B = b("claims_locales_supported");
    static final dzx.e C = b("ui_locales_supported");
    static final dzx.a D = a("claims_parameter_supported", false);
    static final dzx.a E = a("request_parameter_supported", false);
    static final dzx.a F = a("request_uri_parameter_supported", true);
    static final dzx.a G = a("require_request_uri_registration", false);
    static final dzx.f H = a("op_policy_uri");
    static final dzx.f I = a("op_tos_uri");
    private static final List<String> J = Arrays.asList(a.a, b.a, e.a, h.a, l.a, m.a);

    /* loaded from: classes2.dex */
    public static class MissingArgumentException extends Exception {
    }

    private static dzx.f a(String str) {
        return new dzx.f(str, (byte) 0);
    }

    private static dzx.e b(String str) {
        return new dzx.e(str);
    }

    private static dzx.e a(String str, List<String> list) {
        return new dzx.e(str, list);
    }

    private static dzx.a a(String str, boolean z2) {
        return new dzx.a(str, z2);
    }
}
