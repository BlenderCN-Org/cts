/*
 * Copyright (C) 2015 The Android Open Source Project
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

// Don't edit this file!  It is auto-generated by frameworks/rs/api/generate.sh.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;

public class TestFastDistance extends RSBaseCompute {

    private ScriptC_TestFastDistance script;
    private ScriptC_TestFastDistanceRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestFastDistance(mRS);
        scriptRelaxed = new ScriptC_TestFastDistanceRelaxed(mRS);
    }

    public class ArgumentsFloatFloatFloat {
        public float inLeftVector;
        public float inRightVector;
        public Target.Floaty out;
    }

    private void checkFastDistanceFloatFloatFloat() {
        Allocation inLeftVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xeb32e5abb9b28b1al, false);
        Allocation inRightVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x83606d459f1626e3l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRightVector(inRightVector);
            script.forEach_testFastDistanceFloatFloatFloat(inLeftVector, out);
            verifyResultsFastDistanceFloatFloatFloat(inLeftVector, inRightVector, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloatFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRightVector(inRightVector);
            scriptRelaxed.forEach_testFastDistanceFloatFloatFloat(inLeftVector, out);
            verifyResultsFastDistanceFloatFloatFloat(inLeftVector, inRightVector, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloatFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsFastDistanceFloatFloatFloat(Allocation inLeftVector, Allocation inRightVector, Allocation out, boolean relaxed) {
        float[] arrayInLeftVector = new float[INPUTSIZE * 1];
        inLeftVector.copyTo(arrayInLeftVector);
        float[] arrayInRightVector = new float[INPUTSIZE * 1];
        inRightVector.copyTo(arrayInRightVector);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
            // Create the appropriate sized arrays in args
            // Fill args with the input values
            args.inLeftVector = arrayInLeftVector[i];
            args.inRightVector = arrayInRightVector[i];
            Target target = new Target(relaxed);
            CoreMathVerifier.computeFastDistance(args, target);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                message.append("Input inLeftVector: ");
                appendVariableToMessage(message, arrayInLeftVector[i]);
                message.append("\n");
                message.append("Input inRightVector: ");
                appendVariableToMessage(message, arrayInRightVector[i]);
                message.append("\n");
                message.append("Expected output out: ");
                appendVariableToMessage(message, args.out);
                message.append("\n");
                message.append("Actual   output out: ");
                appendVariableToMessage(message, arrayOut[i]);
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkFastDistanceFloatFloatFloat" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    public class ArgumentsFloatNFloatNFloat {
        public float[] inLeftVector;
        public float[] inRightVector;
        public Target.Floaty out;
    }

    private void checkFastDistanceFloat2Float2Float() {
        Allocation inLeftVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x580238eac7fabd9el, false);
        Allocation inRightVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xca3368dd0536a30fl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRightVector(inRightVector);
            script.forEach_testFastDistanceFloat2Float2Float(inLeftVector, out);
            verifyResultsFastDistanceFloat2Float2Float(inLeftVector, inRightVector, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat2Float2Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRightVector(inRightVector);
            scriptRelaxed.forEach_testFastDistanceFloat2Float2Float(inLeftVector, out);
            verifyResultsFastDistanceFloat2Float2Float(inLeftVector, inRightVector, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat2Float2Float: " + e.toString());
        }
    }

    private void verifyResultsFastDistanceFloat2Float2Float(Allocation inLeftVector, Allocation inRightVector, Allocation out, boolean relaxed) {
        float[] arrayInLeftVector = new float[INPUTSIZE * 2];
        inLeftVector.copyTo(arrayInLeftVector);
        float[] arrayInRightVector = new float[INPUTSIZE * 2];
        inRightVector.copyTo(arrayInRightVector);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLeftVector = new float[2];
            args.inRightVector = new float[2];
            // Fill args with the input values
            for (int j = 0; j < 2 ; j++) {
                args.inLeftVector[j] = arrayInLeftVector[i * 2 + j];
            }
            for (int j = 0; j < 2 ; j++) {
                args.inRightVector[j] = arrayInRightVector[i * 2 + j];
            }
            Target target = new Target(relaxed);
            CoreMathVerifier.computeFastDistance(args, target);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 2 ; j++) {
                    message.append("Input inLeftVector: ");
                    appendVariableToMessage(message, arrayInLeftVector[i * 2 + j]);
                    message.append("\n");
                }
                for (int j = 0; j < 2 ; j++) {
                    message.append("Input inRightVector: ");
                    appendVariableToMessage(message, arrayInRightVector[i * 2 + j]);
                    message.append("\n");
                }
                message.append("Expected output out: ");
                appendVariableToMessage(message, args.out);
                message.append("\n");
                message.append("Actual   output out: ");
                appendVariableToMessage(message, arrayOut[i]);
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkFastDistanceFloat2Float2Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    private void checkFastDistanceFloat3Float3Float() {
        Allocation inLeftVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x26ab5e68e99971ecl, false);
        Allocation inRightVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x809cb50caadeec29l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRightVector(inRightVector);
            script.forEach_testFastDistanceFloat3Float3Float(inLeftVector, out);
            verifyResultsFastDistanceFloat3Float3Float(inLeftVector, inRightVector, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat3Float3Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRightVector(inRightVector);
            scriptRelaxed.forEach_testFastDistanceFloat3Float3Float(inLeftVector, out);
            verifyResultsFastDistanceFloat3Float3Float(inLeftVector, inRightVector, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat3Float3Float: " + e.toString());
        }
    }

    private void verifyResultsFastDistanceFloat3Float3Float(Allocation inLeftVector, Allocation inRightVector, Allocation out, boolean relaxed) {
        float[] arrayInLeftVector = new float[INPUTSIZE * 4];
        inLeftVector.copyTo(arrayInLeftVector);
        float[] arrayInRightVector = new float[INPUTSIZE * 4];
        inRightVector.copyTo(arrayInRightVector);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLeftVector = new float[3];
            args.inRightVector = new float[3];
            // Fill args with the input values
            for (int j = 0; j < 3 ; j++) {
                args.inLeftVector[j] = arrayInLeftVector[i * 4 + j];
            }
            for (int j = 0; j < 3 ; j++) {
                args.inRightVector[j] = arrayInRightVector[i * 4 + j];
            }
            Target target = new Target(relaxed);
            CoreMathVerifier.computeFastDistance(args, target);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 3 ; j++) {
                    message.append("Input inLeftVector: ");
                    appendVariableToMessage(message, arrayInLeftVector[i * 4 + j]);
                    message.append("\n");
                }
                for (int j = 0; j < 3 ; j++) {
                    message.append("Input inRightVector: ");
                    appendVariableToMessage(message, arrayInRightVector[i * 4 + j]);
                    message.append("\n");
                }
                message.append("Expected output out: ");
                appendVariableToMessage(message, args.out);
                message.append("\n");
                message.append("Actual   output out: ");
                appendVariableToMessage(message, arrayOut[i]);
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkFastDistanceFloat3Float3Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    private void checkFastDistanceFloat4Float4Float() {
        Allocation inLeftVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0xf55483e70b38263al, false);
        Allocation inRightVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x3706013c50873543l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRightVector(inRightVector);
            script.forEach_testFastDistanceFloat4Float4Float(inLeftVector, out);
            verifyResultsFastDistanceFloat4Float4Float(inLeftVector, inRightVector, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat4Float4Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRightVector(inRightVector);
            scriptRelaxed.forEach_testFastDistanceFloat4Float4Float(inLeftVector, out);
            verifyResultsFastDistanceFloat4Float4Float(inLeftVector, inRightVector, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat4Float4Float: " + e.toString());
        }
    }

    private void verifyResultsFastDistanceFloat4Float4Float(Allocation inLeftVector, Allocation inRightVector, Allocation out, boolean relaxed) {
        float[] arrayInLeftVector = new float[INPUTSIZE * 4];
        inLeftVector.copyTo(arrayInLeftVector);
        float[] arrayInRightVector = new float[INPUTSIZE * 4];
        inRightVector.copyTo(arrayInRightVector);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLeftVector = new float[4];
            args.inRightVector = new float[4];
            // Fill args with the input values
            for (int j = 0; j < 4 ; j++) {
                args.inLeftVector[j] = arrayInLeftVector[i * 4 + j];
            }
            for (int j = 0; j < 4 ; j++) {
                args.inRightVector[j] = arrayInRightVector[i * 4 + j];
            }
            Target target = new Target(relaxed);
            CoreMathVerifier.computeFastDistance(args, target);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 4 ; j++) {
                    message.append("Input inLeftVector: ");
                    appendVariableToMessage(message, arrayInLeftVector[i * 4 + j]);
                    message.append("\n");
                }
                for (int j = 0; j < 4 ; j++) {
                    message.append("Input inRightVector: ");
                    appendVariableToMessage(message, arrayInRightVector[i * 4 + j]);
                    message.append("\n");
                }
                message.append("Expected output out: ");
                appendVariableToMessage(message, args.out);
                message.append("\n");
                message.append("Actual   output out: ");
                appendVariableToMessage(message, arrayOut[i]);
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkFastDistanceFloat4Float4Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    public void testFastDistance() {
        checkFastDistanceFloatFloatFloat();
        checkFastDistanceFloat2Float2Float();
        checkFastDistanceFloat3Float3Float();
        checkFastDistanceFloat4Float4Float();
    }
}
