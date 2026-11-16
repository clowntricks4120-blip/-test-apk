package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class p {
    /* JADX WARN: Code duplicated, block: B:58:0x00ad A[Catch: RuntimeException -> 0x00b3, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00b3, blocks: (B:56:0x00a7, B:58:0x00ad), top: B:69:0x00a7 }] */
    public static aLc a(Context context, Fragment fragment, boolean z, boolean z2) {
        int enterAnim;
        Animator animatorLoadAnimator;
        int i;
        int nextTransition = fragment.getNextTransition();
        if (z2) {
            enterAnim = z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        } else {
            enterAnim = z ? fragment.getEnterAnim() : fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, enterAnim);
        if (animationOnCreateAnimation != null) {
            return new aLc(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, enterAnim);
        if (animatorOnCreateAnimator != null) {
            return new aLc(animatorOnCreateAnimator);
        }
        if (enterAnim == 0 && nextTransition != 0) {
            if (nextTransition == 4097) {
                i = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
            } else if (nextTransition == 4099) {
                i = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
            } else if (nextTransition != 8194) {
                i = -1;
            } else {
                i = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
            }
            enterAnim = i;
        }
        if (enterAnim != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                    if (animationLoadAnimation != null) {
                        return new aLc(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                        if (animatorLoadAnimator != null) {
                            return new aLc(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (zEquals) {
                            throw e2;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                        if (animationLoadAnimation2 != null) {
                            return new aLc(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                if (animatorLoadAnimator != null) {
                    return new aLc(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    public static class aLc {
        public final Animation a;
        public final Animator b;

        public aLc(Animation animation) {
            this.a = animation;
            this.b = null;
        }

        public aLc(Animator animator) {
            this.a = null;
            this.b = animator;
        }
    }

    public static class aLd extends AnimationSet implements Runnable {
        public final ViewGroup a;
        public final View b;
        public boolean c;
        public boolean d;
        public boolean e;

        public aLd(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.d = true;
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.d = true;
            if (this.c) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.c = true;
                ivas.gov.bisp.enumeration.p081d.x.c(this.a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c || !this.d) {
                this.a.endViewTransition(this.b);
                this.e = true;
            } else {
                this.d = false;
                this.a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.d = true;
            if (this.c) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.c = true;
                ivas.gov.bisp.enumeration.p081d.x.c(this.a, this);
            }
            return true;
        }
    }
}
