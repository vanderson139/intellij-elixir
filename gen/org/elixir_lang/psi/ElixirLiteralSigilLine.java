// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.ericsson.otp.erlang.OtpErlangList;
import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;

public interface ElixirLiteralSigilLine extends LiteralSigilLine, SigilFragmented {

  @Nullable
  ElixirLiteralSigilBody getLiteralSigilBody();

  @Nullable
  ElixirSigilModifiers getSigilModifiers();

  @NotNull
  List<Integer> addEscapedCharacterCodePoints(@Nullable List<Integer> codePointList, @NotNull ASTNode node);

  @NotNull
  List<Integer> addEscapedEOL(@Nullable List<Integer> maybeCodePointList, @NotNull ASTNode node);

  @NotNull
  List<Integer> addFragmentCodePoints(@Nullable List<Integer> codePointList, @NotNull ASTNode node);

  @NotNull
  List<Integer> addHexadecimalEscapeSequenceCodePoints(@Nullable List<Integer> codePointList, @NotNull ASTNode node);

  Body getBody();

  IElementType getFragmentType();

  @NotNull
  OtpErlangObject quote();

  @NotNull
  OtpErlangObject quote(@NotNull OtpErlangObject quotedContent);

  @NotNull
  OtpErlangObject quoteBinary(OtpErlangList metadata, List<OtpErlangObject> argumentList);

  @NotNull
  OtpErlangObject quoteEmpty();

  @NotNull
  OtpErlangObject quoteInterpolation(ElixirInterpolation interpolation);

  @NotNull
  OtpErlangObject quoteLiteral(List<Integer> codePointList);

  String sigilDelimiter();

  char sigilName();

  char terminator();

}
