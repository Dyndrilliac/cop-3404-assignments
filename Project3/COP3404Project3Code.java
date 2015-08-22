/*
 * Title: COP3404Project3Code
 * Author: Matthew Boyette
 * Date: 3/27/2015
 * 
 * This program serves as the entry-point for Projects 3 & 4.
 * See SICXE_AssemblerProgram.java for the implementation.
 */

import api.util.sicxe.SICXE_AssemblerProgram;
import api.util.stdlib.StdIn;
import api.util.stdlib.StdOut;

public class COP3404Project3Code
{
	public static final void main(final String[] args)
	{
		SICXE_AssemblerProgram[] programs = new SICXE_AssemblerProgram[Math.max(1, args.length)];
		
		// Read in file names given as command-line arguments.
		if (args.length > 0)
		{
			for (int i = 0; i < args.length; i++)
			{
				programs[i] = new SICXE_AssemblerProgram(args[i]);
			}
		}
		// Prompt the user for a file name if not given one.
		else
		{
			StdOut.print("Enter source file name: ");
			String fileName = StdIn.readString();
			
			if (fileName != null)
			{
				if (!fileName.isEmpty())
				{
					programs[0] = new SICXE_AssemblerProgram(fileName);
				}
			}
		}
	}
}