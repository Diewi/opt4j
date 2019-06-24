/*******************************************************************************
 * Copyright (c) 2018 Opt4J
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *******************************************************************************/

package org.opt4j.operators.selection;

import java.util.List;

import org.opt4j.core.Genotype;
import org.opt4j.core.optimizer.Operator;


/**
 * Defines a strategy that selects one {@link Operator} out of {@code n} {@link Operator}s
 * applicable for a single {@link Genotype}.
 *
 * @author diewald
 */
public interface IOperatorSelector {


	/**
	 * Selects one {@link Operator} out of {@code n} {@link Operator}s applicable for a single
	 * {@link Genotype}.
	 *
	 * @param applicableOperators list of applicable {@link Operator}s.
	 * @param genotype {@link Genotype} for which the {@link Operator} shall be applied.
	 * @return selected {@link Operator} from the input list.
	 */
	<O extends Operator<?>> O select(List<O> applicableOperators, Genotype genotype);
}