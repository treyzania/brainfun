package com.treyzania.bfncc.commands;

import java.io.InputStream;

import com.treyzania.bfncc.FunCompiler;

public class CommandOR extends Command {

	@Override
	public char[] getChars() {
		return new char[] { 'I' };
	}

	@Override
	public void add(FunCompiler comp, char c, InputStream script) {
		comp.appendLine("*dp = *dp[0] | *dp[1];");
	}

}
