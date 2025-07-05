# [4. Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

**Difficulty:** Hard
  
**Topics:** Array, Binary Search, Divide and Conquer

## Problem

<p>Given two sorted arrays <code>nums1</code> and <code>nums2</code> of size <code>m</code> and <code>n</code> respectively, return <strong>the median</strong> of the two sorted arrays.</p>

<p>The overall run time complexity should be <code>O(log (m+n))</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [1,3], nums2 = [2]
<strong>Output:</strong> 2.00000
<strong>Explanation:</strong> merged array = [1,2,3] and median is 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [1,2], nums2 = [3,4]
<strong>Output:</strong> 2.50000
<strong>Explanation:</strong> merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>nums1.length == m</code></li>
	<li><code>nums2.length == n</code></li>
	<li><code>0 &lt;= m &lt;= 1000</code></li>
	<li><code>0 &lt;= n &lt;= 1000</code></li>
	<li><code>1 &lt;= m + n &lt;= 2000</code></li>
	<li><code>-10<sup>6</sup> &lt;= nums1[i], nums2[i] &lt;= 10<sup>6</sup></code></li>
</ul>

## Submissions

| # | File | Language | Status | Runtime | Memory | Submitted |
|---|------|----------|--------|---------|--------|-----------|
| 1 | [median-of-two-sorted-arrays.java](median-of-two-sorted-arrays.java) | Java | Accepted | 6 ms (beats 24.6%) | 46 MB (beats 100.0%) | 2024-12-07 |
| 2 | [2-median-of-two-sorted-arrays.java](2-median-of-two-sorted-arrays.java) | Java | Accepted | 2 ms (beats 44.2%) | 46.3 MB (beats 100.0%) | 2025-07-05 |

<sub>Synced by LeetSync</sub>
