JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	COP3404Project1Code.java \
	SeparateChainingSymbolTable.java \
	SequentialSearchSymbolTable.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
