package com.ucare.we.model.suspendandresume;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SuspendAndResumeReasonAndDurationResponse implements Parcelable {
    public static final Parcelable.Creator<SuspendAndResumeReasonAndDurationResponse> CREATOR = new Parcelable.Creator<SuspendAndResumeReasonAndDurationResponse>() { // from class: com.ucare.we.model.suspendandresume.SuspendAndResumeReasonAndDurationResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuspendAndResumeReasonAndDurationResponse createFromParcel(Parcel parcel) {
            return new SuspendAndResumeReasonAndDurationResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuspendAndResumeReasonAndDurationResponse[] newArray(int i) {
            return new SuspendAndResumeReasonAndDurationResponse[i];
        }
    };
    @cqh(a = "corp_suspend")
    @cqf
    private ArrayList<Suspend> corpSuspend;
    @cqh(a = "corp_durations")
    @cqf
    private ArrayList<SuspendAndResumeDuration> corp_durations;
    @cqh(a = "durations")
    @cqf
    private ArrayList<SuspendAndResumeDuration> durations;
    @cqh(a = "resume")
    @cqf
    private ArrayList<Resume> resume;
    @cqh(a = "suspend")
    @cqf
    private ArrayList<Suspend> suspend;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SuspendAndResumeReasonAndDurationResponse() {
        this.suspend = null;
        this.corpSuspend = null;
        this.resume = null;
        this.durations = null;
        this.corp_durations = null;
    }

    protected SuspendAndResumeReasonAndDurationResponse(Parcel parcel) {
        this.suspend = null;
        this.corpSuspend = null;
        this.resume = null;
        this.durations = null;
        this.corp_durations = null;
        this.suspend = parcel.createTypedArrayList(Suspend.CREATOR);
        this.corpSuspend = parcel.createTypedArrayList(Suspend.CREATOR);
        this.resume = parcel.createTypedArrayList(Resume.CREATOR);
        this.durations = parcel.createTypedArrayList(SuspendAndResumeDuration.CREATOR);
        this.corp_durations = parcel.createTypedArrayList(SuspendAndResumeDuration.CREATOR);
    }

    public static Parcelable.Creator<SuspendAndResumeReasonAndDurationResponse> getCREATOR() {
        return CREATOR;
    }

    public ArrayList<SuspendAndResumeDuration> getCorp_durations() {
        return this.corp_durations;
    }

    public void setCorp_durations(ArrayList<SuspendAndResumeDuration> arrayList) {
        this.corp_durations = arrayList;
    }

    public ArrayList<Suspend> getSuspend() {
        return this.suspend;
    }

    public void setSuspend(ArrayList<Suspend> arrayList) {
        this.suspend = arrayList;
    }

    public ArrayList<Resume> getResume() {
        return this.resume;
    }

    public void setResume(ArrayList<Resume> arrayList) {
        this.resume = arrayList;
    }

    public ArrayList<SuspendAndResumeDuration> getDurations() {
        return this.durations;
    }

    public void setDurations(ArrayList<SuspendAndResumeDuration> arrayList) {
        this.durations = arrayList;
    }

    public ArrayList<Suspend> getCorpSuspend() {
        return this.corpSuspend;
    }

    public void setCorpSuspend(ArrayList<Suspend> arrayList) {
        this.corpSuspend = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.suspend);
        parcel.writeTypedList(this.corpSuspend);
        parcel.writeTypedList(this.resume);
        parcel.writeTypedList(this.durations);
        parcel.writeTypedList(this.corp_durations);
    }
}
