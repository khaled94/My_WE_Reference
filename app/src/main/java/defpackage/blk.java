package defpackage;

import android.content.Context;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: blk */
/* loaded from: classes2.dex */
public final class blk {
    public static bow<Integer> I;
    public static bow<Long> J;
    public static bow<Boolean> K;
    public static bow<Double> O;
    public static bow<Boolean> Q;
    public static bow<Boolean> R;
    public static bow<Boolean> S;
    public static bow<Boolean> T;
    public static bow<Boolean> U;
    public static bow<Boolean> V;
    public static bow<Boolean> W;
    public static bow<Boolean> X;
    public static bow<Boolean> Y;
    public static bow<Boolean> Z;
    static bve a;
    public static bow<Boolean> aA;
    public static bow<Boolean> aB;
    public static bow<Boolean> aC;
    public static bow<Boolean> aD;
    private static volatile bql aH;
    private static Boolean aI;
    private static bow<Boolean> aJ;
    private static bow<Boolean> aK;
    private static bow<Boolean> aL;
    private static bow<Boolean> aM;
    private static bow<Boolean> aN;
    public static bow<Boolean> aa;
    public static bow<Boolean> ab;
    public static bow<Boolean> ac;
    public static bow<Boolean> ad;
    public static bow<Boolean> ae;
    public static bow<Boolean> af;
    public static bow<Boolean> ag;
    public static bow<Boolean> ah;
    public static bow<Boolean> ai;
    public static bow<Boolean> aj;
    public static bow<Boolean> ak;
    public static bow<Boolean> al;
    public static bow<Boolean> am;
    public static bow<Boolean> an;
    public static bow<Boolean> ao;
    public static bow<Boolean> ap;
    public static bow<Boolean> aq;
    public static bow<Boolean> ar;
    public static bow<Boolean> as;
    public static bow<Boolean> at;
    public static bow<Boolean> au;
    public static bow<Boolean> av;
    public static bow<Boolean> aw;
    public static bow<Boolean> ax;
    public static bow<Boolean> ay;
    public static bow<Boolean> az;
    public static bow<Boolean> b;
    public static bow<Boolean> c;
    public static bow<Integer> p;
    private static List<bow<?>> aE = Collections.synchronizedList(new ArrayList());
    private static Set<bow<?>> aF = Collections.synchronizedSet(new HashSet());
    private static final aqw aG = new aqw(aqq.a("com.google.android.gms.measurement"));
    public static bow<String> d = a("measurement.log_tag", "FA", "FA-SVC", bng.a);
    public static bow<Long> e = a("measurement.ad_id_cache_time", 10000L, 10000L, bnt.a);
    public static bow<Long> f = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, bod.a);
    public static bow<Long> g = a("measurement.config.cache_time", 86400000L, 3600000L, boq.a);
    public static bow<String> h = a("measurement.config.url_scheme", "https", "https", bov.a);
    public static bow<String> i = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", blp.a);
    public static bow<Integer> j = a("measurement.upload.max_bundles", 100, 100, blo.a);
    public static bow<Integer> k = a("measurement.upload.max_batch_size", 65536, 65536, blr.a);
    public static bow<Integer> l = a("measurement.upload.max_bundle_size", 65536, 65536, blq.a);
    public static bow<Integer> m = a("measurement.upload.max_events_per_bundle", 1000, 1000, blt.a);
    public static bow<Integer> n = a("measurement.upload.max_events_per_day", 100000, 100000, bls.a);
    public static bow<Integer> o = a("measurement.upload.max_error_events_per_day", 1000, 1000, blv.a);
    public static bow<Integer> q = a("measurement.upload.max_conversions_per_day", 500, 500, blx.a);
    public static bow<Integer> r = a("measurement.upload.max_realtime_events_per_day", 10, 10, blw.a);
    public static bow<Integer> s = a("measurement.store.max_stored_events_per_app", 100000, 100000, bly.a);
    public static bow<String> t = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", bmc.a);
    public static bow<Long> u = a("measurement.upload.backoff_period", 43200000L, 43200000L, bmb.a);
    public static bow<Long> v = a("measurement.upload.window_interval", 3600000L, 3600000L, bme.a);
    public static bow<Long> w = a("measurement.upload.interval", 3600000L, 3600000L, bmd.a);
    public static bow<Long> x = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, bmg.a);
    public static bow<Long> y = a("measurement.upload.debug_upload_interval", 1000L, 1000L, bmf.a);
    public static bow<Long> z = a("measurement.upload.minimum_delay", 500L, 500L, bmi.a);
    public static bow<Long> A = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, bmh.a);
    public static bow<Long> B = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, bmk.a);
    public static bow<Long> C = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, bmm.a);
    public static bow<Long> D = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, bml.a);
    public static bow<Long> E = a("measurement.upload.retry_time", 1800000L, 1800000L, bmo.a);
    public static bow<Integer> F = a("measurement.upload.retry_count", 6, 6, bmn.a);
    public static bow<Long> G = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, bmq.a);
    public static bow<Integer> H = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, bmp.a);
    public static bow<String> L = a("measurement.test.string_flag", "---", "---", bmt.a);
    public static bow<Long> M = a("measurement.test.long_flag", -1L, -1L, bmv.a);
    public static bow<Integer> N = a("measurement.test.int_flag", -2, -2, bmy.a);
    public static bow<Integer> P = a("measurement.experiment.max_ids", 50, 50, bna.a);

    public static Map<String, String> a(Context context) {
        aqe a2 = aqe.a(context.getContentResolver(), aqq.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.a();
    }

    public static void a(bql bqlVar) {
        aH = bqlVar;
    }

    public static void a(Exception exc) {
        if (aH == null) {
            return;
        }
        Context m2 = aH.m();
        if (aI == null) {
            aI = Boolean.valueOf(uy.b().a(m2, uz.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0);
        }
        if (!aI.booleanValue()) {
            return;
        }
        aH.q().c.a("Got Exception on PhenotypeFlag.get on Play device", exc);
    }

    private static <V> bow<V> a(String str, V v2, V v3, box<V> boxVar) {
        bow<V> bowVar = new bow<>(str, v2, v3, boxVar, (byte) 0);
        aE.add(bowVar);
        return bowVar;
    }

    public static void a(bve bveVar) {
        a = bveVar;
    }

    static {
        Boolean bool = Boolean.FALSE;
        aJ = a("measurement.log_third_party_store_events_enabled", bool, bool, bln.a);
        Boolean bool2 = Boolean.FALSE;
        aK = a("measurement.log_installs_enabled", bool2, bool2, blm.a);
        Boolean bool3 = Boolean.FALSE;
        aL = a("measurement.log_upgrades_enabled", bool3, bool3, blz.a);
        Boolean bool4 = Boolean.FALSE;
        b = a("measurement.log_androidId_enabled", bool4, bool4, bmj.a);
        Boolean bool5 = Boolean.FALSE;
        c = a("measurement.upload_dsid_enabled", bool5, bool5, bmw.a);
        Integer valueOf = Integer.valueOf((int) SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
        p = a("measurement.upload.max_public_events_per_day", valueOf, valueOf, blu.a);
        Integer valueOf2 = Integer.valueOf((int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        I = a("measurement.audience.filter_result_max_count", valueOf2, valueOf2, bms.a);
        Long valueOf3 = Long.valueOf((long) CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        J = a("measurement.service_client.idle_disconnect_millis", valueOf3, valueOf3, bmr.a);
        Boolean bool6 = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool6, bool6, bmu.a);
        Double valueOf4 = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf4, valueOf4, bmx.a);
        Boolean bool7 = Boolean.FALSE;
        Q = a("measurement.validation.internal_limits_internal_event_params", bool7, bool7, bmz.a);
        Boolean bool8 = Boolean.TRUE;
        R = a("measurement.audience.dynamic_filters", bool8, bool8, bnd.a);
        Boolean bool9 = Boolean.FALSE;
        S = a("measurement.reset_analytics.persist_time", bool9, bool9, bnc.a);
        Boolean bool10 = Boolean.TRUE;
        T = a("measurement.validation.value_and_currency_params", bool10, bool10, bnf.a);
        Boolean bool11 = Boolean.FALSE;
        U = a("measurement.sampling.time_zone_offset_enabled", bool11, bool11, bne.a);
        Boolean bool12 = Boolean.FALSE;
        V = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", bool12, bool12, bnh.a);
        Boolean bool13 = Boolean.TRUE;
        W = a("measurement.fetch_config_with_admob_app_id", bool13, bool13, bnj.a);
        Boolean bool14 = Boolean.FALSE;
        X = a("measurement.client.sessions.session_id_enabled", bool14, bool14, bni.a);
        Boolean bool15 = Boolean.FALSE;
        Y = a("measurement.service.sessions.session_number_enabled", bool15, bool15, bnl.a);
        Boolean bool16 = Boolean.FALSE;
        Z = a("measurement.client.sessions.immediate_start_enabled_foreground", bool16, bool16, bnk.a);
        Boolean bool17 = Boolean.FALSE;
        aa = a("measurement.client.sessions.background_sessions_enabled", bool17, bool17, bnn.a);
        Boolean bool18 = Boolean.FALSE;
        ab = a("measurement.client.sessions.remove_expired_session_properties_enabled", bool18, bool18, bnm.a);
        Boolean bool19 = Boolean.FALSE;
        ac = a("measurement.service.sessions.session_number_backfill_enabled", bool19, bool19, bnp.a);
        Boolean bool20 = Boolean.FALSE;
        ad = a("measurement.service.sessions.remove_disabled_session_number", bool20, bool20, bno.a);
        Boolean bool21 = Boolean.TRUE;
        ae = a("measurement.collection.firebase_global_collection_flag_enabled", bool21, bool21, bnr.a);
        Boolean bool22 = Boolean.FALSE;
        af = a("measurement.collection.efficient_engagement_reporting_enabled", bool22, bool22, bnq.a);
        Boolean bool23 = Boolean.FALSE;
        ag = a("measurement.collection.redundant_engagement_removal_enabled", bool23, bool23, bns.a);
        Boolean bool24 = Boolean.TRUE;
        ah = a("measurement.personalized_ads_signals_collection_enabled", bool24, bool24, bnv.a);
        Boolean bool25 = Boolean.TRUE;
        ai = a("measurement.personalized_ads_property_translation_enabled", bool25, bool25, bnu.a);
        Boolean bool26 = Boolean.TRUE;
        aj = a("measurement.collection.init_params_control_enabled", bool26, bool26, bnx.a);
        Boolean bool27 = Boolean.TRUE;
        ak = a("measurement.upload.disable_is_uploader", bool27, bool27, bnw.a);
        Boolean bool28 = Boolean.TRUE;
        al = a("measurement.experiment.enable_experiment_reporting", bool28, bool28, bnz.a);
        Boolean bool29 = Boolean.TRUE;
        am = a("measurement.collection.log_event_and_bundle_v2", bool29, bool29, bny.a);
        Boolean bool30 = Boolean.TRUE;
        an = a("measurement.collection.null_empty_event_name_fix", bool30, bool30, bob.a);
        Boolean bool31 = Boolean.FALSE;
        ao = a("measurement.audience.sequence_filters", bool31, bool31, boa.a);
        Boolean bool32 = Boolean.FALSE;
        aM = a("measurement.audience.sequence_filters_bundle_timestamp", bool32, bool32, boe.a);
        Boolean bool33 = Boolean.FALSE;
        ap = a("measurement.quality.checksum", bool33, bool33, null);
        Boolean bool34 = Boolean.TRUE;
        aq = a("measurement.module.collection.conditionally_omit_admob_app_id", bool34, bool34, bog.a);
        Boolean bool35 = Boolean.FALSE;
        ar = a("measurement.sdk.dynamite.use_dynamite2", bool35, bool35, bof.a);
        Boolean bool36 = Boolean.FALSE;
        as = a("measurement.sdk.dynamite.allow_remote_dynamite", bool36, bool36, boi.a);
        Boolean bool37 = Boolean.FALSE;
        at = a("measurement.sdk.collection.validate_param_names_alphabetical", bool37, bool37, boh.a);
        Boolean bool38 = Boolean.FALSE;
        au = a("measurement.collection.event_safelist", bool38, bool38, bok.a);
        Boolean bool39 = Boolean.FALSE;
        av = a("measurement.service.audience.scoped_filters_v27", bool39, bool39, boj.a);
        Boolean bool40 = Boolean.FALSE;
        aw = a("measurement.service.audience.session_scoped_event_aggregates", bool40, bool40, bom.a);
        Boolean bool41 = Boolean.FALSE;
        ax = a("measurement.service.audience.session_scoped_user_engagement", bool41, bool41, bol.a);
        Boolean bool42 = Boolean.FALSE;
        ay = a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", bool42, bool42, boo.a);
        Boolean bool43 = Boolean.FALSE;
        az = a("measurement.sdk.collection.retrieve_deeplink_from_bow", bool43, bool43, bon.a);
        Boolean bool44 = Boolean.FALSE;
        aA = a("measurement.app_launch.event_ordering_fix", bool44, bool44, bop.a);
        Boolean bool45 = Boolean.FALSE;
        aB = a("measurement.sdk.collection.last_deep_link_referrer", bool45, bool45, bos.a);
        Boolean bool46 = Boolean.FALSE;
        aN = a("measurement.sdk.collection.last_deep_link_referrer_campaign", bool46, bool46, bor.a);
        Boolean bool47 = Boolean.FALSE;
        aC = a("measurement.sdk.collection.last_gclid_from_referrer", bool47, bool47, bou.a);
        Boolean bool48 = Boolean.FALSE;
        aD = a("measurement.upload.file_lock_state_check", bool48, bool48, bot.a);
    }
}
