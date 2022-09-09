You are given two arrays of integers a and b of the same length, and an integer k. 
We will be iterating through array a from left to right, and simultaneously through array b from right to left, 
and looking at pairs (x,y), where x is from a and y is from b. Such pair is called tiny if the concatenation xy 
is strictly less than k.

Your taks is to return the number of tiny pairs that you will encounter during the simultaneous iteration through a and b.

