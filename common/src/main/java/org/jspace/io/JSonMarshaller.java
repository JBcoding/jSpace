/*******************************************************************************
 * Copyright (c) 2017 Michele Loreti and the jSpace Developers (see the included 
 * authors file).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *******************************************************************************/

package org.jspace.io;

import org.jspace.io.json.jSonUtils;

import java.io.*;


/**
 * @author loreti
 *
 */
public class JSonMarshaller implements jSpaceMarshaller {

	private jSonUtils utils = jSonUtils.getInstance();
	
	public byte[] toByte(Object o) {
		return utils.toByte(o);
	}

	public <T> T fromByte(Class<T> clazz, byte[] data) {
		return utils.fromByte(clazz, data);
	}
	
	public <T> T read(Class<T> clazz, InputStream reader) throws IOException {
		return utils.read(new BufferedReader(new InputStreamReader(reader)), clazz);
	}

	public void write(Object o, OutputStream writer) {
		utils.write(new PrintWriter(new OutputStreamWriter(writer)),o);
	}

}
