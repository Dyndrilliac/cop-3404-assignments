/*
 * Title: COP3404Project3Code
 * Author: Matthew Boyette
 * Date: 3/27/2015
 * 
 * This program serves as the entry-point for Projects 3 & 4.
 * See SICXE_AssemblerProgram.java for the implementation.
 */

import api.util.sicxe.SICXE_AssemblerProgram;
import api.util.stdlib.StdOut;

public class COP3404Project3Code
{
	public static void main(final String[] args)
	{
		SICXE_AssemblerProgram[] programs = new SICXE_AssemblerProgram[args.length];
		
		// Read in files as command-line arguments.
		if (args.length > 0)
		{
			for (int i = 0; i < args.length; i++)
			{
				programs[i] = new SICXE_AssemblerProgram(args[i]);
			}
		}
		else
		{
			StdOut.print("Usage:\n\n\tCOP3404Project3Code [File1] [File2] [File#] ...\n\n" +
				"Example:\n\n\tCOP3404Project3Code input test.txt source.asm\n\n");
		}
	}
}