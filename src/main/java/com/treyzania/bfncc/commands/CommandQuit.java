package com.treyzania.bfncc.commands;

import java.io.InputStream;

import com.treyzania.bfncc.FunCompiler;

public class CommandQuit extends Command {

	@Override
	public char[] getChars() {
		return new char[] { 'q' };
	}

	@Override
	public void add(FunCompiler comp, char c, InputStream script) {
		
		comp.endReached = true; // The return is handled by the FunCompiler class.
		
	}

}
