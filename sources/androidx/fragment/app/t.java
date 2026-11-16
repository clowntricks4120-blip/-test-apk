package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ivas.gov.bisp.enumeration.F.C0018y;
import ivas.gov.bisp.enumeration.F.X;
import ivas.gov.bisp.enumeration.F.al;
import ivas.gov.bisp.enumeration.OoooOOo.o000000O;
import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p027b.an;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class t {
    public final C0018y a;
    public final X b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public class aLj implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;

        public aLj(t tVar, View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            View view2 = this.a;
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aXd.d(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public t(C0018y c0018y, X x, Fragment fragment) {
        this.a = c0018y;
        this.b = x;
        this.c = fragment;
    }

    public void d() {
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        this.c.performDetach();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.b.e.g(this.c)) {
            return;
        }
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        this.c.initState();
    }

    public void e() {
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        Fragment fragment = this.c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0018y c0018y = this.a;
        Fragment fragment2 = this.c;
        c0018y.d(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void f() {
        View view;
        View view2;
        X x = this.b;
        Fragment fragment = this.c;
        Objects.requireNonNull(x);
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = x.c.indexOf(fragment);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                Fragment fragment2 = x.c.get(i);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= x.c.size()) {
                    break;
                }
                Fragment fragment3 = x.c.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer.addView(fragment4.mView, iIndexOfChild);
    }

    public void g() {
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        t tVarK = null;
        if (fragment2 != null) {
            t tVarK2 = this.b.k(fragment2.mWho);
            if (tVarK2 == null) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Fragment ");
                sbW.append(this.c);
                sbW.append(" declared target fragment ");
                sbW.append(this.c.mTarget);
                sbW.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sbW.toString());
            }
            Fragment fragment3 = this.c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            tVarK = tVarK2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (tVarK = this.b.k(str)) == null) {
                StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("Fragment ");
                sbW2.append(this.c);
                sbW2.append(" declared target fragment ");
                throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.u(sbW2, this.c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (tVarK != null) {
            tVarK.n();
        }
        Fragment fragment4 = this.c;
        h hVar = fragment4.mFragmentManager;
        fragment4.mHost = hVar.r;
        fragment4.mParentFragment = hVar.s;
        this.a.j(fragment4, false);
        this.c.performAttach();
        this.a.e(this.c, false);
    }

    public int h() {
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        Fragment fragment2 = this.c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.e, 2);
                View view = this.c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.c;
        ViewGroup viewGroup = fragment3.mContainer;
        i.aLo.aLr alr = null;
        i.aLo alo = null;
        if (viewGroup != null) {
            i iVarB = i.b(viewGroup, fragment3.getParentFragmentManager());
            Objects.requireNonNull(iVarB);
            i.aLo aloH = iVarB.h(this.c);
            i.aLo.aLr alr2 = aloH != null ? aloH.b : null;
            Fragment fragment4 = this.c;
            for (i.aLo alo2 : iVarB.c) {
                if (alo2.c.equals(fragment4) && !alo2.e) {
                    alo = alo2;
                    break;
                }
            }
            alr = (alo == null || !(alr2 == null || alr2 == i.aLo.aLr.NONE)) ? alr2 : alo.b;
        }
        if (alr == i.aLo.aLr.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (alr == i.aLo.aLr.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.c;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (h.b(2)) {
            Objects.toString(this.c);
        }
        return iMin;
    }

    public void i() {
        String resourceName;
        if (this.c.mFromLayout) {
            return;
        }
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        Fragment fragment = this.c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i = fragment2.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Cannot create fragment ");
                    sbW.append(this.c);
                    sbW.append(" for a container view with no id");
                    throw new IllegalArgumentException(sbW.toString());
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.q.c(i);
                if (viewGroup == null) {
                    Fragment fragment3 = this.c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("No view found for id 0x");
                        sbW2.append(Integer.toHexString(this.c.mContainerId));
                        sbW2.append(" (");
                        sbW2.append(resourceName);
                        sbW2.append(") for fragment ");
                        sbW2.append(this.c);
                        throw new IllegalArgumentException(sbW2.toString());
                    }
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.c;
            fragment5.mView.setTag(ivas.gov.bisp.enumeration.R.id.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                f();
            }
            Fragment fragment6 = this.c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            View view2 = this.c.mView;
            WeakHashMap<View, R> weakHashMap = T.c;
            if (T.aXa.c(view2)) {
                T.aXd.d(this.c.mView);
            } else {
                View view3 = this.c.mView;
                view3.addOnAttachStateChangeListener(new aLj(this, view3));
            }
            this.c.performViewCreated();
            C0018y c0018y = this.a;
            Fragment fragment7 = this.c;
            c0018y.p(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.c.mView.getVisibility();
            this.c.setPostOnViewCreatedAlpha(this.c.mView.getAlpha());
            Fragment fragment8 = this.c;
            if (fragment8.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment8.mView.findFocus();
                if (viewFindFocus != null) {
                    this.c.setFocusedView(viewFindFocus);
                    if (h.b(2)) {
                        Objects.toString(this.c);
                    }
                }
                this.c.mView.setAlpha(0.0f);
            }
        }
        this.c.mState = 2;
    }

    public void j() {
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        Fragment fragment = this.c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.c.mState = 1;
            return;
        }
        this.a.k(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C0018y c0018y = this.a;
        Fragment fragment3 = this.c;
        c0018y.f(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void k() {
        Fragment fragmentG;
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        Fragment fragment = this.c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (!z && !this.b.e.g(this.c)) {
            String str = this.c.mTargetWho;
            if (str != null && (fragmentG = this.b.g(str)) != null && fragmentG.mRetainInstance) {
                this.c.mTarget = fragmentG;
            }
            this.c.mState = 0;
            return;
        }
        o000000O<?> o000000o = this.c.mHost;
        if (o000000o instanceof InterfaceC0106f) {
            zIsChangingConfigurations = this.b.e.j;
        } else {
            Context context = o000000o.b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            al alVar = this.b.e;
            Fragment fragment2 = this.c;
            Objects.requireNonNull(alVar);
            if (h.b(3)) {
                Objects.toString(fragment2);
            }
            al alVar2 = alVar.g.get(fragment2.mWho);
            if (alVar2 != null) {
                alVar2.c();
                alVar.g.remove(fragment2.mWho);
            }
            an anVar = alVar.i.get(fragment2.mWho);
            if (anVar != null) {
                anVar.c();
                alVar.i.remove(fragment2.mWho);
            }
        }
        this.c.performDestroy();
        this.a.g(this.c, false);
        for (t tVar : (ArrayList) this.b.h()) {
            if (tVar != null) {
                Fragment fragment3 = tVar.c;
                if (this.c.mWho.equals(fragment3.mTargetWho)) {
                    fragment3.mTarget = this.c;
                    fragment3.mTargetWho = null;
                }
            }
        }
        Fragment fragment4 = this.c;
        String str2 = fragment4.mTargetWho;
        if (str2 != null) {
            fragment4.mTarget = this.b.g(str2);
        }
        this.b.m(this);
    }

    public void l() {
        View view;
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.a.o(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.j(null);
        this.c.mInLayout = false;
    }

    public void m() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (h.b(3)) {
                Objects.toString(this.c);
            }
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.c.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(ivas.gov.bisp.enumeration.R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                C0018y c0018y = this.a;
                Fragment fragment5 = this.c;
                c0018y.p(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    public void n() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        i.aLo.aLr alr = i.aLo.aLr.NONE;
        if (this.d) {
            if (h.b(2)) {
                Objects.toString(this.c);
                return;
            }
            return;
        }
        try {
            this.d = true;
            while (true) {
                int iH = h();
                Fragment fragment = this.c;
                int i = fragment.mState;
                if (iH == i) {
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            i iVarB = i.b(viewGroup, fragment.getParentFragmentManager());
                            if (this.c.mHidden) {
                                Objects.requireNonNull(iVarB);
                                if (h.b(2)) {
                                    Objects.toString(this.c);
                                }
                                iVarB.e(i.aLo.aLs.GONE, alr, this);
                            } else {
                                Objects.requireNonNull(iVarB);
                                if (h.b(2)) {
                                    Objects.toString(this.c);
                                }
                                iVarB.e(i.aLo.aLs.VISIBLE, alr, this);
                            }
                        }
                        Fragment fragment2 = this.c;
                        h hVar = fragment2.mFragmentManager;
                        if (hVar != null && fragment2.mAdded && hVar.Q(fragment2)) {
                            hVar.A = true;
                        }
                        Fragment fragment3 = this.c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (iH <= i) {
                    switch (i - 1) {
                        case -1:
                            d();
                            break;
                        case 0:
                            k();
                            break;
                        case 1:
                            l();
                            this.c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (h.b(3)) {
                                Objects.toString(this.c);
                            }
                            Fragment fragment4 = this.c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                r();
                            }
                            Fragment fragment5 = this.c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                i iVarB2 = i.b(viewGroup3, fragment5.getParentFragmentManager());
                                Objects.requireNonNull(iVarB2);
                                if (h.b(2)) {
                                    Objects.toString(this.c);
                                }
                                iVarB2.e(i.aLo.aLs.REMOVED, i.aLo.aLr.REMOVING, this);
                            }
                            this.c.mState = 3;
                            break;
                        case 4:
                            t();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            o();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            g();
                            break;
                        case 1:
                            j();
                            break;
                        case 2:
                            m();
                            i();
                            break;
                        case 3:
                            e();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                i iVarB3 = i.b(viewGroup2, fragment.getParentFragmentManager());
                                i.aLo.aLs alsC = i.aLo.aLs.c(this.c.mView.getVisibility());
                                Objects.requireNonNull(iVarB3);
                                if (h.b(2)) {
                                    Objects.toString(this.c);
                                }
                                iVarB3.e(alsC, i.aLo.aLr.ADDING, this);
                            }
                            this.c.mState = 4;
                            break;
                        case 5:
                            s();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } finally {
            this.d = false;
        }
    }

    public void o() {
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        this.c.performPause();
        this.a.h(this.c, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    public void p() {
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null) {
            if (focusedView != this.c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == this.c.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (h.b(2)) {
                    Objects.toString(this.c);
                    Objects.toString(this.c.mView.findFocus());
                }
            } else {
                focusedView.requestFocus();
                if (h.b(2)) {
                    Objects.toString(this.c);
                    Objects.toString(this.c.mView.findFocus());
                }
            }
        }
        this.c.setFocusedView(null);
        this.c.performResume();
        this.a.c(this.c, false);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public void q(ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void r() {
        if (this.c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.mViewLifecycleOwner.e.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.mSavedViewRegistryState = bundle;
    }

    public void s() {
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        this.c.performStart();
        this.a.m(this.c, false);
    }

    public void t() {
        if (h.b(3)) {
            Objects.toString(this.c);
        }
        this.c.performStop();
        this.a.n(this.c, false);
    }

    public t(C0018y c0018y, X x, ClassLoader classLoader, r rVar, ivas.gov.bisp.enumeration.F.n nVar) {
        this.a = c0018y;
        this.b = x;
        Fragment fragmentE = rVar.e(classLoader, nVar.e);
        this.c = fragmentE;
        Bundle bundle = nVar.m;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentE.setArguments(nVar.m);
        fragmentE.mWho = nVar.f;
        fragmentE.mFromLayout = nVar.g;
        fragmentE.mRestored = true;
        fragmentE.mFragmentId = nVar.i;
        fragmentE.mContainerId = nVar.h;
        fragmentE.mTag = nVar.j;
        fragmentE.mRetainInstance = nVar.k;
        fragmentE.mRemoving = nVar.d;
        fragmentE.mDetached = nVar.l;
        fragmentE.mHidden = nVar.n;
        fragmentE.mMaxState = androidx.lifecycle.d.aMa.values()[nVar.p];
        Bundle bundle2 = nVar.f43o;
        if (bundle2 != null) {
            fragmentE.mSavedFragmentState = bundle2;
        } else {
            fragmentE.mSavedFragmentState = new Bundle();
        }
        if (h.b(2)) {
            Objects.toString(fragmentE);
        }
    }

    public t(C0018y c0018y, X x, Fragment fragment, ivas.gov.bisp.enumeration.F.n nVar) {
        this.a = c0018y;
        this.b = x;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = nVar.f43o;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
