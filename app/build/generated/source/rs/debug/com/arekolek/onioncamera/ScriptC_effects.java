/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: /Users/iranga/Developer/Code Samples/Android/OnionCamera/app/src/main/rs/effects.rs
 */

package com.arekolek.onioncamera;

import android.os.Build;
import android.os.Process;
import java.lang.reflect.Field;
import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_effects extends ScriptC {
    private static final String __rs_resource_name = "effects";
    // Constructor
    public  ScriptC_effects(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_effects(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __U8 = Element.U8(rs);
        __U8_4 = Element.U8_4(rs);
        __F32 = Element.F32(rs);
        __I32 = Element.I32(rs);
    }

    private Element __F32;
    private Element __I32;
    private Element __U8;
    private Element __U8_4;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_addhisto = 1;
    public Script.KernelID getKernelID_addhisto() {
        return createKernelID(mExportForEachIdx_addhisto, 59, null, null);
    }

    public void forEach_addhisto(Allocation ain, Allocation aout) {
        forEach_addhisto(ain, aout, null);
    }

    public void forEach_addhisto(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_addhisto, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_copy = 2;
    public Script.KernelID getKernelID_copy() {
        return createKernelID(mExportForEachIdx_copy, 35, null, null);
    }

    public void forEach_copy(Allocation ain, Allocation aout) {
        forEach_copy(ain, aout, null);
    }

    public void forEach_copy(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_copy, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_blend = 3;
    public Script.KernelID getKernelID_blend() {
        return createKernelID(mExportForEachIdx_blend, 59, null, null);
    }

    public void forEach_blend(Allocation ain, Allocation aout) {
        forEach_blend(ain, aout, null);
    }

    public void forEach_blend(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_blend, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_blur = 4;
    public Script.KernelID getKernelID_blur() {
        return createKernelID(mExportForEachIdx_blur, 58, null, null);
    }

    public void forEach_blur(Allocation aout) {
        forEach_blur(aout, null);
    }

    public void forEach_blur(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        forEach(mExportForEachIdx_blur, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_compute_gradient = 5;
    public Script.KernelID getKernelID_compute_gradient() {
        return createKernelID(mExportForEachIdx_compute_gradient, 58, null, null);
    }

    public void forEach_compute_gradient(Allocation aout) {
        forEach_compute_gradient(aout, null);
    }

    public void forEach_compute_gradient(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        forEach(mExportForEachIdx_compute_gradient, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_suppress = 6;
    public Script.KernelID getKernelID_suppress() {
        return createKernelID(mExportForEachIdx_suppress, 58, null, null);
    }

    public void forEach_suppress(Allocation aout) {
        forEach_suppress(aout, null);
    }

    public void forEach_suppress(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_suppress, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_hysteresis = 7;
    public Script.KernelID getKernelID_hysteresis() {
        return createKernelID(mExportForEachIdx_hysteresis, 58, null, null);
    }

    public void forEach_hysteresis(Allocation aout) {
        forEach_hysteresis(aout, null);
    }

    public void forEach_hysteresis(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_hysteresis, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_set_blur_input = 0;
    public void invoke_set_blur_input(Allocation u8_buf) {
        FieldPacker set_blur_input_fp = new FieldPacker(4);
        set_blur_input_fp.addObj(u8_buf);
        invoke(mExportFuncIdx_set_blur_input, set_blur_input_fp);
    }

    private final static int mExportFuncIdx_set_compute_gradient_input = 1;
    public void invoke_set_compute_gradient_input(Allocation f_buf) {
        FieldPacker set_compute_gradient_input_fp = new FieldPacker(4);
        set_compute_gradient_input_fp.addObj(f_buf);
        invoke(mExportFuncIdx_set_compute_gradient_input, set_compute_gradient_input_fp);
    }

    private final static int mExportFuncIdx_set_suppress_input = 2;
    public void invoke_set_suppress_input(Allocation f_buf, Allocation i_buf) {
        FieldPacker set_suppress_input_fp = new FieldPacker(8);
        set_suppress_input_fp.addObj(f_buf);
        set_suppress_input_fp.addObj(i_buf);
        invoke(mExportFuncIdx_set_suppress_input, set_suppress_input_fp);
    }

    private final static int mExportFuncIdx_set_hysteresis_input = 3;
    public void invoke_set_hysteresis_input(Allocation i_buf) {
        FieldPacker set_hysteresis_input_fp = new FieldPacker(4);
        set_hysteresis_input_fp.addObj(i_buf);
        invoke(mExportFuncIdx_set_hysteresis_input, set_hysteresis_input_fp);
    }

    private final static int mExportFuncIdx_set_thresholds = 4;
    public void invoke_set_thresholds(float l, float h) {
        FieldPacker set_thresholds_fp = new FieldPacker(8);
        set_thresholds_fp.addF32(l);
        set_thresholds_fp.addF32(h);
        invoke(mExportFuncIdx_set_thresholds, set_thresholds_fp);
    }

    private final static int mExportFuncIdx_set_histogram = 5;
    public void invoke_set_histogram(Allocation h) {
        FieldPacker set_histogram_fp = new FieldPacker(4);
        set_histogram_fp.addObj(h);
        invoke(mExportFuncIdx_set_histogram, set_histogram_fp);
    }

}

