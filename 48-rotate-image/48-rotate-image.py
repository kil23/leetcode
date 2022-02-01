class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        
        l, r = 0, len(matrix) -1
        
        while l < r:
            for i in range(r - l):
                top , bot = l, r
                
                topLeft = matrix[top][l + i]
                
                matrix[top][l + i] = matrix[bot - i][l]
                
                matrix[bot - i][l] = matrix[bot][r - i]
                
                matrix[bot][r - i] = matrix[top + i][r]
                
                matrix[top + i][r] = topLeft
            
            r -= 1
            l += 1
        