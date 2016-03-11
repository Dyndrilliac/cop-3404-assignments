/*
 * Title: COP3404Project1Code
 * Author: Matthew Boyette
 * Date: 2/11/2015
 * 
 * This program serves as the entry-point for Project 1. See SimpleSymbolTable.java for the implementation.
 */

import api.util.sicxe.SimpleSymbolTable;
import api.util.stdlib.StdOut;

public class COP3404Project1Code
{
    public static final void main(final String[] args)
    {
        SimpleSymbolTable[] programs = new SimpleSymbolTable[args.length];
        
        // Read in files as command-line arguments.
        if (args.length > 0)
        {
            for (int i = 0; i < args.length; i++)
            {
                programs[i] = new SimpleSymbolTable(args[i]);
            }
        }
        else
        {
            StdOut.print("Usage:\n\n\tCOP3404Project1Code [File1] [File2] [File#] ...\n\n" + "Example:\n\n\tCOP3404Project1Code input test.txt source.asm\n\n");
        }
    }
}