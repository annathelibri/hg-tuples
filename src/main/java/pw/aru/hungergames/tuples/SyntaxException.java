/*
 *  Copyright 2017 An Tran and Adrian Todt
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package pw.aru.hungergames.tuples;

import pw.aru.hungergames.tuples.lexer.Position;

public class SyntaxException extends RuntimeException {
    public SyntaxException(String msg) {
        super(msg);
    }

    public SyntaxException(String msg, Position position) {
        this(msg + position);
    }

    public SyntaxException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public SyntaxException(String s, Position position, Throwable throwable) {
        super(s + position, throwable);
    }

    public SyntaxException(Throwable throwable) {
        super(throwable);
    }
}
