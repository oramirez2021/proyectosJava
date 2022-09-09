A sawtooth sequence is a sequence of number that alternate between increasing and decreasing. In other words, each element is either strictly greater than it’s neighboring element or strictly less than it’s neighboring elements.

Problem Statement:

Given an array of integers arr, your task is to count the number of contiguous subarrays that represent a sawtooth sequence of at least two elements.

    For arr = [9, 8, 7, 6, 5], the output should be countSawSubarrays(arr) = 4.

Since all the elements are arranged in decreasing order, it won’t be possible to form any sawtooth subarray of length 3 or more. There are 4 possible subarrays containing two elements, so the answer is 4.

    For arr = [10, 10, 10], the output should be countSawSubarrays(arr) = 0.

Since all of the elements are equal, none of subarrays can be sawtooth, so the answer is 0.

    For arr = [1, 2, 1, 2, 1], the output should be countSawSubarrays(arr) = 10.

All contiguous subarrays containing at least two elements satisfy the condition of the problem. There are 10 possible contiguous subarrays containing at least two elements, so the answer is 10.

Input:

An array of integers

Output:

    return the number of sawtooth subarrays.