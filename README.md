- 题目

在每行每列都排序的二维数组中查找一个数
- 分析

我们利用每行、每列是排序的这个条件，从矩阵的左下角（或者右上角）为入口，每次将左下角的数与要查找的数做比较：
1. 要查找的数=左下角的数，则存在；
2. 要查找的数<左下角的数，则去掉当前所在的一行，继续从剩下的数组中的左下角开始查找；
3. 要查找的数>左下角的数，则去掉当前所在列，继续从剩下的数组中的左下角开始查找。