# binary search program makefile
# Hussein Suleman
# 27 March 2017

JAVAC=/usr/bin/javac
SRCDIR=src
BINDIR=bin
.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $<

CLASSES: BinaryTreeNode.class BinaryTree.class \
         BTQueueNode.class BTQueue.class \
         BinarySearchTree.class 
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm *.class
