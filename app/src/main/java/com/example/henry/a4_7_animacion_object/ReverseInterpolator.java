package com.example.henry.a4_7_animacion_object;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

class ReverseInterpolator implements Interpolator {
    private final Interpolator delegate;

    public ReverseInterpolator(Interpolator delegate){
        this.delegate = delegate;
    }

    public ReverseInterpolator(){
        this(new LinearInterpolator());
    }

    @Override
    public float getInterpolation(float input) {
        return 1 - delegate.getInterpolation(input);
    }
}
