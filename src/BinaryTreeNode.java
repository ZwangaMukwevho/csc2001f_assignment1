// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTreeNode<dataType>
{
   dataType data;
	dataType data1;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   
   public BinaryTreeNode ( dataType d, dataType e,BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
	data1 =e;
      left = l;
      right = r;
   }
   
   BinaryTreeNode<dataType> getLeft () { return left; }
   BinaryTreeNode<dataType> getRight () { return right; }
}
