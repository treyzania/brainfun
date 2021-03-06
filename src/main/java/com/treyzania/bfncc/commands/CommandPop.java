package com.treyzania.bfncc.commands;

import java.io.InputStream;

import com.treyzania.bfncc.FunCompiler;

public class CommandPop extends Command {

	@Override
	public char[] getChars() {
		return new char[] { 'S' };
	}

	@Override
	public void add(FunCompiler comp, char c, InputStream script) {
		comp.appendLine("*dp = pop_stack();");
	}

}
