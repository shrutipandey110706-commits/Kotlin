# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root): # left rooot right
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]

        """
        result =[]
        def inorder(node):
            if not node:
                return
            inorder(node.left)  #left
            result.append(node.val) #root
            inorder(node.right) #right
        inorder(root) #starts recurssive function
        return result    
