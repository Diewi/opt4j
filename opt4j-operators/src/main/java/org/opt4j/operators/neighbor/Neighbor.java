/*******************************************************************************
 * Copyright (c) 2014 Opt4J
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
 

package org.opt4j.operators.neighbor;

import org.opt4j.core.Genotype;
import org.opt4j.core.optimizer.Operator;

import com.google.inject.ImplementedBy;

/**
 * The {@link Neighbor} operator as it is used for Simulated Annealing.
 * 
 * @author lukasiewycz
 * 
 * @param <G>
 *            the type of genotype
 */
@ImplementedBy(NeighborGenericImplementation.class)
public interface Neighbor<G extends Genotype> extends Operator<G> {

	/**
	 * Moves the {@link Genotype} to a neighbor.
	 * 
	 * @param genotype
	 *            the {@link Genotype} to be changed
	 */
	public void neighbor(G genotype);

	/* (non-Javadoc)
	 * @see org.opt4j.core.optimizer.Operator#getOperatorType()
	 */
	@SuppressWarnings("unchecked")
	@Override
	default Class<? extends Operator<?>> getOperatorType() {
		return (Class<? extends Operator<?>>)(Class<?>) Neighbor.class;
	}
}
