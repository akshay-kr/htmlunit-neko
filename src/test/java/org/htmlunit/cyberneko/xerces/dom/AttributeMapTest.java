/*
 * Copyright (c) 2002-2009 Andy Clark, Marc Guillemot
 * Copyright (c) 2017-2024 Ronald Brill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.htmlunit.cyberneko.xerces.dom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

/**
 * Unit tests for {@link AttributeMap}.
 *
 * @author Marc Guillemot
 */
public class AttributeMapTest {

    @Test
    public void cloneEmpty() throws Exception {
        DocumentImpl doc = new DocumentImpl();
        ElementImpl elem = new ElementImpl(doc, "TestElem");
        AttributeMap map = new AttributeMap(elem);

        NamedNodeMapImpl clone = map.cloneMap(elem);
        assertEquals(0, clone.getLength());
    }


    @Test
    public void cloneOneAttribute() throws Exception {
        DocumentImpl doc = new DocumentImpl();
        ElementImpl elem = new ElementImpl(doc, "TestElem");
        AttributeMap map = new AttributeMap(elem);

        Node attr = new AttrImpl(doc, "TestAttr");
        map.setNamedItem(attr);

        NamedNodeMapImpl clone = map.cloneMap(elem);
        assertEquals(0, clone.getLength());
    }
}
