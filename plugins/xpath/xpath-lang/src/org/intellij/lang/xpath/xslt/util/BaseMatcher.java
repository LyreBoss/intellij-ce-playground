/*
 * Copyright 2005 Sascha Weinreuter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.lang.xpath.xslt.util;

import org.intellij.lang.xpath.psi.impl.ResolveUtil;
import org.intellij.lang.xpath.xslt.psi.XsltElementFactory;
import org.intellij.lang.xpath.xslt.psi.XsltElement;

import com.intellij.psi.PsiElement;
import com.intellij.psi.xml.XmlTag;

public abstract class BaseMatcher implements ResolveUtil.Matcher {

    protected abstract boolean matches(XmlTag element);

    public Result match(XmlTag element) {
        if (matches(element)) {
            return Result.create(transform(element));
        }
        return null;
    }

    protected PsiElement transform(XmlTag element) {
        return XsltElementFactory.getInstance().wrapElement(element, XsltElement.class);
    }

    public boolean isRecursive() {
        return false;
    }
}
