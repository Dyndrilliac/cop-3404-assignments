/*
	Title:	COP3404Project1Code
	Author:	Matthew Boyette
	Date:	2/11/2015
	
	
*/

import api.util.datastructures.SeparateChainingSymbolTable;

import java.io.File;
import java.util.Scanner;

public class COP3404Project1Code
{	
	public static void main(final String[] args)
	{
		if (args.length > 0)
		{
			for (int i = 0; i < args.length; i++)
			{
				readFile(args[i]);
			}
		}
	}
	
	private static void readFile(final String fileName)
	{
		if ((fileName == null) || fileName.isEmpty())
		{
			return;
		}
		
		SeparateChainingSymbolTable<String,Integer>	symbolTable = new SeparateChainingSymbolTable<String,Integer>();
		Scanner           							inputStream	= null; // Stream object for file input.
		
		// Read in file.
		try
		{
			// Initialize file stream. If the given path is invalid, an exception is thrown.
			inputStream = new Scanner(new File(fileName));
			
			while (inputStream.hasNextLine())
			{
				// Get the next line in the file.
				String line = inputStream.nextLine().trim();
				
				if (line.matches("[a-zA-Z_0-9]+ [a-zA-Z_0-9]+"))
				{
					String s[] = line.split(" ");
					
					if (symbolTable.contains(s[0]))
					{
						System.err.println("ERROR: " + s[0] + " already exists at location " + symbolTable.hash(s[0]) + ".");
					}
					else
					{
						symbolTable.put(s[0], Integer.parseInt(s[1]));
						System.out.println("STORED: " + s[0] + " " + s[1] + " at location " + symbolTable.hash(s[0]) + ".");
					}
				}
				else
				{
					if (line.isEmpty() == false)
					{
						if (symbolTable.contains(line) == false)
						{
							System.err.println("ERROR: " + line + " not found.");
						}
						else
						{
							System.out.println("FOUND: " + line + " at location " + symbolTable.hash(line) + " with value " + 
								symbolTable.get(line) + ".");
						}
					}
				}
			}
		}
		catch (final Exception exception)
		{
			exception.printStackTrace();
		}
		finally
		{
			if (inputStream != null)
			{
				// Close the input stream.
				inputStream.close();
				inputStream = null;
			}
		}
	}
}