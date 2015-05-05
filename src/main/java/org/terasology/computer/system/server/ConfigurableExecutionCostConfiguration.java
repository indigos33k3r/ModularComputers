/*
 * Copyright 2015 MovingBlocks
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
package org.terasology.computer.system.server;

import com.gempukku.lang.ExecutionCostConfiguration;

public class ConfigurableExecutionCostConfiguration implements ExecutionCostConfiguration {
    private int getContextValue;
    private int setContextValue;
    private int getReturnValue;
    private int setReturnValue;
    private int breakBlock;
    private int defineVariable;
    private int setVariable;
    private int stackExecution;
    private int stackGroupExecution;
    private int sumValues;
    private int otherMathOperation;
    private int compareValues;
    private int resolveMember;

    @Override
    public int getGetContextValue() {
        return getContextValue;
    }

    public void setGetContextValue(int getContextValue) {
        this.getContextValue = getContextValue;
    }

    @Override
    public int getSetContextValue() {
        return setContextValue;
    }

    public void setSetContextValue(int setContextValue) {
        this.setContextValue = setContextValue;
    }

    @Override
    public int getGetReturnValue() {
        return getReturnValue;
    }

    public void setGetReturnValue(int getReturnValue) {
        this.getReturnValue = getReturnValue;
    }

    @Override
    public int getSetReturnValue() {
        return setReturnValue;
    }

    public void setSetReturnValue(int setReturnValue) {
        this.setReturnValue = setReturnValue;
    }

    @Override
    public int getBreakBlock() {
        return breakBlock;
    }

    public void setBreakBlock(int breakBlock) {
        this.breakBlock = breakBlock;
    }

    @Override
    public int getDefineVariable() {
        return defineVariable;
    }

    public void setDefineVariable(int defineVariable) {
        this.defineVariable = defineVariable;
    }

    @Override
    public int getSetVariable() {
        return setVariable;
    }

    public void setSetVariable(int setVariable) {
        this.setVariable = setVariable;
    }

    @Override
    public int getStackExecution() {
        return stackExecution;
    }

    public void setStackExecution(int stackExecution) {
        this.stackExecution = stackExecution;
    }

    @Override
    public int getStackGroupExecution() {
        return stackGroupExecution;
    }

    public void setStackGroupExecution(int stackGroupExecution) {
        this.stackGroupExecution = stackGroupExecution;
    }

    @Override
    public int getSumValues() {
        return sumValues;
    }

    public void setSumValues(int sumValues) {
        this.sumValues = sumValues;
    }

    @Override
    public int getOtherMathOperation() {
        return otherMathOperation;
    }

    public void setOtherMathOperation(int otherMathOperation) {
        this.otherMathOperation = otherMathOperation;
    }

    @Override
    public int getCompareValues() {
        return compareValues;
    }

    public void setCompareValues(int compareValues) {
        this.compareValues = compareValues;
    }

    @Override
    public int getResolveMember() {
        return resolveMember;
    }

    public void setResolveMember(int resolveMember) {
        this.resolveMember = resolveMember;
    }
}

