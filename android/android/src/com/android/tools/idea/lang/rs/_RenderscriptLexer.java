/* The following code was generated by JFlex 1.4.3 on 2/4/13 1:13 PM */

/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.android.tools.idea.lang.rs;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

/** A lexer for Renderscript files, generated from renderscript.flex using JFlex. */

class _RenderscriptLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\7\1\3\1\2\1\0\1\3\1\1\16\7\4\0\1\3\1\72"+
    "\1\25\1\0\1\6\1\72\1\76\1\23\1\67\1\67\1\5\1\100"+
    "\1\70\1\22\1\20\1\4\1\10\1\16\2\15\4\15\2\11\1\75"+
    "\1\70\1\73\1\71\1\74\1\75\1\0\1\65\1\57\1\60\1\14"+
    "\1\21\1\17\2\6\1\61\2\6\1\12\5\6\1\63\1\66\1\62"+
    "\1\64\2\6\1\13\2\6\1\67\1\24\1\67\1\72\1\56\1\0"+
    "\1\26\1\40\1\32\1\43\1\34\1\44\1\50\1\35\1\42\1\6"+
    "\1\41\1\45\1\46\1\37\1\31\1\54\1\6\1\36\1\33\1\30"+
    "\1\27\1\55\1\52\1\47\1\53\1\51\1\67\1\77\1\67\1\75"+
    "\41\7\2\0\4\6\4\0\1\6\2\0\1\7\7\0\1\6\4\0"+
    "\1\6\5\0\27\6\1\0\37\6\1\0\u013f\6\31\0\162\6\4\0"+
    "\14\6\16\0\5\6\11\0\1\6\21\0\130\7\5\0\23\7\12\0"+
    "\1\6\13\0\1\6\1\0\3\6\1\0\1\6\1\0\24\6\1\0"+
    "\54\6\1\0\46\6\1\0\5\6\4\0\202\6\1\0\4\7\3\0"+
    "\105\6\1\0\46\6\2\0\2\6\6\0\20\6\41\0\46\6\2\0"+
    "\1\6\7\0\47\6\11\0\21\7\1\0\27\7\1\0\3\7\1\0"+
    "\1\7\1\0\2\7\1\0\1\7\13\0\33\6\5\0\3\6\15\0"+
    "\4\7\14\0\6\7\13\0\32\6\5\0\13\6\16\7\7\0\12\7"+
    "\4\0\2\6\1\7\143\6\1\0\1\6\10\7\1\0\6\7\2\6"+
    "\2\7\1\0\4\7\2\6\12\7\3\6\2\0\1\6\17\0\1\7"+
    "\1\6\1\7\36\6\33\7\2\0\3\6\60\0\46\6\13\7\1\6"+
    "\u014f\0\3\7\66\6\2\0\1\7\1\6\20\7\2\0\1\6\4\7"+
    "\3\0\12\6\2\7\2\0\12\7\21\0\3\7\1\0\10\6\2\0"+
    "\2\6\2\0\26\6\1\0\7\6\1\0\1\6\3\0\4\6\2\0"+
    "\1\7\1\6\7\7\2\0\2\7\2\0\3\7\11\0\1\7\4\0"+
    "\2\6\1\0\3\6\2\7\2\0\12\7\4\6\15\0\3\7\1\0"+
    "\6\6\4\0\2\6\2\0\26\6\1\0\7\6\1\0\2\6\1\0"+
    "\2\6\1\0\2\6\2\0\1\7\1\0\5\7\4\0\2\7\2\0"+
    "\3\7\13\0\4\6\1\0\1\6\7\0\14\7\3\6\14\0\3\7"+
    "\1\0\11\6\1\0\3\6\1\0\26\6\1\0\7\6\1\0\2\6"+
    "\1\0\5\6\2\0\1\7\1\6\10\7\1\0\3\7\1\0\3\7"+
    "\2\0\1\6\17\0\2\6\2\7\2\0\12\7\1\0\1\6\17\0"+
    "\3\7\1\0\10\6\2\0\2\6\2\0\26\6\1\0\7\6\1\0"+
    "\2\6\1\0\5\6\2\0\1\7\1\6\6\7\3\0\2\7\2\0"+
    "\3\7\10\0\2\7\4\0\2\6\1\0\3\6\4\0\12\7\1\0"+
    "\1\6\20\0\1\7\1\6\1\0\6\6\3\0\3\6\1\0\4\6"+
    "\3\0\2\6\1\0\1\6\1\0\2\6\3\0\2\6\3\0\3\6"+
    "\3\0\10\6\1\0\3\6\4\0\5\7\3\0\3\7\1\0\4\7"+
    "\11\0\1\7\17\0\11\7\11\0\1\6\7\0\3\7\1\0\10\6"+
    "\1\0\3\6\1\0\27\6\1\0\12\6\1\0\5\6\4\0\7\7"+
    "\1\0\3\7\1\0\4\7\7\0\2\7\11\0\2\6\4\0\12\7"+
    "\22\0\2\7\1\0\10\6\1\0\3\6\1\0\27\6\1\0\12\6"+
    "\1\0\5\6\2\0\1\7\1\6\7\7\1\0\3\7\1\0\4\7"+
    "\7\0\2\7\7\0\1\6\1\0\2\6\4\0\12\7\22\0\2\7"+
    "\1\0\10\6\1\0\3\6\1\0\27\6\1\0\20\6\4\0\6\7"+
    "\2\0\3\7\1\0\4\7\11\0\1\7\10\0\2\6\4\0\12\7"+
    "\22\0\2\7\1\0\22\6\3\0\30\6\1\0\11\6\1\0\1\6"+
    "\2\0\7\6\3\0\1\7\4\0\6\7\1\0\1\7\1\0\10\7"+
    "\22\0\2\7\15\0\60\6\1\7\2\6\7\7\4\0\10\6\10\7"+
    "\1\0\12\7\47\0\2\6\1\0\1\6\2\0\2\6\1\0\1\6"+
    "\2\0\1\6\6\0\4\6\1\0\7\6\1\0\3\6\1\0\1\6"+
    "\1\0\1\6\2\0\2\6\1\0\4\6\1\7\2\6\6\7\1\0"+
    "\2\7\1\6\2\0\5\6\1\0\1\6\1\0\6\7\2\0\12\7"+
    "\2\0\2\6\42\0\1\6\27\0\2\7\6\0\12\7\13\0\1\7"+
    "\1\0\1\7\1\0\1\7\4\0\2\7\10\6\1\0\42\6\6\0"+
    "\24\7\1\0\2\7\4\6\4\0\10\7\1\0\44\7\11\0\1\7"+
    "\71\0\42\6\1\0\5\6\1\0\2\6\1\0\7\7\3\0\4\7"+
    "\6\0\12\7\6\0\6\6\4\7\106\0\46\6\12\0\51\6\7\0"+
    "\132\6\5\0\104\6\5\0\122\6\6\0\7\6\1\0\77\6\1\0"+
    "\1\6\1\0\4\6\2\0\7\6\1\0\1\6\1\0\4\6\2\0"+
    "\47\6\1\0\1\6\1\0\4\6\2\0\37\6\1\0\1\6\1\0"+
    "\4\6\2\0\7\6\1\0\1\6\1\0\4\6\2\0\7\6\1\0"+
    "\7\6\1\0\27\6\1\0\37\6\1\0\1\6\1\0\4\6\2\0"+
    "\7\6\1\0\47\6\1\0\23\6\16\0\11\7\56\0\125\6\14\0"+
    "\u026c\6\2\0\10\6\12\0\32\6\5\0\113\6\3\0\3\6\17\0"+
    "\15\6\1\0\4\6\3\7\13\0\22\6\3\7\13\0\22\6\2\7"+
    "\14\0\15\6\1\0\3\6\1\0\2\7\14\0\64\6\40\7\3\0"+
    "\1\6\3\0\2\6\1\7\2\0\12\7\41\0\3\7\2\0\12\7"+
    "\6\0\130\6\10\0\51\6\1\7\126\0\35\6\3\0\14\7\4\0"+
    "\14\7\12\0\12\7\36\6\2\0\5\6\u038b\0\154\6\224\0\234\6"+
    "\4\0\132\6\6\0\26\6\2\0\6\6\2\0\46\6\2\0\6\6"+
    "\2\0\10\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0\37\6"+
    "\2\0\65\6\1\0\7\6\1\0\1\6\3\0\3\6\1\0\7\6"+
    "\3\0\4\6\2\0\6\6\4\0\15\6\5\0\3\6\1\0\7\6"+
    "\17\0\4\7\32\0\5\7\20\0\2\6\23\0\1\6\13\0\4\7"+
    "\6\0\6\7\1\0\1\6\15\0\1\6\40\0\22\6\36\0\15\7"+
    "\4\0\1\7\3\0\6\7\27\0\1\6\4\0\1\6\2\0\12\6"+
    "\1\0\1\6\3\0\5\6\6\0\1\6\1\0\1\6\1\0\1\6"+
    "\1\0\4\6\1\0\3\6\1\0\7\6\3\0\3\6\5\0\5\6"+
    "\26\0\44\6\u0e81\0\3\6\31\0\11\6\6\7\1\0\5\6\2\0"+
    "\5\6\4\0\126\6\2\0\2\7\2\0\3\6\1\0\137\6\5\0"+
    "\50\6\4\0\136\6\21\0\30\6\70\0\20\6\u0200\0\u19b6\6\112\0"+
    "\u51a6\6\132\0\u048d\6\u0773\0\u2ba4\6\u215c\0\u012e\6\2\0\73\6\225\0"+
    "\7\6\14\0\5\6\5\0\1\6\1\7\12\6\1\0\15\6\1\0"+
    "\5\6\1\0\1\6\1\0\2\6\1\0\2\6\1\0\154\6\41\0"+
    "\u016b\6\22\0\100\6\2\0\66\6\50\0\15\6\3\0\20\7\20\0"+
    "\4\7\17\0\2\6\30\0\3\6\31\0\1\6\6\0\5\6\1\0"+
    "\207\6\2\0\1\7\4\0\1\6\13\0\12\7\7\0\32\6\4\0"+
    "\1\6\1\0\32\6\12\0\132\6\3\0\6\6\2\0\6\6\2\0"+
    "\6\6\2\0\3\6\3\0\2\6\3\0\2\6\22\0\3\7\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\3\1\4\2\5\1\4\1\6"+
    "\1\3\1\7\1\10\22\4\1\11\1\6\6\3\1\12"+
    "\1\0\3\5\1\0\3\5\1\0\1\4\2\7\2\10"+
    "\20\4\2\13\12\4\2\12\2\0\4\5\1\0\40\4"+
    "\1\0\2\5\23\4\2\5\12\4\2\5\4\4\2\5"+
    "\2\4\2\5\1\4\2\5\1\4\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\5\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\101\0\202\0\101\0\303\0\u0104\0\u0145\0\u0186"+
    "\0\u01c7\0\u0208\0\u0249\0\u028a\0\u02cb\0\u030c\0\u034d\0\u038e"+
    "\0\u03cf\0\u0410\0\u0451\0\u0492\0\u04d3\0\u0514\0\u0555\0\u0596"+
    "\0\u05d7\0\u0618\0\u0659\0\u069a\0\u06db\0\u071c\0\u075d\0\u079e"+
    "\0\101\0\101\0\u07df\0\u0820\0\101\0\u0861\0\u08a2\0\u08e3"+
    "\0\u0924\0\u0965\0\u09a6\0\u09e7\0\101\0\u0a28\0\u0a69\0\u0aaa"+
    "\0\u0aeb\0\u0b2c\0\u0b6d\0\101\0\u0bae\0\u0bef\0\101\0\u0c30"+
    "\0\u0c71\0\u0cb2\0\u0cf3\0\u0d34\0\u0d75\0\u0db6\0\u0df7\0\u0e38"+
    "\0\u0e79\0\u0eba\0\u0efb\0\u0f3c\0\u0f7d\0\u0fbe\0\u0fff\0\u0145"+
    "\0\u1040\0\u1081\0\u10c2\0\u1103\0\u1144\0\u1185\0\u11c6\0\u1207"+
    "\0\u1248\0\u1289\0\u12ca\0\u130b\0\101\0\u134c\0\u138d\0\u13ce"+
    "\0\u140f\0\u1450\0\u1491\0\u14d2\0\u1513\0\u1554\0\u1595\0\u15d6"+
    "\0\u1617\0\u1658\0\u1699\0\u16da\0\u171b\0\u175c\0\u179d\0\u17de"+
    "\0\u181f\0\u1860\0\u18a1\0\u18e2\0\u1923\0\u1964\0\u19a5\0\u19e6"+
    "\0\u1a27\0\u1a68\0\u1aa9\0\u1aea\0\u1b2b\0\u1b6c\0\u1bad\0\u1bee"+
    "\0\u1c2f\0\u1c70\0\u1cb1\0\u1cf2\0\u1d33\0\u1d74\0\u1db5\0\u1df6"+
    "\0\u1e37\0\u1e78\0\u1eb9\0\u1efa\0\u1f3b\0\u1f7c\0\u1fbd\0\u1ffe"+
    "\0\u203f\0\u2080\0\u20c1\0\u2102\0\u2143\0\u2184\0\u21c5\0\u2206"+
    "\0\u2247\0\u2288\0\u22c9\0\u230a\0\u234b\0\u238c\0\u23cd\0\u240e"+
    "\0\u244f\0\u2490\0\u24d1\0\u2512\0\u2553\0\u2594\0\u25d5\0\u2616"+
    "\0\u2657\0\u2698\0\u26d9\0\u271a\0\u275b\0\u279c\0\u27dd\0\u281e"+
    "\0\u285f\0\u28a0\0\u28e1\0\u2922\0\u2963\0\u29a4\0\u29e5\0\u2a26"+
    "\0\u2a67\0\u2aa8\0\u2ae9\0\u2b2a\0\u2b6b\0\u2bac\0\u2bed\0\u2c2e"+
    "\0\u2c6f\0\u2cb0\0\u2cf1\0\u2d32\0\u2d73\0\u2db4\0\u2df5\0\u2e36"+
    "\0\u2e77\0\u2eb8\0\u2ef9\0\u2f3a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\3\7\2\11\1\12\1\13\1\7\1\14\1\15"+
    "\1\2\1\16\1\17\1\20\1\21\1\7\1\22\1\23"+
    "\1\24\1\7\1\25\1\26\1\27\1\7\1\30\1\31"+
    "\1\32\1\33\2\7\1\34\1\7\1\35\2\7\1\36"+
    "\1\37\3\7\1\40\4\7\1\41\1\42\2\6\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\103\0\1\4\102\0"+
    "\1\51\1\52\63\0\1\45\100\0\1\45\15\0\12\7"+
    "\1\0\1\7\4\0\41\7\22\0\1\53\1\54\1\55"+
    "\1\56\1\55\1\57\1\60\1\55\1\61\1\62\12\0"+
    "\1\62\6\0\3\55\1\0\1\56\41\0\2\11\1\55"+
    "\1\0\1\55\2\11\1\55\1\61\1\62\12\0\1\62"+
    "\6\0\3\55\41\0\12\7\1\0\1\7\4\0\37\7"+
    "\1\63\1\7\22\0\2\61\3\0\2\61\104\0\1\45"+
    "\46\0\1\45\7\0\1\15\2\0\20\15\1\64\1\65"+
    "\54\15\1\16\2\0\21\16\1\66\1\67\53\16\6\0"+
    "\12\7\1\0\1\7\4\0\1\7\1\70\37\7\20\0"+
    "\12\7\1\0\1\7\4\0\11\7\1\71\27\7\20\0"+
    "\12\7\1\0\1\7\4\0\25\7\1\72\13\7\20\0"+
    "\12\7\1\0\1\7\4\0\1\73\2\7\1\74\3\7"+
    "\1\75\31\7\20\0\12\7\1\0\1\7\4\0\2\7"+
    "\1\76\4\7\1\77\4\7\1\100\7\7\1\101\14\7"+
    "\20\0\12\7\1\0\1\7\4\0\11\7\1\102\5\7"+
    "\1\73\1\7\1\103\17\7\20\0\12\7\1\0\1\7"+
    "\4\0\6\7\1\104\32\7\20\0\12\7\1\0\1\7"+
    "\4\0\1\7\1\105\37\7\20\0\12\7\1\0\1\7"+
    "\4\0\10\7\1\106\30\7\20\0\12\7\1\0\1\7"+
    "\4\0\11\7\1\107\4\7\1\110\22\7\20\0\12\7"+
    "\1\0\1\7\4\0\3\7\1\111\2\7\1\112\32\7"+
    "\20\0\12\7\1\0\1\7\4\0\3\7\1\113\13\7"+
    "\1\114\21\7\20\0\12\7\1\0\1\7\4\0\3\7"+
    "\1\115\35\7\20\0\12\7\1\0\1\7\4\0\3\7"+
    "\1\70\35\7\20\0\12\7\1\0\1\7\4\0\7\7"+
    "\1\116\31\7\20\0\12\7\1\0\1\7\4\0\3\7"+
    "\1\117\35\7\20\0\12\7\1\0\1\7\4\0\31\7"+
    "\1\120\1\121\1\122\5\7\20\0\12\7\1\0\1\7"+
    "\4\0\35\7\1\123\3\7\103\0\1\45\1\0\1\6"+
    "\76\0\1\45\2\0\1\6\75\0\1\45\4\0\1\45"+
    "\73\0\1\45\5\0\1\45\72\0\1\45\6\0\1\45"+
    "\1\51\1\124\1\125\76\51\5\126\1\127\73\126\10\0"+
    "\1\53\1\54\1\55\1\0\1\55\1\57\1\60\1\55"+
    "\1\61\1\62\12\0\1\62\6\0\3\55\43\0\2\54"+
    "\2\0\1\55\2\54\1\55\1\61\1\62\12\0\1\62"+
    "\6\0\2\55\44\0\1\130\1\131\2\0\4\131\1\0"+
    "\1\131\4\0\1\131\3\0\1\131\1\0\1\131\3\0"+
    "\1\131\2\0\2\131\12\0\2\131\4\0\1\131\23\0"+
    "\1\132\1\54\1\55\1\0\1\55\2\132\1\55\1\61"+
    "\1\62\12\0\1\62\6\0\3\55\43\0\1\57\1\54"+
    "\1\55\1\0\1\55\2\57\1\55\1\61\1\62\12\0"+
    "\1\62\6\0\3\55\43\0\2\61\2\0\1\55\2\61"+
    "\1\55\1\0\1\62\12\0\1\62\6\0\2\55\44\0"+
    "\2\133\3\0\2\133\3\0\1\134\55\0\1\134\6\0"+
    "\4\7\1\135\5\7\1\0\1\7\4\0\41\7\12\0"+
    "\1\15\2\0\76\15\1\16\2\0\76\16\6\0\12\7"+
    "\1\0\1\7\4\0\2\7\1\136\36\7\20\0\12\7"+
    "\1\0\1\7\4\0\5\7\1\137\6\7\1\140\24\7"+
    "\20\0\12\7\1\0\1\7\4\0\26\7\1\141\12\7"+
    "\20\0\12\7\1\0\1\7\4\0\5\7\1\142\33\7"+
    "\20\0\12\7\1\0\1\7\4\0\11\7\1\143\27\7"+
    "\20\0\12\7\1\0\1\7\4\0\1\113\40\7\20\0"+
    "\12\7\1\0\1\7\4\0\1\144\7\7\1\145\30\7"+
    "\20\0\12\7\1\0\1\7\4\0\3\7\1\146\35\7"+
    "\20\0\12\7\1\0\1\7\4\0\22\7\1\147\1\150"+
    "\15\7\20\0\12\7\1\0\1\7\4\0\14\7\1\151"+
    "\24\7\20\0\12\7\1\0\1\7\4\0\1\7\1\152"+
    "\37\7\20\0\12\7\1\0\1\7\4\0\2\7\1\153"+
    "\36\7\20\0\12\7\1\0\1\7\4\0\2\7\1\154"+
    "\2\7\1\155\14\7\1\156\16\7\20\0\12\7\1\0"+
    "\1\7\4\0\17\7\1\157\21\7\20\0\12\7\1\0"+
    "\1\7\4\0\6\7\1\160\32\7\20\0\12\7\1\0"+
    "\1\7\4\0\2\7\1\110\14\7\1\161\21\7\20\0"+
    "\12\7\1\0\1\7\4\0\1\7\1\162\37\7\20\0"+
    "\12\7\1\0\1\7\4\0\16\7\1\163\22\7\20\0"+
    "\12\7\1\0\1\7\4\0\10\7\1\110\30\7\20\0"+
    "\12\7\1\0\1\7\4\0\3\7\1\164\35\7\20\0"+
    "\12\7\1\0\1\7\4\0\11\7\1\165\27\7\20\0"+
    "\12\7\1\0\1\7\4\0\14\7\1\166\24\7\20\0"+
    "\12\7\1\0\1\7\4\0\14\7\1\167\2\7\1\170"+
    "\21\7\20\0\12\7\1\0\1\7\4\0\3\7\1\171"+
    "\35\7\20\0\12\7\1\0\1\7\4\0\3\7\1\172"+
    "\35\7\20\0\12\7\1\0\1\7\4\0\20\7\1\173"+
    "\20\7\20\0\12\7\1\0\1\7\4\0\36\7\1\174"+
    "\2\7\14\0\1\125\76\0\5\126\1\175\73\126\4\0"+
    "\1\125\1\127\103\0\1\130\1\131\1\55\1\0\4\131"+
    "\1\0\1\131\4\0\1\131\3\0\1\131\1\0\1\131"+
    "\3\0\1\131\2\0\2\131\1\55\11\0\2\131\4\0"+
    "\1\131\23\0\2\176\1\55\1\0\4\176\1\0\1\176"+
    "\4\0\1\176\3\0\1\176\1\0\1\176\3\0\1\176"+
    "\2\0\2\176\1\55\11\0\2\176\4\0\1\176\23\0"+
    "\1\177\1\54\1\55\1\0\1\55\2\177\1\55\1\61"+
    "\1\62\12\0\1\62\6\0\3\55\43\0\2\133\2\0"+
    "\1\55\2\133\1\55\23\0\2\55\44\0\2\133\3\0"+
    "\2\133\70\0\12\7\1\0\1\7\4\0\40\7\1\174"+
    "\20\0\12\7\1\0\1\7\4\0\3\7\1\110\35\7"+
    "\20\0\12\7\1\0\1\7\4\0\14\7\1\200\24\7"+
    "\20\0\12\7\1\0\1\7\4\0\3\7\1\201\35\7"+
    "\20\0\12\7\1\0\1\7\4\0\6\7\1\202\32\7"+
    "\20\0\12\7\1\0\1\7\4\0\6\7\1\110\32\7"+
    "\20\0\12\7\1\0\1\7\4\0\2\7\1\203\2\7"+
    "\1\204\33\7\20\0\12\7\1\0\1\7\4\0\2\7"+
    "\1\205\36\7\20\0\12\7\1\0\1\7\4\0\1\7"+
    "\1\206\37\7\20\0\12\7\1\0\1\7\4\0\10\7"+
    "\1\204\30\7\20\0\12\7\1\0\1\7\4\0\11\7"+
    "\1\207\27\7\20\0\12\7\1\0\1\7\4\0\6\7"+
    "\1\210\32\7\20\0\12\7\1\0\1\7\4\0\2\7"+
    "\1\211\36\7\20\0\12\7\1\0\1\7\4\0\20\7"+
    "\1\110\20\7\20\0\12\7\1\0\1\7\4\0\6\7"+
    "\1\212\32\7\20\0\12\7\1\0\1\7\4\0\1\7"+
    "\1\212\37\7\20\0\12\7\1\0\1\7\4\0\2\7"+
    "\1\213\36\7\20\0\12\7\1\0\1\7\4\0\14\7"+
    "\1\214\24\7\20\0\12\7\1\0\1\7\4\0\17\7"+
    "\1\110\21\7\20\0\12\7\1\0\1\7\4\0\1\215"+
    "\40\7\20\0\12\7\1\0\1\7\4\0\14\7\1\216"+
    "\24\7\20\0\12\7\1\0\1\7\4\0\12\7\1\166"+
    "\26\7\20\0\12\7\1\0\1\7\4\0\1\217\40\7"+
    "\20\0\12\7\1\0\1\7\4\0\1\204\40\7\20\0"+
    "\12\7\1\0\1\7\4\0\22\7\1\110\16\7\20\0"+
    "\12\7\1\0\1\7\4\0\17\7\1\142\21\7\20\0"+
    "\12\7\1\0\1\7\4\0\15\7\1\110\23\7\20\0"+
    "\12\7\1\0\1\7\4\0\1\220\40\7\20\0\12\7"+
    "\1\0\1\7\4\0\3\7\1\157\35\7\20\0\12\7"+
    "\1\0\1\7\4\0\20\7\1\221\20\7\20\0\12\7"+
    "\1\0\1\7\4\0\1\222\40\7\20\0\12\7\1\0"+
    "\1\110\4\0\41\7\12\0\4\126\1\125\1\175\73\126"+
    "\10\0\2\223\1\55\1\0\4\223\1\0\1\223\4\0"+
    "\1\223\3\0\1\223\1\0\1\223\3\0\1\223\2\0"+
    "\2\223\1\55\11\0\2\223\4\0\1\223\23\0\1\224"+
    "\1\54\1\55\1\0\1\55\2\224\1\55\1\61\1\62"+
    "\12\0\1\62\6\0\3\55\41\0\12\7\1\0\1\7"+
    "\4\0\22\7\1\147\16\7\20\0\12\7\1\0\1\7"+
    "\4\0\11\7\1\110\27\7\20\0\12\7\1\0\1\7"+
    "\4\0\15\7\1\225\23\7\20\0\12\7\1\0\1\7"+
    "\4\0\14\7\1\226\24\7\20\0\12\7\1\0\1\7"+
    "\4\0\2\7\1\110\36\7\20\0\12\7\1\0\1\7"+
    "\4\0\14\7\1\227\24\7\20\0\12\7\1\0\1\7"+
    "\4\0\4\7\1\204\34\7\20\0\12\7\1\0\1\7"+
    "\4\0\6\7\1\167\32\7\20\0\12\7\1\0\1\7"+
    "\4\0\3\7\1\230\35\7\20\0\12\7\1\0\1\7"+
    "\4\0\4\7\1\231\34\7\20\0\12\7\1\0\1\7"+
    "\4\0\10\7\1\201\30\7\20\0\12\7\1\0\1\7"+
    "\4\0\10\7\1\232\30\7\20\0\12\7\1\0\1\7"+
    "\4\0\5\7\1\233\33\7\20\0\12\7\1\0\1\7"+
    "\4\0\13\7\1\110\25\7\20\0\12\7\1\0\1\7"+
    "\4\0\11\7\1\142\27\7\20\0\12\7\1\0\1\7"+
    "\4\0\1\7\1\234\37\7\20\0\12\7\1\0\1\7"+
    "\4\0\2\7\1\116\36\7\20\0\12\7\1\0\1\7"+
    "\4\0\26\7\1\235\12\7\20\0\12\7\1\0\1\7"+
    "\4\0\22\7\1\236\16\7\22\0\2\237\1\55\1\0"+
    "\4\237\1\0\1\237\4\0\1\237\3\0\1\237\1\0"+
    "\1\237\3\0\1\237\2\0\2\237\1\55\11\0\2\237"+
    "\4\0\1\237\23\0\1\240\1\54\1\55\1\0\1\55"+
    "\2\240\1\55\1\61\1\62\12\0\1\62\6\0\3\55"+
    "\41\0\12\7\1\0\1\7\4\0\6\7\1\230\32\7"+
    "\20\0\12\7\1\0\1\7\4\0\11\7\1\241\27\7"+
    "\20\0\12\7\1\0\1\7\4\0\4\7\1\110\34\7"+
    "\20\0\12\7\1\0\1\7\4\0\16\7\1\110\22\7"+
    "\20\0\12\7\1\0\1\7\4\0\7\7\1\110\31\7"+
    "\20\0\12\7\1\0\1\7\4\0\14\7\1\206\24\7"+
    "\20\0\12\7\1\0\1\7\4\0\2\7\1\242\36\7"+
    "\20\0\12\7\1\0\1\7\4\0\17\7\1\204\21\7"+
    "\20\0\12\7\1\0\1\7\4\0\17\7\1\243\21\7"+
    "\20\0\12\7\1\0\1\7\4\0\14\7\1\244\24\7"+
    "\22\0\2\245\1\55\1\0\4\245\1\0\1\245\4\0"+
    "\1\245\3\0\1\245\1\0\1\245\3\0\1\245\2\0"+
    "\2\245\1\55\11\0\2\245\4\0\1\245\23\0\1\246"+
    "\1\54\1\55\1\0\1\55\2\246\1\55\1\61\1\62"+
    "\12\0\1\62\6\0\3\55\41\0\12\7\1\0\1\7"+
    "\4\0\1\7\1\142\37\7\20\0\12\7\1\0\1\7"+
    "\4\0\6\7\1\113\32\7\20\0\12\7\1\0\1\7"+
    "\4\0\6\7\1\247\32\7\20\0\12\7\1\0\1\7"+
    "\4\0\11\7\1\250\27\7\22\0\2\251\1\55\1\0"+
    "\4\251\1\0\1\251\4\0\1\251\3\0\1\251\1\0"+
    "\1\251\3\0\1\251\2\0\2\251\1\55\11\0\2\251"+
    "\4\0\1\251\23\0\1\252\1\54\1\55\1\0\1\55"+
    "\2\252\1\55\1\61\1\62\12\0\1\62\6\0\3\55"+
    "\41\0\12\7\1\0\1\7\4\0\21\7\1\110\17\7"+
    "\20\0\12\7\1\0\1\7\4\0\1\253\40\7\22\0"+
    "\2\254\1\55\1\0\4\254\1\0\1\254\4\0\1\254"+
    "\3\0\1\254\1\0\1\254\3\0\1\254\2\0\2\254"+
    "\1\55\11\0\2\254\4\0\1\254\23\0\1\255\1\54"+
    "\1\55\1\0\1\55\2\255\1\55\1\61\1\62\12\0"+
    "\1\62\6\0\3\55\41\0\12\7\1\0\1\7\4\0"+
    "\10\7\1\256\30\7\22\0\2\257\1\55\1\0\4\257"+
    "\1\0\1\257\4\0\1\257\3\0\1\257\1\0\1\257"+
    "\3\0\1\257\2\0\2\257\1\55\11\0\2\257\4\0"+
    "\1\257\23\0\1\260\1\54\1\55\1\0\1\55\2\260"+
    "\1\55\1\61\1\62\12\0\1\62\6\0\3\55\41\0"+
    "\12\7\1\0\1\7\4\0\25\7\1\110\13\7\22\0"+
    "\2\261\1\55\1\0\4\261\1\0\1\261\4\0\1\261"+
    "\3\0\1\261\1\0\1\261\3\0\1\261\2\0\2\261"+
    "\1\55\11\0\2\261\4\0\1\261\23\0\1\262\1\54"+
    "\1\55\1\0\1\55\2\262\1\55\1\61\1\62\12\0"+
    "\1\62\6\0\3\55\43\0\2\263\1\55\1\0\4\263"+
    "\1\0\1\263\4\0\1\263\3\0\1\263\1\0\1\263"+
    "\3\0\1\263\2\0\2\263\1\55\11\0\2\263\4\0"+
    "\1\263\23\0\1\264\1\54\1\55\1\0\1\55\2\264"+
    "\1\55\1\61\1\62\12\0\1\62\6\0\3\55\43\0"+
    "\2\265\1\55\1\0\4\265\1\0\1\265\4\0\1\265"+
    "\3\0\1\265\1\0\1\265\3\0\1\265\2\0\2\265"+
    "\1\55\11\0\2\265\4\0\1\265\23\0\1\266\1\54"+
    "\1\55\1\0\1\55\2\266\1\55\1\61\1\62\12\0"+
    "\1\62\6\0\3\55\43\0\2\267\1\55\1\0\4\267"+
    "\1\0\1\267\4\0\1\267\3\0\1\267\1\0\1\267"+
    "\3\0\1\267\2\0\2\267\1\55\11\0\2\267\4\0"+
    "\1\267\23\0\1\270\1\54\1\55\1\0\1\55\2\270"+
    "\1\55\1\61\1\62\12\0\1\62\6\0\3\55\43\0"+
    "\2\271\1\55\1\0\4\271\1\0\1\271\4\0\1\271"+
    "\3\0\1\271\1\0\1\271\3\0\1\271\2\0\2\271"+
    "\1\55\11\0\2\271\4\0\1\271\23\0\1\272\1\54"+
    "\1\55\1\0\1\55\2\272\1\55\1\61\1\62\12\0"+
    "\1\62\6\0\3\55\43\0\2\273\1\55\1\0\4\273"+
    "\1\0\1\273\4\0\1\273\3\0\1\273\1\0\1\273"+
    "\3\0\1\273\2\0\2\273\1\55\11\0\2\273\4\0"+
    "\1\273\23\0\1\274\1\54\1\55\1\0\1\55\2\274"+
    "\1\55\1\61\1\62\12\0\1\62\6\0\3\55\43\0"+
    "\2\275\1\55\1\0\4\275\1\0\1\275\4\0\1\275"+
    "\3\0\1\275\1\0\1\275\3\0\1\275\2\0\2\275"+
    "\1\55\11\0\2\275\4\0\1\275\23\0\1\276\1\54"+
    "\1\55\1\0\1\55\2\276\1\55\1\61\1\62\12\0"+
    "\1\62\6\0\3\55\43\0\2\277\1\55\1\0\4\277"+
    "\1\0\1\277\4\0\1\277\3\0\1\277\1\0\1\277"+
    "\3\0\1\277\2\0\2\277\1\55\11\0\2\277\4\0"+
    "\1\277\23\0\1\300\1\54\1\55\1\0\1\55\2\300"+
    "\1\55\1\61\1\62\12\0\1\62\6\0\3\55\45\0"+
    "\1\55\32\0\1\55\43\0\1\301\1\54\1\55\1\0"+
    "\1\55\2\301\1\55\1\61\1\62\12\0\1\62\6\0"+
    "\3\55\43\0\1\302\1\54\1\55\1\0\1\55\2\302"+
    "\1\55\1\61\1\62\12\0\1\62\6\0\3\55\43\0"+
    "\1\303\1\54\1\55\1\0\1\55\2\303\1\55\1\61"+
    "\1\62\12\0\1\62\6\0\3\55\43\0\1\304\1\54"+
    "\1\55\1\0\1\55\2\304\1\55\1\61\1\62\12\0"+
    "\1\62\6\0\3\55\43\0\2\54\1\55\1\0\1\55"+
    "\2\54\1\55\1\61\1\62\12\0\1\62\6\0\3\55"+
    "\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12155];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\34\1\2\11\2\1\1\11"+
    "\4\1\1\0\2\1\1\11\1\0\3\1\1\0\1\1"+
    "\1\11\2\1\1\11\35\1\1\11\2\0\4\1\1\0"+
    "\40\1\1\0\63\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuilder stringBuilder = new StringBuilder(30);


  _RenderscriptLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _RenderscriptLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1800) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  @Override
  public final int getTokenStart(){
    return zzStartRead;
  }

  @Override
  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  @Override
  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  @Override
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  @Override
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  @Override
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { return RenderscriptTokenType.OPERATOR;
          }
        case 12: break;
        case 9: 
          { return RenderscriptTokenType.BRACE;
          }
        case 13: break;
        case 11: 
          { return RenderscriptTokenType.KEYWORD;
          }
        case 14: break;
        case 6: 
          { return RenderscriptTokenType.SEPARATOR;
          }
        case 15: break;
        case 7: 
          { return RenderscriptTokenType.CHARACTER;
          }
        case 16: break;
        case 10: 
          { return RenderscriptTokenType.COMMENT;
          }
        case 17: break;
        case 4: 
          { return RenderscriptTokenType.IDENTIFIER;
          }
        case 18: break;
        case 8: 
          { return RenderscriptTokenType.STRING;
          }
        case 19: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 20: break;
        case 5: 
          { return RenderscriptTokenType.NUMBER;
          }
        case 21: break;
        case 2: 
          { return TokenType.WHITE_SPACE;
          }
        case 22: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {
                return null;
              }
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}