package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import ivas.gov.bisp.enumeration.F.A;
import ivas.gov.bisp.enumeration.F.D;
import ivas.gov.bisp.enumeration.F.U;
import ivas.gov.bisp.enumeration.F.W;
import ivas.gov.bisp.enumeration.F.ai;
import ivas.gov.bisp.enumeration.F.al;
import ivas.gov.bisp.enumeration.OoooOOo.o000000O;
import ivas.gov.bisp.enumeration.OoooOoO.o000OOo0;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p016ap.ao;
import ivas.gov.bisp.enumeration.p016ap.ar;
import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p027b.ah;
import ivas.gov.bisp.enumeration.p027b.an;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ivas.gov.bisp.enumeration.p027b.d, InterfaceC0106f, ivas.gov.bisp.enumeration.p082e.g {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public OooOOO mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    public h mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public ivas.gov.bisp.enumeration.p027b.w mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public h mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public o000000O<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public androidx.lifecycle.c mLifecycleRegistry;
    public androidx.lifecycle.d.aMa mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OooOo00> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public androidx.savedstate.e mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public U mViewLifecycleOwner;
    public o000OOo0<ivas.gov.bisp.enumeration.p027b.d> mViewLifecycleOwnerLiveData;
    public String mWho;

    public class OooO implements ivas.gov.bisp.enumeration.OooOOOo.OooO0OO<Void, ActivityResultRegistry> {
        public OooO() {
        }

        public Object b(Object obj) {
            Fragment fragment = Fragment.this;
            ivas.gov.bisp.enumeration.p084g.i iVar = fragment.mHost;
            return iVar instanceof ivas.gov.bisp.enumeration.p084g.i ? iVar.d() : fragment.requireActivity().i;
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class OooO0OO implements Runnable {
        public final /* synthetic */ i a;

        public OooO0OO(Fragment fragment, i iVar) {
            this.a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.g();
        }
    }

    public class OooO0o extends A {
        public OooO0o() {
        }

        @Override // ivas.gov.bisp.enumeration.F.A
        public View c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Fragment ");
            sbW.append(Fragment.this);
            sbW.append(" does not have a view");
            throw new IllegalStateException(sbW.toString());
        }

        @Override // ivas.gov.bisp.enumeration.F.A
        public boolean d() {
            return Fragment.this.mView != null;
        }
    }

    public class OooOO0 implements ivas.gov.bisp.enumeration.OooOOOo.OooO0OO<Void, ActivityResultRegistry> {
        public final /* synthetic */ ActivityResultRegistry a;

        public OooOO0(Fragment fragment, ActivityResultRegistry activityResultRegistry) {
            this.a = activityResultRegistry;
        }

        public Object b(Object obj) {
            return this.a;
        }
    }

    public class OooOO0O extends OooOo00 {
        public final /* synthetic */ ivas.gov.bisp.enumeration.G.h a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ ivas.gov.bisp.enumeration.I.r c;
        public final /* synthetic */ ivas.gov.bisp.enumeration.p084g.r d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ivas.gov.bisp.enumeration.G.h hVar, AtomicReference atomicReference, ivas.gov.bisp.enumeration.I.r rVar, ivas.gov.bisp.enumeration.p084g.r rVar2) {
            super(null);
            this.a = hVar;
            this.b = atomicReference;
            this.c = rVar;
            this.d = rVar2;
        }

        @Override // androidx.fragment.app.Fragment.OooOo00
        public void c() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.b.set(((ActivityResultRegistry) this.a.b(null)).e(strGenerateActivityResultKey, Fragment.this, this.c, this.d));
        }
    }

    public static class OooOOO {
        public ArrayList<String> a;
        public View b;
        public Animator c;
        public boolean d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public ArrayList<String> j;
        public Object k = null;
        public Object l;
        public Object m;
        public Object n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f21o;
        public Object p;
        public Boolean q;
        public Boolean r;
        public float s;
        public boolean t;
        public View u;
        public OooOo v;
        public boolean w;

        public OooOOO() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.l = obj;
            this.n = null;
            this.m = obj;
            this.f21o = null;
            this.p = obj;
            this.s = 1.0f;
            this.u = null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class OooOOO0<I> extends ivas.gov.bisp.enumeration.OooO0Oo.OooO<I> {
        public final /* synthetic */ AtomicReference a;

        public OooOOO0(Fragment fragment, AtomicReference atomicReference, ivas.gov.bisp.enumeration.I.r rVar) {
            this.a = atomicReference;
        }

        public void c(I i, ivas.gov.bisp.enumeration.p085h.w wVar) {
            ivas.gov.bisp.enumeration.p084g.e eVar = (ivas.gov.bisp.enumeration.p084g.e) this.a.get();
            if (eVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            eVar.c(i, wVar);
        }

        public void d() {
            ivas.gov.bisp.enumeration.p084g.e eVar = (ivas.gov.bisp.enumeration.p084g.e) this.a.getAndSet(null);
            if (eVar != null) {
                eVar.d();
            }
        }
    }

    public static class OooOOOO extends RuntimeException {
        public OooOOOO(String str, Exception exc) {
            super(str, exc);
        }
    }

    public interface OooOo {
    }

    public static abstract class OooOo00 {
        public OooOo00() {
        }

        public abstract void c();

        public OooOo00(OooO00o oooO00o) {
        }
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class Oooo000 implements Parcelable {
        public static final Parcelable.Creator<Oooo000> CREATOR = new OooO00o();
        public final Bundle b;

        public class OooO00o implements Parcelable.ClassLoaderCreator<Oooo000> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new Oooo000(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new Oooo000[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Oooo000 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new Oooo000(parcel, classLoader);
            }
        }

        public Oooo000(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.b = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.b);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new W();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new OooO00o();
        this.mMaxState = androidx.lifecycle.d.aMa.RESUMED;
        this.mViewLifecycleOwnerLiveData = new ah();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private OooOOO ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new OooOOO();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        androidx.lifecycle.d.aMa ama = this.mMaxState;
        return (ama == androidx.lifecycle.d.aMa.INITIALIZED || this.mParentFragment == null) ? ama.ordinal() : Math.min(ama.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.c(this);
        this.mSavedStateRegistryController = new androidx.savedstate.e(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> ivas.gov.bisp.enumeration.OooO0Oo.OooO<I> prepareCallInternal(ivas.gov.bisp.enumeration.OooO0o0.OooO0o<I, O> oooO0o, ivas.gov.bisp.enumeration.OooOOOo.OooO0OO<Void, ActivityResultRegistry> oooO0OO, ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<O> oooO0o2) {
        if (this.mState > 1) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new OooOO0O(oooO0OO, atomicReference, oooO0o, oooO0o2));
        return new OooOOO0(this, atomicReference, oooO0o);
    }

    private void registerOnPreAttachListener(OooOo00 oooOo00) {
        if (this.mState >= 0) {
            oooOo00.c();
        } else {
            this.mOnPreAttachedListeners.add(oooOo00);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        h hVar;
        OooOOO oooOOO = this.mAnimationInfo;
        OooOo oooOo = null;
        if (oooOOO != null) {
            oooOOO.t = false;
            OooOo oooOo2 = oooOOO.v;
            oooOOO.v = null;
            oooOo = oooOo2;
        }
        if (oooOo != null) {
            h.aLO alo = (h.aLO) oooOo;
            int i = alo.c - 1;
            alo.c = i;
            if (i == 0) {
                alo.b.p.ac();
                return;
            }
            return;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (hVar = this.mFragmentManager) == null) {
            return;
        }
        i iVarB = i.b(viewGroup, hVar);
        iVarB.j();
        if (z) {
            this.mHost.c.post(new OooO0OO(this, iVarB));
        } else {
            iVarB.g();
        }
    }

    public A createFragmentContainer() {
        return new OooO0o();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            ao.c(this).d(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.mChildFragmentManager);
        sb.append(":");
        printWriter.println(sb.toString());
        this.mChildFragmentManager.B(ivas.gov.bisp.enumeration.p091n.j.r(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.d.i(str);
    }

    public String generateActivityResultKey() {
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("fragment_");
        sbW.append(this.mWho);
        sbW.append("_rq#");
        sbW.append(this.mNextLocalRequestCode.getAndIncrement());
        return sbW.toString();
    }

    public final FragmentActivity getActivity() {
        o000000O<?> o000000o = this.mHost;
        if (o000000o == null) {
            return null;
        }
        return (FragmentActivity) o000000o.a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null || (bool = oooOOO.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null || (bool = oooOOO.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        return oooOOO.b;
    }

    public Animator getAnimator() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        return oooOOO.c;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final h getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        o000000O<?> o000000o = this.mHost;
        if (o000000o == null) {
            return null;
        }
        return o000000o.b;
    }

    public ivas.gov.bisp.enumeration.p027b.w getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && h.b(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new androidx.lifecycle.i(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return 0;
        }
        return oooOOO.e;
    }

    public Object getEnterTransition() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        return oooOOO.k;
    }

    public ivas.gov.bisp.enumeration.p085h.ao getEnterTransitionCallback() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        Objects.requireNonNull(oooOOO);
        return null;
    }

    public int getExitAnim() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return 0;
        }
        return oooOOO.g;
    }

    public Object getExitTransition() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        return oooOOO.n;
    }

    public ivas.gov.bisp.enumeration.p085h.ao getExitTransitionCallback() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        Objects.requireNonNull(oooOOO);
        return null;
    }

    public View getFocusedView() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        return oooOOO.u;
    }

    @Deprecated
    public final h getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        o000000O<?> o000000o = this.mHost;
        if (o000000o == null) {
            return null;
        }
        return o000000o.f();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // ivas.gov.bisp.enumeration.p027b.d
    public androidx.lifecycle.d getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public ao getLoaderManager() {
        return ao.c(this);
    }

    public int getNextTransition() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return 0;
        }
        return oooOOO.i;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final h getParentFragmentManager() {
        h hVar = this.mFragmentManager;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return false;
        }
        return oooOOO.d;
    }

    public int getPopEnterAnim() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return 0;
        }
        return oooOOO.f;
    }

    public int getPopExitAnim() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return 0;
        }
        return oooOOO.h;
    }

    public float getPostOnViewCreatedAlpha() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return 1.0f;
        }
        return oooOOO.s;
    }

    public Object getReenterTransition() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        Object obj = oooOOO.m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        Object obj = oooOOO.l;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // ivas.gov.bisp.enumeration.p082e.g
    public final androidx.savedstate.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        return oooOOO.f21o;
    }

    public Object getSharedElementReturnTransition() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return null;
        }
        Object obj = oooOOO.p;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        OooOOO oooOOO = this.mAnimationInfo;
        return (oooOOO == null || (arrayList = oooOOO.a) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        OooOOO oooOOO = this.mAnimationInfo;
        return (oooOOO == null || (arrayList = oooOOO.j) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        h hVar = this.mFragmentManager;
        if (hVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return hVar.K(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public ivas.gov.bisp.enumeration.p027b.d getViewLifecycleOwner() {
        U u = this.mViewLifecycleOwner;
        if (u != null) {
            return u;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<ivas.gov.bisp.enumeration.p027b.d> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // ivas.gov.bisp.enumeration.p027b.InterfaceC0106f
    public an getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        al alVar = this.mFragmentManager.J;
        an anVar = alVar.i.get(this.mWho);
        if (anVar != null) {
            return anVar;
        }
        an anVar2 = new an();
        alVar.i.put(this.mWho, anVar2);
        return anVar2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new W();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return false;
        }
        return oooOOO.w;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        h hVar;
        return this.mMenuVisible && ((hVar = this.mFragmentManager) == null || hVar.H(this.mParentFragment));
    }

    public boolean isPostponed() {
        OooOOO oooOOO = this.mAnimationInfo;
        if (oooOOO == null) {
            return false;
        }
        return oooOOO.t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        h hVar = this.mFragmentManager;
        if (hVar == null) {
            return false;
        }
        return hVar.S();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.V();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (h.b(2)) {
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        o000000O<?> o000000o = this.mHost;
        Activity activity = o000000o == null ? null : o000000o.a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        h hVar = this.mChildFragmentManager;
        if (hVar.p <= 0) {
            hVar.p();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        o000000O<?> o000000o = this.mHost;
        Activity activity = o000000o == null ? null : o000000o.a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.V();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        h hVar = this.mChildFragmentManager;
        hVar.C = false;
        hVar.B = false;
        hVar.J.k = false;
        hVar.z(4);
    }

    public void performAttach() {
        Iterator<OooOo00> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.e(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.b);
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onAttach()"));
        }
        h hVar = this.mFragmentManager;
        Iterator<D> it2 = hVar.f24o.iterator();
        while (it2.hasNext()) {
            it2.next().b(hVar, this);
        }
        h hVar2 = this.mChildFragmentManager;
        hVar2.C = false;
        hVar2.B = false;
        hVar2.J.k = false;
        hVar2.z(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.n(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.V();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.b(new androidx.lifecycle.a() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.a
            public void a(ivas.gov.bisp.enumeration.p027b.d dVar, androidx.lifecycle.d.aLZ alz) {
                View view;
                if (alz != androidx.lifecycle.d.aLZ.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.j(androidx.lifecycle.d.aLZ.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.o(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.V();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new U(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.d();
            this.mView.setTag(R.id.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
            this.mView.setTag(R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            this.mView.setTag(R.id.view_tree_saved_state_registry_owner, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.q();
        this.mLifecycleRegistry.j(androidx.lifecycle.d.aLZ.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.z(1);
        if (this.mView != null) {
            U u = this.mViewLifecycleOwner;
            u.d();
            if (u.d.b.compareTo(androidx.lifecycle.d.aMa.CREATED) >= 0) {
                this.mViewLifecycleOwner.c(androidx.lifecycle.d.aLZ.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        ar.aZt azt = ((ar) ao.c(this)).d;
        int i = azt.f.i();
        for (int i2 = 0; i2 < i; i2++) {
            Objects.requireNonNull((ar.aZs) azt.f.j(i2));
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onDetach()"));
        }
        h hVar = this.mChildFragmentManager;
        if (hVar.D) {
            return;
        }
        hVar.q();
        this.mChildFragmentManager = new W();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.r();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.t(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.s(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.u(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.z(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.c(androidx.lifecycle.d.aLZ.ON_PAUSE);
        }
        this.mLifecycleRegistry.j(androidx.lifecycle.d.aLZ.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.w(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.y(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zT = this.mFragmentManager.T(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zT) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zT);
            onPrimaryNavigationFragmentChanged(zT);
            h hVar = this.mChildFragmentManager;
            hVar.aj();
            hVar.x(hVar.v);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.V();
        this.mChildFragmentManager.D(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.c cVar = this.mLifecycleRegistry;
        androidx.lifecycle.d.aLZ alz = androidx.lifecycle.d.aLZ.ON_RESUME;
        cVar.j(alz);
        if (this.mView != null) {
            androidx.lifecycle.c cVar2 = this.mViewLifecycleOwner.d;
            cVar2.i("handleLifecycleEvent");
            cVar2.k(alz.f());
        }
        h hVar = this.mChildFragmentManager;
        hVar.C = false;
        hVar.B = false;
        hVar.J.k = false;
        hVar.z(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
        Parcelable parcelableAb = this.mChildFragmentManager.ab();
        if (parcelableAb != null) {
            bundle.putParcelable("android:support:fragments", parcelableAb);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.V();
        this.mChildFragmentManager.D(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.c cVar = this.mLifecycleRegistry;
        androidx.lifecycle.d.aLZ alz = androidx.lifecycle.d.aLZ.ON_START;
        cVar.j(alz);
        if (this.mView != null) {
            androidx.lifecycle.c cVar2 = this.mViewLifecycleOwner.d;
            cVar2.i("handleLifecycleEvent");
            cVar2.k(alz.f());
        }
        h hVar = this.mChildFragmentManager;
        hVar.C = false;
        hVar.B = false;
        hVar.J.k = false;
        hVar.z(5);
    }

    public void performStop() {
        h hVar = this.mChildFragmentManager;
        hVar.B = true;
        hVar.J.k = true;
        hVar.z(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.c(androidx.lifecycle.d.aLZ.ON_STOP);
        }
        this.mLifecycleRegistry.j(androidx.lifecycle.d.aLZ.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.z(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().t = true;
    }

    public final <I, O> ivas.gov.bisp.enumeration.OooO0Oo.OooO<I> registerForActivityResult(ivas.gov.bisp.enumeration.OooO0o0.OooO0o<I, O> oooO0o, ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<O> oooO0o2) {
        return prepareCallInternal(oooO0o, new OooO(), oooO0o2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " not attached to Activity"));
        }
        h parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.z == null) {
            Objects.requireNonNull(parentFragmentManager.r);
            return;
        }
        parentFragmentManager.y.addLast(new h.aLL(this.mWho, i));
        parentFragmentManager.z.c(strArr, null);
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final h requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " is not attached to any Fragment or host"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(getContext());
        throw new IllegalStateException(sb.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.aa(parcelable);
        this.mChildFragmentManager.p();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            U u = this.mViewLifecycleOwner;
            u.e.b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new ai(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.c(androidx.lifecycle.d.aLZ.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().r = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().b = view;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().e = i;
        ensureAnimationInfo().g = i2;
        ensureAnimationInfo().f = i3;
        ensureAnimationInfo().h = i4;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().c = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(ivas.gov.bisp.enumeration.p085h.ao aoVar) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setExitSharedElementCallback(ivas.gov.bisp.enumeration.p085h.ao aoVar) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().u = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.i();
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().w = z;
    }

    public void setInitialSavedState(Oooo000 oooo000) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (oooo000 == null || (bundle = oooo000.b) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.i();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.i = i;
    }

    public void setOnStartEnterTransitionListener(OooOo oooOo) {
        ensureAnimationInfo();
        OooOOO oooOOO = this.mAnimationInfo;
        OooOo oooOo2 = oooOOO.v;
        if (oooOo == oooOo2) {
            return;
        }
        if (oooOo != null && oooOo2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        if (oooOOO.t) {
            oooOOO.v = oooOo;
        }
        if (oooOo != null) {
            ((h.aLO) oooOo).c++;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().d = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().s = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        h hVar = this.mFragmentManager;
        if (hVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            hVar.J.e(this);
        } else {
            hVar.J.f(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f21o = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        OooOOO oooOOO = this.mAnimationInfo;
        oooOOO.a = arrayList;
        oooOOO.j = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().p = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        h hVar = this.mFragmentManager;
        h hVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (hVar != null && hVar2 != null && hVar != hVar2) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
            if (targetFragment.equals(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting ");
                sb.append(fragment);
                sb.append(" as the target of ");
                sb.append(this);
                sb.append(" would create a target cycle");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            h hVar = this.mFragmentManager;
            hVar.ak(hVar.k(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        o000000O<?> o000000o = this.mHost;
        if (o000000o != null) {
            return o000000o.e(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.mHost == null) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " not attached to Activity"));
        }
        if (h.b(2)) {
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        h parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.t == null) {
            o000000O<?> o000000o = parentFragmentManager.r;
            Objects.requireNonNull(o000000o);
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            Activity activity = o000000o.a;
            int i5 = ivas.gov.bisp.enumeration.p085h.k.d;
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (h.b(2)) {
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        ivas.gov.bisp.enumeration.p084g.p pVar = new ivas.gov.bisp.enumeration.p084g.p(intentSender, intent2, i2, i3);
        parentFragmentManager.y.addLast(new h.aLL(this.mWho, i));
        h.b(2);
        parentFragmentManager.t.c(pVar, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().t) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().t = false;
        } else if (Looper.myLooper() != this.mHost.c.getLooper()) {
            this.mHost.c.postAtFrontOfQueue(new OooO0O0());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = r.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e) {
            throw new OooOOOO(ivas.gov.bisp.enumeration.p091n.j.t("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new OooOOOO(ivas.gov.bisp.enumeration.p091n.j.t("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new OooOOOO(ivas.gov.bisp.enumeration.p091n.j.t("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new OooOOOO(ivas.gov.bisp.enumeration.p091n.j.t("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        ensureAnimationInfo().t = true;
        h hVar = this.mFragmentManager;
        Handler handler = hVar != null ? hVar.r.c : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> ivas.gov.bisp.enumeration.OooO0Oo.OooO<I> registerForActivityResult(ivas.gov.bisp.enumeration.OooO0o0.OooO0o<I, O> oooO0o, ActivityResultRegistry activityResultRegistry, ivas.gov.bisp.enumeration.OooO0Oo.OooO0o<O> oooO0o2) {
        return prepareCallInternal(oooO0o, new OooOO0(this, activityResultRegistry), oooO0o2);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        o000000O<?> o000000o = this.mHost;
        if (o000000o == null) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " not attached to Activity"));
        }
        Context context = o000000o.b;
        Object obj = ivas.gov.bisp.enumeration.p086i.l.c;
        ivas.gov.bisp.enumeration.i.l.aUF.c(context, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.q("Fragment ", this, " not attached to Activity"));
        }
        h parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.x != null) {
            parentFragmentManager.y.addLast(new h.aLL(this.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.x.c(intent, null);
            return;
        }
        o000000O<?> o000000o = parentFragmentManager.r;
        Objects.requireNonNull(o000000o);
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Context context = o000000o.b;
        Object obj = ivas.gov.bisp.enumeration.p086i.l.c;
        ivas.gov.bisp.enumeration.i.l.aUF.c(context, intent, bundle);
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        o000000O<?> o000000o = this.mHost;
        if (o000000o != null) {
            LayoutInflater layoutInflaterG = o000000o.g();
            layoutInflaterG.setFactory2(this.mChildFragmentManager.f);
            return layoutInflaterG;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        h.b(3);
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
