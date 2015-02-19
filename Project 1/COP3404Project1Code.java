/*
 * Title: COP3404Project1Code
 * Author: Matthew Boyette
 * Date: 2/11/2015
 *
 * The purpose of Project 1 is to implement an efficient hash-based symbol table for the first
 * and second passes of the SIC/XE assembler. It makes use of prime numbers, double hashing, hash
 * chaining, and automatic size adjustment to avoid collisions.
 */

import java.io.File;
import java.util.Scanner;

import api.util.Support;
import api.util.datastructures.SeparateChainingSymbolTable;

public class COP3404Project1Code
{
	public static final void main(final String[] args)
	{
		COP3404Project1Code p1 = new COP3404Project1Code();

		if (args.length > 0)
		{
			for (String arg: args)
			{
				p1.readFile(arg);
			}
		}
		else
		{
			p1.readFile(Support.getFilePath(null, true, Support.promptDebugMode(null)));
		}
	}

	private SeparateChainingSymbolTable<String,Integer>	symbolTable	= null;

	public COP3404Project1Code()
	{
		this.setSymbolTable(new SeparateChainingSymbolTable<String,Integer>());
	}

	public final SeparateChainingSymbolTable<String,Integer> getSymbolTable()
	{
		return this.symbolTable;
	}

	public final void readFile(final String fileName)
	{
		Scanner inputStream = null; // Stream object for file input.

		if ((fileName == null) || fileName.isEmpty()) // Empty strings and Null string pointers fail fast.
		{
			return;
		}

		// Try to read the file.
		try
		{
			// Initialize file stream. If the given path is invalid, an exception is thrown.
			inputStream = new Scanner(new File(fileName));

			while (inputStream.hasNextLine())
			{
				// Get the next line in the file.
				String line = inputStream.nextLine().trim();

				if (line.isEmpty() == false)
				{
					if (line.matches("[a-zA-Z_0-9]+ [a-zA-Z_0-9]+"))
					{
						String s[] = line.split(" ");

						if (this.symbolTable.contains(s[0]))
						{
							System.out.println("ERROR:\t" + s[0] + " already exists at location " + this.symbolTable.hash(s[0]) + ".");
						}
						else
						{
							this.symbolTable.put(s[0], Integer.parseInt(s[1]));
							System.out.println("STORED:\t" + s[0] + " " + s[1] + " at location " + this.symbolTable.hash(s[0]) + ".");
						}
					}
					else
					{
						if (this.symbolTable.contains(line) == false)
						{
							System.out.println("ERROR:\t" + line + " not found.");
						}
						else
						{
							System.out.println("FOUND:\t" + line + " at location " + this.symbolTable.hash(line) + " with value " +
								this.symbolTable.get(line) + ".");
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

	public final void readFile(final String... fileNames)
	{
		for (String fileName: fileNames)
		{
			this.readFile(fileName);
		}
	}

	protected final void setSymbolTable(final SeparateChainingSymbolTable<String,Integer> symbolTable)
	{
		this.symbolTable = symbolTable;
	}
}